package com.document.style;

import javax.jws.WebService;
import javax.xml.ws.FaultAction;

import com.document.style.exception.OwnException;
import com.document.style.exception.OwnExcptBean;

@WebService(endpointInterface="com.document.style.HelloWorldDocStyleIface")
public class HelloWorldDocStyleImpl implements HelloWorldDocStyleIface {

	@Override
	public String HelloGetStrg(String name, String hobby) throws OwnException {
		if(!ifOnlyletter(name)){ 
			System.out.println("1 Not good name or hobby");
			OwnExcptBean faultInfo = new OwnExcptBean("you passed name:" + name, 991);
			throw new OwnException("no numbers allowed", faultInfo ); //OwnException("Name can have only letters", faultInfo);
		}
		if(!ifOnlyletter(hobby)){ 
			System.out.println("2 Not good name or hobby");
			OwnExcptBean faultInfo = new OwnExcptBean("you passed hobby:" + hobby, 999);
			throw new OwnException("no numbers allowed", faultInfo ); //OwnException("Name can have only letters", faultInfo);
		}
		
		return "Documentstyle: Hi Mr." + name + ". Your hobby is: " + hobby; 
	}
	
	
	private boolean ifOnlyletter(String strx){
		
		char[] chars = strx.toCharArray();
		for(char c: chars){
			if(Character.isLetter(c) == false){
				return false;
			}//if
		}//for
		
		return true;
		
	}

}//calss ends
