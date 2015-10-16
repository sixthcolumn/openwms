import Tkinter as tk
import sys
from Tkinter import *
import picamera
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


class Example(tk.Frame):
    def __init__(self, root):

	try:
	    with open ("config.xml","r") as myfile:
                data=myfile.read()
	        print "data :" + data
                rxml = etree.fromstring(data)
                self.url = rxml.xpath("//root/urlBase")[0].text
                self.defaultImage = rxml.xpath("//root/defaultImageFile")[0].text
		self.imageServer = rxml.xpath("//root/imageServer")[0].text
		self.upload = rxml.xpath("//root/imageUploadServer")[0].text

		# default on photo upload is off unless set
		self.uploadStatus = 'off'
		r = rxml.xpath("//root/imageUploadServer/@status")[0]
		if len(r) > 0:
		    self.uploadStatus = rxml.xpath("//root/imageUploadServer/@status")[0]
        except:
	    print "unable to load config. Exiting..."
	    sys.exit(1)

        tk.Frame.__init__(self, root)
	root.geometry("300x200")


        self.canvas = tk.Canvas(root, borderwidth=0, background="#ffffff")
        self.frame = tk.Frame(self.canvas, background="blue")
        self.vsb = tk.Scrollbar(root, orient="vertical", command=self.canvas.yview)
        self.canvas.configure(yscrollcommand=self.vsb.set)

        self.vsb.pack(side="right", fill="y")
        self.canvas.pack(side="left", fill="both", expand=True)
        self.canvas.create_window((4,4), window=self.frame, anchor="nw", 
                                  tags="self.frame")

        self.frame.bind("<Configure>", self.onFrameConfigure)

        self.initialize()

    def initialize(self):
	self.grid()

	crow = 0

	# clean up, do a new maintenance order
	io = Image.open('io.png')
	self.ioIcon = ImageTk.PhotoImage(io)
        b1 = tk.Button(self.frame,image=self.ioIcon, command=self.onExitButtonClick)
        b1.grid(column=1,row=crow,sticky='EW')

	# get gps coords
	si = Image.open('gps3.png')
	self.gpsIcon = ImageTk.PhotoImage(si)
        b2 = tk.Button(self.frame,image=self.gpsIcon, command=self.OnB2Click)
        b2.grid(column=2,row=crow,sticky='EW')

	# take a picture
	ci = Image.open('camera44.png')
	self.cameraIcon = ImageTk.PhotoImage(ci)
        b3 = tk.Button(self.frame,image=self.cameraIcon,command=self.OnCameraClick)
        b3.grid(column=3,row=crow,sticky='EW')

	# send the maintenance order
	mi = Image.open('message.png')
	self.messageIcon = ImageTk.PhotoImage(mi)
        b4 = tk.Button(self.frame,image=self.messageIcon, command=self.OnSendClick)
        b4.grid(column=4,row=crow,sticky='EW')

	crow += 1

	# GPS
	l1 = tk.Label(self.frame,text=u"GPS:",anchor='e')
	l1.grid(column=1,row=crow,sticky='EW')
        self.gpsVariable = tk.StringVar()
        self.gps = tk.Entry(self.frame,textvariable=self.gpsVariable,width=25)
        self.gps.grid(column=2,row=crow,columnspan=3,sticky='EW')

	# image
	crow += 1
	l1 = tk.Label(self.frame,text=u"Image:",anchor='e')
	l1.grid(column=1,row=crow,sticky='EW')
        self.imageVariable = tk.StringVar()
        self.image = tk.Entry(self.frame,textvariable=self.imageVariable)
        self.image.grid(column=2,row=crow,columnspan=3,sticky='EW')
        #self.imageVariable.set(u"<Press GPS Button>")

	# priority
	crow += 1
        l2 = tk.Label(self.frame,text=u"Priority:",anchor='e')
        l2.grid(column=1,row=crow,sticky='EW')
        self.priorityVariable = tk.StringVar()
        self.priority = tk.Entry(self.frame,textvariable=self.priorityVariable)
        self.priority.grid(column=2,row=crow,columnspan=3,sticky='EW')
        #self.priorityVariable.set(u"<Press GPS Button>")	

        # reason
	crow += 1
        l2 = tk.Label(self.frame,text=u"Reason:",anchor='e')
        l2.grid(column=1,row=crow,sticky='EW')
        self.reasonVariable = tk.StringVar()
        self.reason = tk.Entry(self.frame,textvariable=self.reasonVariable)
        self.reason.grid(column=2,row=crow,columnspan=3,sticky='EW')
        #self.reasonVariable.set(u"<Press GPS Button>")

        # severity
	crow += 1
        l2 = tk.Label(self.frame,text=u"Severity:",anchor='e')
        l2.grid(column=1,row=crow,sticky='EW')
        self.severityVariable = tk.StringVar()
        self.severity = tk.Entry(self.frame,textvariable=self.severityVariable)
        self.severity.grid(column=2,row=crow,columnspan=3,sticky='EW')
        #self.severityVariable.set(u"<Press GPS Button>")

        # type
	crow += 1
        l2 = tk.Label(self.frame,text=u"Type:",anchor='e')
        l2.grid(column=1,row=crow,sticky='EW')
        self.typeVariable = tk.StringVar()
        self.type = tk.Entry(self.frame,textvariable=self.typeVariable)
        self.type.grid(column=2,row=crow,columnspan=3,sticky='EW')
        #self.typeVariable.set(u"<Press GPS Button>")

	# address frame
	#crow += 1
	#ad = tk.LabelFrame(self.frame,text=u"Address")
	#ad.grid(column=1,row=crow,columnspan=4,sticky='EW')

	crow += 1
	loc = tk.LabelFrame(self.frame,text=u"Internal Location")
	loc.grid(column=1,row=crow,columnspan=4,sticky='EW')

	crow2=0

	# general
	#label = tk.Label(ad, text="Gen:",anchor='e')
	#label.grid(column=1,row=crow2,sticky='EW')
	
	self.genAddrVariable = tk.StringVar()
	#self.genAddr = tk.Entry(ad, textvariable=self.genAddrVariable,width=25)
	#self.genAddr.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # building name
	#crow2 += 1
        #label = tk.Label(ad, text="Bldg Name:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.bldgVariable = tk.StringVar()
        #self.bldg = tk.Entry(ad, textvariable=self.bldgVariable)
        #self.bldg.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # building code
	#crow2 += 1
        #label = tk.Label(ad, text="Code:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.bldgCodeVariable = tk.StringVar()
        #self.bldgCode = tk.Entry(ad, textvariable=self.bldgCodeVariable)
        #self.bldgCode.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # name
	#crow2 += 1
        #label = tk.Label(ad, text="Name:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.nameVariable = tk.StringVar()
        #self.name = tk.Entry(ad, textvariable=self.nameVariable)
        #self.name.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # number
	#crow2 += 1
        #label = tk.Label(ad, text="Number:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.numVariable = tk.StringVar()
        #self.num = tk.Entry(ad, textvariable=self.numVariable)
        #self.num.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # prefix
	#crow2 += 1
        #label = tk.Label(ad, text="Prefix:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.prefixVariable = tk.StringVar()
        #self.prefix = tk.Entry(ad, textvariable=self.prefixVariable)
        #self.prefix.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # name
	#crow2 += 1
        #label = tk.Label(ad, text="Suffix:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.suffixVariable = tk.StringVar()
        #self.suffix = tk.Entry(ad, textvariable=self.suffixVariable)
        #self.suffix.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # suite
	#crow2 += 1
        #label = tk.Label(ad, text="Suite:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.suiteVariable = tk.StringVar()
        #self.suite = tk.Entry(ad, textvariable=self.suiteVariable)
        #self.suite.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # type
	#crow2 += 1
        #label = tk.Label(ad, text="Type:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.bldgTypeVariable = tk.StringVar()
        #self.bldgType = tk.Entry(ad, textvariable=self.bldgTypeVariable)
        #self.bldgType.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        crow2=0

        # general
        #label = tk.Label(ad, text="Gen:",anchor='e')
        #label.grid(column=1,row=crow2,sticky='EW')

        self.genAddrVariable = tk.StringVar()
        #self.genAddr = tk.Entry(ad, textvariable=self.genAddrVariable)
        #self.genAddr.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        crow2=0

        # building name
        label = tk.Label(loc, text="Bldg Name:",anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')

        self.bldgNameVariable = tk.StringVar()
        self.bldgName = tk.Entry(loc, textvariable=self.bldgNameVariable,width=25)
        self.bldgName.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # building number
	crow2 += 1
        label = tk.Label(loc, text="Bldg Num:",anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')

        self.bldgNumVariable = tk.StringVar()
        self.bldgNum = tk.Entry(loc, textvariable=self.bldgNumVariable)
        self.bldgNum.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # building floor
	crow2 += 1
        label = tk.Label(loc, text="Floor:",anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')

        self.bldgFloorVariable = tk.StringVar()
        self.bldgFloor = tk.Entry(loc, textvariable=self.bldgFloorVariable)
        self.bldgFloor.grid(column=2,row=crow2,columnspan=3,sticky='EW')

        # building floor
	crow2 += 1
        label = tk.Label(loc, text="Room #:",anchor='e')
        label.grid(column=1,row=crow2,sticky='EW')

        self.bldgRoomVariable = tk.StringVar()
        self.roomNum = tk.Entry(loc, textvariable=self.bldgRoomVariable)
        self.roomNum.grid(column=2,row=crow2,columnspan=3,sticky='EW')

    def OnB2Click(self):
        self.gpsVariable.set("35.8003472, -78.7810633" )
        self.gps.focus_set()
        self.gps.selection_range(0, tk.END)

    def OnCameraClick(self):
        self.imageFile = str(uuid.uuid4()) + ".jpg"
	try:
            camera = picamera.PiCamera()
            camera.capture(self.imageFile)
	except:
	    self.imageFile = 'testimage.jpg'
	self.top = tk.Toplevel()
	# todo : temp below for testing
	#self.imageFile = "/home/pi/wms/004ce28b-d087-4ed1-b6e0-91fc0b2db8e3.jpg"
        unsizedImage = Image.open(self.imageFile)
	resized = unsizedImage.resize((200,140), Image.ANTIALIAS)
	img = ImageTk.PhotoImage(resized)

	
        imglabel = tk.Label(self.top,image=img)
	imglabel.image = img
	imglabel.pack(fill="both") #, expand=1)

        bbar = tk.Frame(self.top)
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
        self.top.geometry("300x240")

    def OnSavePicButtonClick(self):
	jpgName = os.path.basename(self.imageFile)
	if self.uploadStatus == 'on':
	    try:
	        print 'uploading image...'
	        r = requests.post(self.upload, files={self.imageFile: open(self.imageFile, 'rb')})
	        print 'image upload complete.'
	    except:
	        logging.warning('post failed. Server may be down. using default image')
	## todo : this is temp because we don't upload actual images, default image
        self.imageVariable.set(self.imageServer + '/' + jpgName)
        self.image.focus_set()
        self.image.selection_range(0, tk.END)
	self.top.destroy()	


    def OnCancelPicButtonClick(self):
	self.top.destroy()

    def OnSendClick(self):

	## xml creation
	E = ElementMaker()
	orderData = E.orderData
	REASON = E.reason
	SEVERITY = E.severity

	my_doc = orderData(
	    E.addr(
		E.general(self.genAddrVariable.get()),
		E.buildingName(self.bldgVariable.get()),
		E.code(self.bldgCodeVariable.get()),
		E.name(self.nameVariable.get()),
		E.number(self.numVariable.get()),
		E.prefix(self.prefixVariable.get()),
		E.suffix(self.suffixVariable.get()),
		E.suite(self.suiteVariable.get()),
		E.type(self.bldgTypeVariable.get()),
	    ),
	    E.header(
		E.comment("Epri Test"),
		E.context("ctx1"),
		E.correlationID("1234-1222"),
		E.noun("work order"),
		E.organization("Epri"),
		E.revision("0.1"),
		E.source("Epri"),
		E.userid("epriuser"),
		E.verb("create")
	    ),
	    E.iloc(
		E.buildingName(self.bldgNameVariable.get()),
		E.buildingNumber(self.bldgNumVariable.get()),
		E.floor(self.bldgFloorVariable.get()),
		E.roomNumber(self.bldgRoomVariable.get())
	    ),
	    E.reason(self.reasonVariable.get()),
	    E.severity(self.severityVariable.get()),
	    E.type(self.type.get()),
	    E.imageFile(self.imageVariable.get())
	)

        self.top2 = tk.Toplevel()
        #self.top2.grid()

        text = Text(self.top2,height=8,width=50)
        #text.grid(column=1,row=0,columnspan=2,sticky='EW')
	text.pack(fill=BOTH,expand=True)
        text.insert(END,"Sending...")

        b1 = tk.Button(self.top2,text=u"OK", command=self.top2.destroy)
        #b1.grid(column=1,row=1,sticky='EW')
	b1.pack(fill=X)

        self.top2.geometry("300x200")

	print etree.tostring(my_doc,pretty_print=True)

	# We're gonna call the java program and then
	# do a non-blocking read on it
	print "calling : " + self.url + "MaintOrderServiceCreate"
	print "sending : " + etree.tostring(my_doc)
	self.send = subprocess.Popen(["java",
		"-jar",
		"createMaintOrder.jar",
		self.url + "MaintOrderServiceCreate",
		etree.tostring(my_doc)],
		stdout=subprocess.PIPE)
	flags = fcntl(self.send.stdout, F_GETFL)
	fcntl(self.send.stdout, F_SETFL, flags | O_NONBLOCK)
	def callback():
	    try:
		data = read(self.send.stdout.fileno(), 20)
		dataOut = data
		text.insert(END,'\n')
		while True:
		    if data == '':
			outputResult(dataOut)
			break
		    data = read(self.send.stdout.fileno(), 1024)
		    dataOut += data
	    except OSError:	
		    text.insert(END,'.')
		    self.after(1000, callback)

	root.after(1000,callback)


	def outputResult(xmlString):
	    try:
	        rxml = etree.fromstring(xmlString)
	        resultCode = rxml.xpath("//orders/Result")[0].text
	        if resultCode == 'Error':
		    text.insert(END,"Operation Failed:")
		    msg = rxml.xpath("//orders/Reason")[0].text
		    text.insert(END,"\n\n" + msg)
	        else:
		    text.insert(END,"Result : " + rxml.xpath("//orders/Result")[0].text)
		    text.insert(END,"\n\n" + rxml.xpath("//orders/ID")[0].text)
	    except: # catch all
		text.insert(END,"Operation Failed:\n\n" + xmlString);

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
