package com.wsclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class HelloClient {
	public static void main(String[] args) throws Exception {
	
		System.out.println("in main()");
		URL wsdlurl = new URL("http://localhost:9992/arb?wsdl");
		QName qname_nameofservice = new QName("http://ws2.com/", "HelloWorldServerImplService");
		
		Service service = Service.create(wsdlurl, qname_nameofservice);
		
		String name = "M K Davis";
		
		//return a proxy. need namespace and portname
		HelloWoldServerIface helloIface = service.getPort(new QName("http://ws2.com/", "HelloWorldServerImplPort"), HelloWoldServerIface.class);//watch naming on the line
        System.out.println(helloIface.sayHello(name));
		
	}
}
