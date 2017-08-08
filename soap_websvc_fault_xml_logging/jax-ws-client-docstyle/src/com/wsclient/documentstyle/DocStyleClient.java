package com.wsclient.documentstyle;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.document.style.HelloWorldDocStyleIface;
import com.document.style.HelloWorldDocStyleImplService;
import com.document.style.OwnException;
import com.document.style.OwnException_Exception;
import com.document.style.OwnExcptBean;


public class DocStyleClient {
	
	static{
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    }
	

	public static void main(String[] args) throws MalformedURLException{

		System.out.println("client invoking");
		
		try{ 
		//take advantage of intellisense for the single code below
		HelloWorldDocStyleIface iface =  new HelloWorldDocStyleImplService().getHelloWorldDocStyleImplPort();
		System.out.println(iface.helloGetStrg("Ragel", "Rowing"));
		}catch(OwnException_Exception e){
			System.out.println(e.getMessage());
			//System.out.println(e.getFaultInfo());
			
			//e.printStackTrace();
			System.out.println("---" + e.getFaultInfo().getMessage()  ); //+ e.getFaultInfo(). );
			System.out.println("--- beancode=" + e.getFaultInfo().getFaultBean().getCode() + " bean msg= " +  e.getFaultInfo().getFaultBean().getMessage()  ); //+ e.getFaultInfo(). );
			
		}
	}
}
