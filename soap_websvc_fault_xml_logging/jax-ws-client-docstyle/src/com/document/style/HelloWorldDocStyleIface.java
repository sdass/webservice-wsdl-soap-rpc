
package com.document.style;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldDocStyleIface", targetNamespace = "http://style.document.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldDocStyleIface {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws OwnException_Exception
     */
    @WebMethod(operationName = "HelloGetStrg")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "HelloGetStrg", targetNamespace = "http://style.document.com/", className = "com.document.style.HelloGetStrg")
    @ResponseWrapper(localName = "HelloGetStrgResponse", targetNamespace = "http://style.document.com/", className = "com.document.style.HelloGetStrgResponse")
    @Action(input = "http://style.document.com/HelloWorldDocStyleIface/HelloGetStrgRequest", output = "http://style.document.com/HelloWorldDocStyleIface/HelloGetStrgResponse", fault = {
        @FaultAction(className = OwnException_Exception.class, value = "http://style.document.com/HelloWorldDocStyleIface/HelloGetStrg/Fault/OwnException")
    })
    public String helloGetStrg(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws OwnException_Exception
    ;

}
