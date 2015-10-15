# instructions for setting up the getOrder/createOrder python/java apps on your raspberry pi

This guide assume your touch screen is working already.

Run the following apt-get scripts on your machine :

sudo apt-get install python-imaging
sudo apt-get install python-imaging-tk
sudo apt-get install python-lxml
sudo apt-get install python-picamera
Sudo raspi-config // option 5, if you want working camera. Not required though

Run the following to set up the two apps :

sh> sudo mkdir /usr/local/epri
sh> chmod gou+r -R /usr/local/epri
sh> cp *.desktop /home/pi/Desktop (directory)

Installing the Rest Request code

sh> cd /usr/local/epri (where ever you installed this code)
sh> sudo python get-pip.py 
sh> sudo pip install requests

If you don't have X running on your touch screen...

startx   # should see items on you desktop. Double-click them

I found that I had to double-click sometimes more than once with my finger on touch screen
to get app to come up. In spite of twirling 'wait' icon

NEW

there is now a config.xml file :

It contains instructions on setting variables for use by create and get. Read it and
edit it!

Notes:

This demo code consists of parts. They are
1. the epri soap server that implements create and get
2. a simple python web server to which the local create app posts photos
3. a tomcat static file storage site, where the images uploaded by (2) are served
4. your camera

These are all points of failure. I've tried to minimize the possibility of failure,
and have provided error messages where possible and appropriate. Things that may
occur:

1. You have no camera, camera is broke
	 result - default picture of puppy!
2. remote jpg file upload server down, unreachable
	result - I have stored puppy image in the tomcat static site as testimage.jpg.
	the url given for the create corresponds to the url of that image
3. remote epri server down
	result - I return error message/code
4. you have your own url for the image
	result - the app will upload the url you provide. Serving it is NMP.


