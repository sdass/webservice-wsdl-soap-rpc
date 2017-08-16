package com.subra.cxfclient;

import com.subra.HelloEtcService;
import com.subra.HelloEtcServiceImpl;
import com.subra.HelloEtcServiceService;

public class TestCxfClient {

	public static void main(String[] args) {
		HelloEtcServiceService helloEtcService = new HelloEtcServiceService();
		//HelloEtcServiceImpl service = HelloEtcServiceImpl
		 HelloEtcService svce = helloEtcService.getHelloEtcServicePort();
		System.out.println( svce.sayHello("myname"));
		System.out.println(svce.multiply(9,  10));

	}

}
