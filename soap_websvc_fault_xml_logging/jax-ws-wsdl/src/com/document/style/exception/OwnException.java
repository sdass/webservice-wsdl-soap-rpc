package com.document.style.exception;

import javax.xml.ws.WebFault;

/*
1.Extend Exception.
2.Be annotated with @WebFault
3.Use a fault bean used to store the message
4.Implement the two constructors and the method described in the spec

 */

@WebFault (name="OwnException")
public class OwnException extends Exception {

	private OwnExcptBean faultBean;
	
	//private cod

	public OwnException(String message, OwnExcptBean faultInfo) {
		super(message);
		this.faultBean = faultInfo;
	}

	public OwnException(String message, OwnExcptBean faultInfo ,Throwable cause) {
		super(message, cause);
		this.faultBean = faultInfo;
	}

	public OwnExcptBean getFaultBean() {
		return faultBean;
	}

	
}
