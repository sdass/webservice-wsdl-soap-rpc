
package com.document.style;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "OwnException", targetNamespace = "http://style.document.com/")
public class OwnException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private OwnException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public OwnException_Exception(String message, OwnException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public OwnException_Exception(String message, OwnException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.document.style.OwnException
     */
    public OwnException getFaultInfo() {
        return faultInfo;
    }

}
