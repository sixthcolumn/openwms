#!/usr/bin/python
# -*- coding: iso-8859-1 -*-

import Tkinter
from PIL import Image, ImageTk
from Tkinter import *
import PIL.Image
#import picamera
import uuid

class simpleapp_tk(Tkinter.Tk):
    def __init__(self,parent):
        Tkinter.Tk.__init__(self,parent)
        self.parent = parent
        self.initialize()

    def initialize(self):
        self.grid()
        
        #vscrollbar = Scrollbar(self, orient=VERTICAL)
        #hscrollbar = Scrollbar(self, orient=HORIZONTAL)
        
        b1 = Tkinter.Button(self,text=u"New",
                                command=self.OnButtonClick)
        b1.grid(column=1,row=0)
        
        b2 = Tkinter.Button(self,text=u"GPS",
                                command=self.OnB2Click)
        b2.grid(column=2,row=0)
        
        b3 = Tkinter.Button(self,text=u"Camera",
                                command=self.OnCameraClick)
        b3.grid(column=3,row=0)
        
        b4 = Tkinter.Button(self,text=u"Send",
                                command=self.OnButtonClick)
        b4.grid(column=4,row=0)   
        
        l2 = Tkinter.Label(self, text=u"GPS:")
        l2.grid(column=1,row=1)
        
        self.gpsVariable = Tkinter.StringVar()
        self.gps = Tkinter.Entry(self,textvariable=self.gpsVariable,state="disabled")
        self.gps.grid(column=2,row=1,columnspan=3,stick='EW')
        self.gpsVariable.set(u"<Press GPS Button>")
        
        l3 = Tkinter.Label(self, text=u"ADDR1:")
        l3.grid(column=1,row=2,sticky='EW')
    
        self.addr1Variable = Tkinter.StringVar()
        self.addr1 = Tkinter.Entry(self,textvariable=self.addr1Variable)
        self.addr1.grid(column=2,row=2,columnspan=3,sticky='EW')
        
        l4 = Tkinter.Label(self, text=u"CITY:")
        l4.grid(column=1,row=3,sticky='EW')

        self.cityVariable = Tkinter.StringVar()
        self.city = Tkinter.Entry(self, textvariable=self.cityVariable)
        self.city.grid(column=2,row=3,columnspan=3,sticky='EW')
        
        l5 = Tkinter.Label(self, text=u"STATE:")
        l5.grid(column=1,row=4,sticky='EW')
        
        self.stateVariable = Tkinter.StringVar()
        self.state = Tkinter.Entry(self, textvariable=self.stateVariable)
        self.state.grid(column=2,row=4,columnspan=3,stick='EW')
        
        self.grid_columnconfigure(0,weight=1)
        self.resizable(True,True)
        self.update()
        self.geometry(self.geometry())       

    def OnB2Click(self):
        self.gpsVariable.set("35.8003472, -78.7810633" )
        self.gps.focus_set()
        self.gps.selection_range(0, Tkinter.END)

    def OnCameraClick(self):
        id = str(uuid.uuid4()) + ".jpg"
        #camera = picamera.PiCamera()
        #camera.capture(id)

        img = PIL.Image.open("image.jpg")
        resized = img.resize((300,200), PIL.Image.ANTIALIAS)
        image = ImageTk.PhotoImage(resized)
        
        win2 = Tkinter.TopLevel()
        win2.grid()
        panel2 = Tkinter.Label(win2, image=image)
        panel2.pack(side=tk.TOP, fill=tk.BOTH, expand=tk.YES)
        imglabel = Tkinter.Label(self,image=img).grid(column=1,row=5,columnspan=4,stick='EW')
        #self.grid_columnconfigure(0,weight=1)
        #self.resizable(True,True)
        #self.update()
        #self.geometry(self.geometry())  
            
        
    def OnButtonClick(self):
        id = str(uuid.uuid4()) + ".jpg"
        camera = picamera.PiCamera()
        camera.capture(id)


    def OnPressEnter(self,event):
        self.labelVariable.set( self.entryVariable.get()+" (You pressed ENTER)" )
        self.entry.focus_set()
        self.entry.selection_range(0, Tkinter.END)

if __name__ == "__main__":
    app = simpleapp_tk(None)
    app.title('my application')
    app.mainloop()
