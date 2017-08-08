
package com.document.style;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.document.style package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloGetStrg_QNAME = new QName("http://style.document.com/", "HelloGetStrg");
    private final static QName _HelloGetStrgResponse_QNAME = new QName("http://style.document.com/", "HelloGetStrgResponse");
    private final static QName _OwnException_QNAME = new QName("http://style.document.com/", "OwnException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.document.style
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloGetStrg }
     * 
     */
    public HelloGetStrg createHelloGetStrg() {
        return new HelloGetStrg();
    }

    /**
     * Create an instance of {@link HelloGetStrgResponse }
     * 
     */
    public HelloGetStrgResponse createHelloGetStrgResponse() {
        return new HelloGetStrgResponse();
    }

    /**
     * Create an instance of {@link OwnException }
     * 
     */
    public OwnException createOwnException() {
        return new OwnException();
    }

    /**
     * Create an instance of {@link OwnExcptBean }
     * 
     */
    public OwnExcptBean createOwnExcptBean() {
        return new OwnExcptBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloGetStrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://style.document.com/", name = "HelloGetStrg")
    public JAXBElement<HelloGetStrg> createHelloGetStrg(HelloGetStrg value) {
        return new JAXBElement<HelloGetStrg>(_HelloGetStrg_QNAME, HelloGetStrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloGetStrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://style.document.com/", name = "HelloGetStrgResponse")
    public JAXBElement<HelloGetStrgResponse> createHelloGetStrgResponse(HelloGetStrgResponse value) {
        return new JAXBElement<HelloGetStrgResponse>(_HelloGetStrgResponse_QNAME, HelloGetStrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://style.document.com/", name = "OwnException")
    public JAXBElement<OwnException> createOwnException(OwnException value) {
        return new JAXBElement<OwnException>(_OwnException_QNAME, OwnException.class, null, value);
    }

}
