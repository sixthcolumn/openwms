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
sh> vi /usr/local/epri/createMaintOrder.py // change the url
sh> vi /usr/local/epri/getMaintOrder.py // change the url


If you don't have X running on your touch screen...

startx   # should see items on you desktop. Double-click them

I found that I had to double-click sometimes more than once with my finger on touch screen
to get app to come up. In spite of twirling 'wait' icon
