package com.document.style.exception;

public class OwnExcptBean { // a fault bean class

	private String message;
	
	private int code;

	public OwnExcptBean(String message, int code) {
		this.message = message;
		this.code = code;
	}

	public OwnExcptBean() {
		
	}

	public String getMessage() {
		return message;
	}
	
	public int getCode() {
		return code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCode(int code) {
		this.code = code;
	}	
	
	
	
}
