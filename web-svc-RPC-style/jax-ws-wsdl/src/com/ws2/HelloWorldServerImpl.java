package com.ws2;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ws2.HelloWoldServerIface")
public class HelloWorldServerImpl implements HelloWoldServerIface {
	public String sayHello(String name) {
		System.out.println("input: " + name);
		return "Hello " + name + " !, Hope you are doing well !!";
	}
}
