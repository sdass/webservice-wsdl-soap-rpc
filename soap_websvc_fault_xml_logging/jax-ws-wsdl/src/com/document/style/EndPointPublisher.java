package com.document.style;

import javax.xml.ws.Endpoint;

public class EndPointPublisher {

	static{ //for xml transport logging
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    }
	
	public static void main(String[] args) {
		System.out.println("begin");
		Endpoint.publish("http://localhost:9993/whateverurl/helodoc", new HelloWorldDocStyleImpl());
		System.out.println("ends");

	}

}
