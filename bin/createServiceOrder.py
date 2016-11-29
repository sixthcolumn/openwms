#from Tkinter import ttk as tk
import Tkinter as tk
import ttk as ttk;
import sys
#from Tkinter import *
#import picamera
import uuid
import os.path
#import ImageTk, Image
from PIL import Image, ImageTk
import lxml
from lxml import etree
from lxml.builder import ElementMaker
import subprocess
from fcntl import fcntl, F_GETFL, F_SETFL
from os import O_NONBLOCK, read
import requests
import logging
from time import strftime
import tkMessageBox


class Example(tk.Frame):
    def __init__(self, root):


        def getConfigValue(tree, xpathString, isFail, defaultValue=""):
            r = tree.xpath(xpathString)
            if( len(r) > 0):
                s = tree.xpath(xpathString)[0].text
                print "Loaded value for " + xpathString + ", " + s
                return s
            elif isFail == True:
                print "Failed to load value for " + xpathString + "Exit with exception"
                raise ValueError("Could not find/parse " + xpathString)
            else:
                print "failed to load value for " + xpathString + ". Setting default of " + defaultValue
                return defaultValue

        # Read everything from config.xml. Note, will error out
        # if some fields are not found
        try:
            with open ("config.xml","r") as myfile:
                data=myfile.read()
                print "data :" + data
                rxml = etree.fromstring(data)
                self.url = getConfigValue(rxml, "//root/urlBase", True)
                self.defaultImage = getConfigValue(rxml, "//root/defaultImageFile", True)
                self.imageServer = getConfigValue(rxml, "//root/imageServer", True)
                self.upload = getConfigValue(rxml, "//root/imageUploadServer", True)
                self.headerComment = getConfigValue(rxml, "//header/comment", False, "Epri Test")
                self.headerContext = getConfigValue(rxml, "//header/context", False, "CTX1")
                self.headerOrganization = getConfigValue(rxml, "//header/organization", False, "Epri")
                self.headerRevision = getConfigValue(rxml, "//header/revision", False, "0.1a")
                self.headerSource = getConfigValue(rxml, "//header/source", False, "Epri")
                self.headerUserID = getConfigValue(rxml, "//header/userid", False, "epriuser")

                # default on photo upload is off unless set
                self.uploadStatus = 'off'
                r = rxml.xpath("//root/imageUploadServer/@status")[0]
                if len(r) > 0:
                    self.uploadStatus = rxml.xpath("//root/imageUploadServer/@status")[0]
        except Exception, e:
            print "config error : " + str(e)
            print "unable to load config. Exiting..."
            sys.exit(1)

        tk.Frame.__init__(self, root)
        root.geometry("300x200")


        self.canvas = tk.Canvas(root, borderwidth=0, background="#ffffff")
        self.frame = tk.Frame(self.canvas)
        self.vsb = tk.Scrollbar(root, orient="vertical", command=self.canvas.yview)
        self.canvas.configure(yscrollcommand=self.vsb.set)

        self.vsb.pack(side="right", fill="y")
        self.canvas.pack(side="left", fill="both", expand=True)
        self.canvas.create_window((4,4), window=self.frame, anchor="nw", 
                                  tags="self.frame", width=280)

        self.frame.bind("<Configure>", self.onFrameConfigure)

        self.initialize()

    def initialize(self):
        self.grid(sticky='EW')


        crow = 0

        # Exit
        io = Image.open('io.png')
        self.ioIcon = ImageTk.PhotoImage(io)
        b1 = tk.Button(self.frame,image=self.ioIcon, command=self.onExitButtonClick,width=62)
        b1.grid(column=1,row=crow,sticky='EW')
        b1.grid_columnconfigure(1,weight=1)

        # get gps coords
        si = Image.open('gps3.png')
        self.gpsIcon = ImageTk.PhotoImage(si)
        b2 = tk.Button(self.frame,image=self.gpsIcon, command=self.OnGPSButtonClick,width=62)
        b2.grid(column=2,row=crow,sticky='EW')
        b1.grid_columnconfigure(2,weight=1)

        # take a picture
        ci = Image.open('camera44.png')
        self.cameraIcon = ImageTk.PhotoImage(ci)
        b3 = tk.Button(self.frame,image=self.cameraIcon,command=self.OnCameraClick,width=62)
        b3.grid(column=3,row=crow,sticky='EW')
        b1.grid_columnconfigure(3,weight=1)

        # send the service order
        mi = Image.open('message.png')
        self.messageIcon = ImageTk.PhotoImage(mi)
        b4 = tk.Button(self.frame,image=self.messageIcon, command=self.OnSendClick,width=62)
        b4.grid(column=4,row=crow,sticky='EW')
        b1.grid_columnconfigure(4,weight=1)

        #
        # General Section
        #
        crow += 1
        gen = tk.LabelFrame(self.frame,text=u"General")
        gen.grid(column=1,row=crow,columnspan=4,sticky='EW')
        gen.grid_columnconfigure(2,weight=1)

        crow2 = 0
        self.gps, self.gpsVariable, crow2 = self.buildEntry(gen, "GPS:", crow2)
        self.image, self.imageVariable, crow2 = self.buildEntry(gen, "Image:", crow2)

        # priority select box
        #self.priority, self.priorityVariable, crow2 = self.buildEntry(gen, "Priority:", crow2)
        label = tk.Label(gen, text="Priority:", anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')
        self.priorityVariable = tk.StringVar()
        self.priority = ttk.Combobox(gen, textvariable=self.priorityVariable)
        self.priority['values'] = ('Low', 'Normal', 'High', 'Emergency')
        self.priority.current(0)
        self.priority.grid(column=2,row=crow2,columnspan=3,sticky='EW')
        crow2 +=1

        # reason select box
        # self.reason, self.reasonVariable, crow2 = self.buildEntry(gen, "Reason:", crow2)
        label = tk.Label(gen, text="Reason:", anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')
        self.reasonVariable = tk.StringVar()
        self.reason = ttk.Combobox(gen, textvariable=self.reasonVariable)
        self.reason['values'] = ('Calibration', 'Damage', 'Inspection', 'Move in', 'Move out')
        self.reason.current(0)
        self.reason.grid(column=2,row=crow2,columnspan=3,sticky='EW')
        crow2 +=1

        # severity select box
        # self.severity, self.severityVariable, crow2 = self.buildEntry(gen, "Severity:", crow2)
        label = tk.Label(gen, text="Severity:", anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')
        self.severityVariable = tk.StringVar()
        self.severity = ttk.Combobox(gen, textvariable=self.severityVariable)
        self.severity['values'] = ('Minor', 'Normal', 'Severe')
        self.severity.current(0)
        self.severity.grid(column=2,row=crow2,columnspan=3,sticky='EW')
        crow2 +=1



        self.type, self.typeVariable, crow2 = self.buildEntry(gen, "Type:", crow2)

        crow += 1
        crow2=0
        task = tk.LabelFrame(self.frame,text=u"Task")
        task.grid(column=1,row=crow,columnspan=4,sticky='EW')
        task.grid_columnconfigure(2,weight=1)


        # task kind combo box
        label = tk.Label(task, text="Task:", anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')
        self.taskKindVariable = tk.StringVar()
        self.taskKind = ttk.Combobox(task, textvariable=self.taskKindVariable)
        self.taskKind['values'] = ('exchange', 'install', 'investigate', 'remove')
        self.taskKind.current(0)
        self.taskKind.grid(column=2,row=crow2,columnspan=3,sticky='EW')
        crow2 += 1

        # task status combo box
        label = tk.Label(task, text="Status:", anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')
        self.taskStatusVariable = tk.StringVar()
        self.taskStatus = ttk.Combobox(task, textvariable=self.taskStatusVariable)
        self.taskStatus['values'] = ('approved', 'cancelled', 'closed', 'completed', 'dispatched', 'enroute',
            'inProgress','onSite','scheduled','waitingOnApproval','waitingOnMaterial','waitingtoBeScheduled'
        )
        self.taskStatus.current(0)
        self.taskStatus.grid(column=2,row=crow2,columnspan=3,sticky='EW')


        # Asset frame
        crow += 1
        crow2 = 0
        asset = tk.LabelFrame(self.frame,text=u"Asset")
        asset.grid(column=1,row=crow,columnspan=4,sticky='EW')
        asset.grid_columnconfigure(2,weight=1)

        self.assetMRID, self.assetMRIDVariable, crow2 = self.buildEntry(asset, "MRID:", crow2)
        self.assetUTC, self.assetUTCVariable, crow2 = self.buildEntry(asset, "UTC:", crow2)

        #
        # address frame
        #
        crow += 1
        ad = tk.LabelFrame(self.frame,text=u"Address")
        ad.grid(column=1,row=crow,columnspan=4,sticky='EW')
        ad.grid_columnconfigure(2,weight=1)

        crow2=0
        self.genAddr, self.genAddrVariable, crow2 = self.buildEntry(ad, "Address:", crow2)
        self.zipcode, self.zipcodeVariable, crow2 = self.buildEntry(ad, "Zipcode:", crow2)
        self.townCode, self.townCodeVariable, crow2 = self.buildEntry(ad, "City/Town:", crow2)
        self.state, self.stateVariable, crow2 = self.buildEntry(ad, "State:", crow2)


        #
        # Internal Location
        #
        crow += 1
        loc = tk.LabelFrame(self.frame,text=u"Internal Location")
        loc.grid(column=1,row=crow,columnspan=4,sticky='EW')
        loc.grid_columnconfigure(2,weight=1)

        crow2=0
        self.bldgName, self.bldgNameVariable, crow2 = self.buildEntry(loc, "Bldg Name:", crow2)
        self.bldgNum, self.bldgNumVariable, crow2 = self.buildEntry(loc, "Bldg Num:", crow2)
        self.bldgFloor, self.bldgFloorVariable, crow2 = self.buildEntry(loc, "Floor:", crow2)
        self.bldgRoom, self.bldgRoomVariable, crow2 = self.buildEntry(loc, "Room:", crow2)

    def buildEntry(self, parent, label, curRow):
        label = tk.Label(parent, text=label, anchor='e')
        label.grid(column=1,row=curRow,sticky='EW')
        stringVar = tk.StringVar()

        entryVar = tk.Entry(parent, textvariable=stringVar)
        entryVar.grid(column=2,row=curRow,columnspan=3,sticky='EW')

        return entryVar, stringVar, curRow+1

    #
    # GPS dialog
    #
    def OnGPSButtonClick(self):
        self.gpsVariable.set("35.8003472, -78.7810633" )
        self.gps.focus_set()
        self.gps.selection_range(0, tk.END)
        
        # pop up an address selection list
        self.top = tk.Toplevel()

        self.label = tk.Label(self.top, text="Coords: 35.8003472, -78.7810633").grid(row=0,sticky="W")
        self.label = tk.Label(self.top, text="Nearby Addresses").grid(row=1, stick="W")

        self.addrList = tk.Listbox(self.top, width=50,  height=6)
        self.addrList.grid(row=3, column=0, rowspan=4, columnspan=2, sticky="EW")
        self.addrList.insert(1, "100 Easton Street")
        self.addrList.insert(2, "102 Easton Street")
        self.addrList.insert(3, "1475 Bauer Lane")
        self.addrList.insert(4, "1477 Bauer Lane")
        self.addrList.insert(6, "1466 Bauer Lane")
        self.addrList.insert(7, "12 Rock Ct")


        bbar = tk.Frame(self.top)
        b1 = tk.Button(bbar,text=u"OK", command=self.OnSaveGPSButtonClick)
        b1.pack(side="left",fill="both",expand=1)
        b1 = tk.Button(bbar,text=u"Cancel", command=self.OnCancelGPSButtonClick)
        b1.pack(side="left",fill="both",expand=1)
        bbar.grid(row=8,sticky="EW")

        self.top.geometry("300x200")

    def OnCancelGPSButtonClick(self):
        self.top.destroy()

    def OnSaveGPSButtonClick(self):
        items = map(int, self.addrList.curselection())
        if len(items) == 1:
            self.genAddrVariable.set(self.addrList.get(items[0]))
            self.townCodeVariable.set("Cary")
            self.stateVariable.set("NC")
            self.zipcodeVariable.set("27513")
            self.top.destroy()

    #
    # Camera dialog
    #
    def OnCameraClick(self):
        # taking pic
        self.imageFile = strftime("%Y%m%d%H%M%S") + ".jpg"
        print self.imageFile
        #self.imageFile = str(uuid.uuid4()) + ".jpg"
        try:
            camera = picamera.PiCamera()
            camera.capture(self.imageFile)
        except Exception, e:
            print "taking pic error : " + str(e)
            self.imageFile = 'testimage.jpg'
        self.topCam = tk.Toplevel()
        # todo : temp below for testing
        #self.imageFile = "/home/pi/wms/004ce28b-d087-4ed1-b6e0-91fc0b2db8e3.jpg"
        unsizedImage = Image.open(self.imageFile)
        resized = unsizedImage.resize((200,140), Image.ANTIALIAS)
        img = ImageTk.PhotoImage(resized)

        
        imglabel = tk.Label(self.topCam,image=img)
        imglabel.image = img
        imglabel.pack(fill="both") #, expand=1)

        bbar = tk.Frame(self.topCam)
        bbar.pack(fill="both",expand=1)

        b1 = tk.Button(bbar,text=u"OK", command=self.OnSavePicButtonClick)
        b1.pack(side="left",fill="x",expand=1)
        b1 = tk.Button(bbar,text=u"Cancel", command=self.OnCancelPicButtonClick)
        b1.pack(side="left",fill="x",expand=1)

        # get the image size
        w = img.width()
        h = img.height()

        # position coordinates of root 'upper left corner'
        x = 0
        y = 0

        # make the root window the size of the image
        self.topCam.geometry("300x240")
	print "cam created"

    def OnSavePicButtonClick(self):
	print "save pressed"
        jpgName = os.path.basename(self.imageFile)
        if self.uploadStatus == 'on':
            try:
                print 'uploading image...'
                print 'url : ' + self.upload + ', imagefile : ' + self.imageFile
                r = requests.post(self.upload, files={self.imageFile: open(self.imageFile, 'rb')})
                self.topCam.destroy()      
                if( r.status_code == 200 ):
                    tkMessageBox.showinfo("Image Upload", "Image has been uploaded to server")
                else:
                    tkMessageBox.showerror("Image Upload", "Imager upload failed with code : " + r.status_code)

            except Exception, e:
                logging.warning('post failed. Server may be down. using default image')
                tkMessageBox.showerror("Image Upload failed", str(e))
                self.topCam.destroy()      
        ## todo : this is temp because we don't upload actual images, default image
        self.imageVariable.set(self.imageServer + '/' + jpgName)
        self.image.focus_set()
        self.image.selection_range(0, tk.END)
        self.topCam.destroy()      


    def OnCancelPicButtonClick(self):
        self.topCam.destroy()

    def OnSendClick(self):


        ## xml creation
        E = ElementMaker()
        orderData = E.orderData
        REASON = E.reason
        SEVERITY = E.severity
        if not self.type.get():
            self.typeVariable.set("NOT SET")

        my_doc = orderData(
            E.header(
                E.comment(self.headerComment),
                E.context(self.headerContext),
                E.organization(self.headerOrganization),
                E.revision(self.headerRevision),
                E.source(self.headerSource),
                E.userid(self.headerUserID),
                E.verb("create"),
                E.noun("service order")
            ),
            E.iloc(
                E.buildingName(self.bldgNameVariable.get()),
                E.buildingNumber(self.bldgNumVariable.get()),
                E.floor(self.bldgFloorVariable.get()),
                E.roomNumber(self.bldgRoomVariable.get())
            ),
            E.address(
                E.general(self.genAddrVariable.get()),
                E.city(self.townCodeVariable.get()),
                E.state(self.stateVariable.get()),
                E.code(self.zipcodeVariable.get())
            ),
            E.reason(self.reasonVariable.get()),
            E.severity(self.severityVariable.get()),
            E.type(self.type.get()),
            E.taskSubject('new task'),
            E.taskKind(self.taskKind.get()),
            E.taskStatus(self.taskStatus.get()),
            E.imageFile(self.imageVariable.get()),
            E.assetID(self.assetMRIDVariable.get()),
            E.assetUTC(self.assetUTCVariable.get())
        )

        self.top2 = tk.Toplevel()

        text = tk.Text(self.top2,height=8,width=50)
        text.pack(fill=tk.BOTH,expand=True)
        text.insert(tk.END,"Sending...")

        b1 = tk.Button(self.top2,text=u"OK", command=self.top2.destroy)
        b1.pack(fill=tk.X)

        self.top2.geometry("300x200")

        print etree.tostring(my_doc,pretty_print=True)

        # We're gonna call the java program and then
        # do a non-blocking read on it
        print "calling : " + self.url + "ServiceOrderCreate"
        print "sending : " + etree.tostring(my_doc)
        self.send = subprocess.Popen(["java",
                "-jar",
                "createServiceOrder.jar",
                self.url + "ServiceOrderCreate",
                etree.tostring(my_doc)],
                stdout=subprocess.PIPE)
        flags = fcntl(self.send.stdout, F_GETFL)
        fcntl(self.send.stdout, F_SETFL, flags | O_NONBLOCK)
        def callback():
            try:
                data = read(self.send.stdout.fileno(), 20)
                dataOut = data
                text.insert(tk.END,'\n')
                while True:
                    if data == '':
                        outputResult(dataOut)
                        break
                    data = read(self.send.stdout.fileno(), 1024)
                    dataOut += data
            except OSError:     
                    text.insert(tk.END,'.')
                    self.after(1000, callback)

        root.after(1000,callback)


        def outputResult(xmlString):
            try:
                rxml = etree.fromstring(xmlString)
                resultCode = rxml.xpath("//orders/Result")[0].text
                if resultCode == 'Error':
                    text.insert(tk.END,"Operation Failed:")
                    msg = rxml.xpath("//orders/Reason")[0].text
                    text.insert(tk.END,"\n\n" + msg)
                else:
                    text.insert(tk.END,"Result : " + rxml.xpath("//orders/Result")[0].text)
                    text.insert(tk.END,"\n\n" + rxml.xpath("//orders/ID")[0].text)
                    print tk.END,"\n\n" + rxml.xpath("//orders/ID")[0].text
            except: # catch all
                text.insert(tk.END,"Operation Failed:\n\n" + xmlString);

    def test_io_watch(f, cond):
        out = f.read();
        if out == '':
            return False;
        print out
        return True

    def OnButtonClick(self):
        id = str(uuid.uuid4()) + ".jpg"
        camera = picamera.PiCamera()
        camera.capture(id)

        '''Put in some fake data
        for row in range(100):
            tk.Label(self.frame, text="%s" % row, width=3, borderwidth="1", 
                     relief="solid").grid(row=row, column=0)
            t="this is the second column for row %s" %row
            tk.Label(self.frame, text=t).grid(row=row, column=1)
        '''

    def onFrameConfigure(self, event):
        '''Reset the scroll region to encompass the inner frame'''
        self.canvas.configure(scrollregion=self.canvas.bbox("all"))


    def onExitButtonClick(self):
        sys.exit(0)

if __name__ == "__main__":

    root=tk.Tk()
    Example(root).pack(side="top", fill="both", expand=True)
    root.mainloop()
