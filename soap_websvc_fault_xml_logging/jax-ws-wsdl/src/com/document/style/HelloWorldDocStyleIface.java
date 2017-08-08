package com.document.style;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.document.style.exception.OwnException;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use = Use.LITERAL) //optional line
public interface HelloWorldDocStyleIface {
	
	public String HelloGetStrg (String name, String hobby) throws OwnException ;
	

}
