
package com.subra;

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
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-15T19:42:25.721-04:00
 * Generated source version: 2.7.18
 * 
 */
public final class HelloEtcService_HelloEtcServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://subra.com/", "HelloEtcServiceService");

    private HelloEtcService_HelloEtcServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HelloEtcServiceService.WSDL_LOCATION;
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
      
        HelloEtcServiceService ss = new HelloEtcServiceService(wsdlURL, SERVICE_NAME);
        HelloEtcService port = ss.getHelloEtcServicePort();  
        
        {
        System.out.println("Invoking multiply...");
        int _multiply_arg0 = 61386362;
        int _multiply_arg1 = 1798742431;
        int _multiply__return = port.multiply(_multiply_arg0, _multiply_arg1);
        System.out.println("multiply.result=" + _multiply__return);


        }
        {
        System.out.println("Invoking sayHello...");
        java.lang.String _sayHello_arg0 = "_sayHello_arg01794201599";
        java.lang.String _sayHello__return = port.sayHello(_sayHello_arg0);
        System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}
