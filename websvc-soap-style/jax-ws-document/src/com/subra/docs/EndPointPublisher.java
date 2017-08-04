package com.subra.docs;

import javax.xml.ws.Endpoint;

public class EndPointPublisher {

	public static void main(String[] args){
		System.out.println("dfs");
		//tester();
		/* readme part
		 To see description try it 
		  http://localhost:9993/arbitray/HelloEmployeeSvc
		 Endpoint	Information
			Service Name:	{http://docs.subra.com/}HelloImplService
			Port Name:	{http://docs.subra.com/}HelloImplPort
		 
		 Information
		 	Address:	http://localhost:9993/arbitray/HelloEmployeeSvc
			WSDL:	http://localhost:9993/arbitray/HelloEmployeeSvc?wsdl
			Implementation class:	com.subra.docs.HelloImpl
		 
		 */
		
		Endpoint.publish("http://localhost:9993/arbitray/HelloEmployeeSvc", new HelloImpl());

	}
	
	
	
	
	public static void tester(){

		HelloIface hello = new HelloImpl();
		System.out.println(hello.getAllList());
		
		System.out.println( hello.getPerson(23));
		System.out.println(hello.sayHello("Billiboy"));
	}
}
