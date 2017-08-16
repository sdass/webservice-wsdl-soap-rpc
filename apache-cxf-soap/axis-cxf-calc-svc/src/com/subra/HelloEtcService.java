package com.subra;

import javax.jws.WebService;

@WebService(targetNamespace = "http://subra.com/", portName = "HelloEtcServicePort", serviceName = "HelloEtcServiceService")
public class HelloEtcService {
	
	public String sayHello(String name){
		return "Hi " + name;
	}
	
	public int multiply (int x, int y){
		return x * y;
	}

}
