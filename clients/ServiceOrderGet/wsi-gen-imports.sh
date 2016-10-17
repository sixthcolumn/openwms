#!/bin/ksh
# Note : you need to point the url to a working epri-61968-6 server

wsimport -d generated-sources -keep http://localhost:8080/epri-61968-6/ServiceOrdersGet?wsdl
