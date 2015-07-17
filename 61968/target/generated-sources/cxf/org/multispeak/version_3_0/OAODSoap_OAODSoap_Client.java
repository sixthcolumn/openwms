
package org.multispeak.version_3_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:33:55.613-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class OAODSoap_OAODSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.multispeak.org/Version_3.0", "OA_OD");

    private OAODSoap_OAODSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = OAOD.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        OAOD ss = new OAOD(wsdlURL, SERVICE_NAME);
        OAODSoap port = ss.getOAODSoap();  
        
        {
        System.out.println("Invoking getActiveOutages...");
        org.multispeak.version_3.ArrayOfString _getActiveOutages__return = port.getActiveOutages();
        System.out.println("getActiveOutages.result=" + _getActiveOutages__return);


        }
        {
        System.out.println("Invoking getAllCircuitElements...");
        java.lang.String _getAllCircuitElements_lastReceived = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getAllCircuitElements__return = port.getAllCircuitElements(_getAllCircuitElements_lastReceived);
        System.out.println("getAllCircuitElements.result=" + _getAllCircuitElements__return);


        }
        {
        System.out.println("Invoking getUplineCircuitElements...");
        java.lang.String _getUplineCircuitElements_eaLoc = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getUplineCircuitElements__return = port.getUplineCircuitElements(_getUplineCircuitElements_eaLoc);
        System.out.println("getUplineCircuitElements.result=" + _getUplineCircuitElements__return);


        }
        {
        System.out.println("Invoking getOutageEventStatus...");
        java.lang.String _getOutageEventStatus_outageEventID = "";
        org.multispeak.version_3.OutageEventStatus _getOutageEventStatus__return = port.getOutageEventStatus(_getOutageEventStatus_outageEventID);
        System.out.println("getOutageEventStatus.result=" + _getOutageEventStatus__return);


        }
        {
        System.out.println("Invoking getSiblingMeterConnectivity...");
        java.lang.String _getSiblingMeterConnectivity_meterNo = "";
        org.multispeak.version_3.ArrayOfMeterConnectivity _getSiblingMeterConnectivity__return = port.getSiblingMeterConnectivity(_getSiblingMeterConnectivity_meterNo);
        System.out.println("getSiblingMeterConnectivity.result=" + _getSiblingMeterConnectivity__return);


        }
        {
        System.out.println("Invoking getChildCircuitElements...");
        java.lang.String _getChildCircuitElements_eaLoc = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getChildCircuitElements__return = port.getChildCircuitElements(_getChildCircuitElements_eaLoc);
        System.out.println("getChildCircuitElements.result=" + _getChildCircuitElements__return);


        }
        {
        System.out.println("Invoking getMethods...");
        org.multispeak.version_3.ArrayOfString _getMethods__return = port.getMethods();
        System.out.println("getMethods.result=" + _getMethods__return);


        }
        {
        System.out.println("Invoking getSubstationNames...");
        org.multispeak.version_3.ArrayOfString _getSubstationNames__return = port.getSubstationNames();
        System.out.println("getSubstationNames.result=" + _getSubstationNames__return);


        }
        {
        System.out.println("Invoking getDownlineCircuitElements...");
        java.lang.String _getDownlineCircuitElements_eaLoc = "";
        java.lang.String _getDownlineCircuitElements_lastReceived = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getDownlineCircuitElements__return = port.getDownlineCircuitElements(_getDownlineCircuitElements_eaLoc, _getDownlineCircuitElements_lastReceived);
        System.out.println("getDownlineCircuitElements.result=" + _getDownlineCircuitElements__return);


        }
        {
        System.out.println("Invoking getModifiedCircuitElements...");
        java.lang.String _getModifiedCircuitElements_previousSessionID = "";
        java.lang.String _getModifiedCircuitElements_lastReceived = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getModifiedCircuitElements__return = port.getModifiedCircuitElements(_getModifiedCircuitElements_previousSessionID, _getModifiedCircuitElements_lastReceived);
        System.out.println("getModifiedCircuitElements.result=" + _getModifiedCircuitElements__return);


        }
        {
        System.out.println("Invoking getDownlineMeterConnectivity...");
        java.lang.String _getDownlineMeterConnectivity_meterNo = "";
        org.multispeak.version_3.ArrayOfMeterConnectivity _getDownlineMeterConnectivity__return = port.getDownlineMeterConnectivity(_getDownlineMeterConnectivity_meterNo);
        System.out.println("getDownlineMeterConnectivity.result=" + _getDownlineMeterConnectivity__return);


        }
        {
        System.out.println("Invoking getParentCircuitElements...");
        java.lang.String _getParentCircuitElements_eaLoc = "";
        org.multispeak.version_3.ArrayOfCircuitElement _getParentCircuitElements__return = port.getParentCircuitElements(_getParentCircuitElements_eaLoc);
        System.out.println("getParentCircuitElements.result=" + _getParentCircuitElements__return);


        }
        {
        System.out.println("Invoking odDeviceChangedNotification...");
        org.multispeak.version_3.ArrayOfOutageDetectionDevice _odDeviceChangedNotification_odDevices = null;
        org.multispeak.version_3.ArrayOfErrorObject _odDeviceChangedNotification__return = port.odDeviceChangedNotification(_odDeviceChangedNotification_odDevices);
        System.out.println("odDeviceChangedNotification.result=" + _odDeviceChangedNotification__return);


        }
        {
        System.out.println("Invoking getUplineMeterConnectivity...");
        java.lang.String _getUplineMeterConnectivity_meterNo = "";
        org.multispeak.version_3.ArrayOfMeterConnectivity _getUplineMeterConnectivity__return = port.getUplineMeterConnectivity(_getUplineMeterConnectivity_meterNo);
        System.out.println("getUplineMeterConnectivity.result=" + _getUplineMeterConnectivity__return);


        }
        {
        System.out.println("Invoking getOutageEventStatusByOutageLocation...");
        org.multispeak.version_3.OutageLocation _getOutageEventStatusByOutageLocation_location = null;
        org.multispeak.version_3.OutageEventStatus _getOutageEventStatusByOutageLocation__return = port.getOutageEventStatusByOutageLocation(_getOutageEventStatusByOutageLocation_location);
        System.out.println("getOutageEventStatusByOutageLocation.result=" + _getOutageEventStatusByOutageLocation__return);


        }
        {
        System.out.println("Invoking getDomainMembers...");
        java.lang.String _getDomainMembers_domainName = "";
        org.multispeak.version_3.ArrayOfDomainMember _getDomainMembers__return = port.getDomainMembers(_getDomainMembers_domainName);
        System.out.println("getDomainMembers.result=" + _getDomainMembers__return);


        }
        {
        System.out.println("Invoking pingURL...");
        org.multispeak.version_3.ArrayOfErrorObject _pingURL__return = port.pingURL();
        System.out.println("pingURL.result=" + _pingURL__return);


        }
        {
        System.out.println("Invoking odEventNotification...");
        org.multispeak.version_3.ArrayOfOutageDetectionEvent _odEventNotification_odEvents = null;
        org.multispeak.version_3.ArrayOfErrorObject _odEventNotification__return = port.odEventNotification(_odEventNotification_odEvents);
        System.out.println("odEventNotification.result=" + _odEventNotification__return);


        }
        {
        System.out.println("Invoking getDomainNames...");
        org.multispeak.version_3.ArrayOfString _getDomainNames__return = port.getDomainNames();
        System.out.println("getDomainNames.result=" + _getDomainNames__return);


        }

        System.exit(0);
    }

}
