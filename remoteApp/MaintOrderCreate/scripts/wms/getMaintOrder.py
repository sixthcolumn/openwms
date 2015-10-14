# Python 2.7
import Tkinter as tki
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

    # id search bar
	bbar = tki.Frame(self.root)
	bbar.pack(fill=tki.X)
	l1 = tki.Label(bbar,text=u"ID:")
	l1.pack(side="left")

	self.mridVar = tki.StringVar()
	self.mrid = tki.Entry(bbar,textvariable=self.mridVar)
	self.mrid.pack(side="left",expand=1,fill=tki.BOTH)


    # create a Text widget with a Scrollbar attached
        self.txt = ScrolledText(self.root, undo=True, width=20,height=12)
        self.txt['font'] = ('courrier', '8')
        #self.txt['font'] = ('consolas', '12')
	self.txt.pack(fill="both")

	#self.txt.insert(tki.END,'hello everybody\nreally please no\n')
	#self.txt.tag_add('demo', '1.1', '1.5')
	#self.txt.tag_add('demo', '2.0', '2.3')
	#self.txt.tag_config('demo', font=('times', 14, 'bold'))

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
		"http://10.3.253.100:8080/epriConnect/MaintOrderServiceGet",
		'xxx65452368-507d-4565-b2d7-d6550404bea1'],
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

	    

app = App()
app.root.mainloop()
