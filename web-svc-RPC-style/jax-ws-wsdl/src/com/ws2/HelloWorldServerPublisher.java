package com.ws2;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;


public class HelloWorldServerPublisher {
	public static void main(String[] args) {
		
		System.out.println("Beginning web service");
		Endpoint.publish("http://localhost:9992/arb", new HelloWorldServerImpl());
		System.out.println("started web service");
		
	}

	
}
