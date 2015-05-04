#
# epri.mysql is a dump of existing DB. it should create all for you
# once you set up the database
#

# commands to set up the database after you've started mysql

# to login as root
mysql -u root

# create epri user
mysql> create database epri;

# create epri user login, give perms to epri database
mysql> grant all on epri.* to epri@localhost identified by 'epri';

# login to database to create scripts and tables
mysql --user=epri --password=epri epri

# to see tables
mysql> show tables;

