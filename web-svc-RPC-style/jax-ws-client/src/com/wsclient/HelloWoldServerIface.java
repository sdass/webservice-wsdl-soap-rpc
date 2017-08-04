package com.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//this interface copied from server side
@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloWoldServerIface {

	//@WebMethod
		public String sayHello(String name);

	
}
