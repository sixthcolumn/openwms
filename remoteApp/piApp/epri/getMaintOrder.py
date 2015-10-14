import Tkinter as tki
import sys
from ScrolledText import ScrolledText
import subprocess
from fcntl import fcntl, F_GETFL, F_SETFL
from os import O_NONBLOCK, read
import lxml
from lxml import etree
from lxml.builder import ElementMaker

class App(object):

    def __init__(self):
        self.root = tki.Tk()
	self.root.geometry("300x200")

    # does xpath var exist?
        def isValidXml(xml, xpathString):
	    r = xml.xpath(xpathString)
	    if( len(r) > 0):
	        return True
	    return False

        try:
            with open ("config.xml","r") as myfile:
                data=myfile.read()
                rxml = etree.fromstring(data)
	        # url base required!
	        isValidXml(rxml, "//root/urlBase")
	        if( isValidXml(rxml, "//root/urlBase") == False):
	            print "url not set in config file. Exiting..."
	            sys.exit(2)
                self.url = rxml.xpath("//root/urlBase")[0].text
    
        except:
            print "unable to load config. Exiting..."
            sys.exit(1)


    # id search bar
	bbar = tki.Frame(self.root)
	bbar.pack(fill=tki.X)
	l1 = tki.Label(bbar,text=u"ID:")
	l1.pack(side="left")

	self.mridVar = tki.StringVar()
	self.mrid = tki.Entry(bbar,textvariable=self.mridVar)
	self.mrid.pack(side="left",expand=1,fill=tki.BOTH)

	# load default mrid if set in file
	if( isValidXml(rxml, "//root/defaultMrid") ):
	    mridDefault = rxml.xpath("//root/defaultMrid")[0].text
	    self.mridVar.set(mridDefault)


    # create a Text widget with a Scrollbar attached
        self.txt = ScrolledText(self.root, undo=True, width=20,height=8)
        self.txt['font'] = ('courrier', '8')
        #self.txt['font'] = ('consolas', '12')
	self.txt.pack(fill="both")

    # get and exit buttons
	bbar = tki.Frame(self.root)
	bbar.pack(fill="x",expand=1)

	b1 = tki.Button(bbar,text=u"Get Order",command=self.getOrder)
	b1.pack(side="left",fill="x",expand=1)

	b2 = tki.Button(bbar,text=u"Exit",command=self.exitButtonClicked)
	b2.pack(side="left",expand=1,fill="x")

    # exit program
    def exitButtonClicked(self):
	exit(0)


    # get maint order
    def getOrder(self):
	self.txt.insert(tki.INSERT,"Sending...")
	self.send = subprocess.Popen(["java","-jar",
		"getMaintOrder.jar",
		self.url + "MaintOrderServiceGet",
		self.mridVar.get()],
		stdout=subprocess.PIPE)

	flags = fcntl(self.send.stdout, F_GETFL)
        fcntl(self.send.stdout, F_SETFL, flags | O_NONBLOCK)
        def callback():
            try:
                data = read(self.send.stdout.fileno(), 20)
                dataOut = data
		self.txt.delete('1.0',tki.END)
                while True:
                    if data == '':
                        outputResult(dataOut)
			print dataOut
                        break
                    data = read(self.send.stdout.fileno(), 1024)
                    dataOut += data
            except OSError:
                    self.txt.insert(tki.END,'.')
                    self.root.after(1000, callback)

        self.root.after(1000,callback)

	def outputValue(label, string, xml):
	    searchString = '//*[local-name() = \'' + string + '\']';
	    r = xml.xpath(searchString)
	    if len(r) > 0:
		self.txt.insert(tki.END,label + r[0].text + "\n")


	# print results to text
	def outputResult(xmlString):
	    try:
	        print xmlString
	        rxml = etree.fromstring(xmlString)

	        print xmlString
	        outputValue("MRID: ", "mRID", rxml)
	        outputValue("Kind: ", "kind", rxml)
	        outputValue("Last Mod: ", "lastModifiedDateTime", rxml)
	        outputValue("requested: ", "requestedDateTime", rxml)
	        outputValue("Status: ", "statusKind", rxml)
	        outputValue("Created: ", "createdDateTime", rxml)
	        outputValue("Reason: ", "reason", rxml)
	        outputValue("Severity: ", "severity", rxml)
	        outputValue("Type: ", "type", rxml)
	        self.txt.insert(tki.END,"\nInternal Loc:\n")
	        outputValue("   Name: ", "BuildingName", rxml)
	        outputValue("   Number: ", "BuildingNumber", rxml)
	        outputValue("   Floor: ", "Floor", rxml)
	        outputValue("   Room: ", "RoomNumber", rxml)
	    except:
		self.txt.insert(tki.END,"Operation Failed:\n\n" + xmlString)
	    

app = App()
app.root.mainloop()
