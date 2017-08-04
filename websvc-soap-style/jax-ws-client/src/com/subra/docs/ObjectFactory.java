
package com.subra.docs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.subra.docs package. 
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

    private final static QName _SayHelloResponse_QNAME = new QName("http://docs.subra.com/", "sayHelloResponse");
    private final static QName _GetPersonResponse_QNAME = new QName("http://docs.subra.com/", "getPersonResponse");
    private final static QName _GetPerson_QNAME = new QName("http://docs.subra.com/", "getPerson");
    private final static QName _SayHello_QNAME = new QName("http://docs.subra.com/", "sayHello");
    private final static QName _GetAllList_QNAME = new QName("http://docs.subra.com/", "getAllList");
    private final static QName _GetAllListResponse_QNAME = new QName("http://docs.subra.com/", "getAllListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.subra.docs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetAllList }
     * 
     */
    public GetAllList createGetAllList() {
        return new GetAllList();
    }

    /**
     * Create an instance of {@link GetAllListResponse }
     * 
     */
    public GetAllListResponse createGetAllListResponse() {
        return new GetAllListResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "getAllList")
    public JAXBElement<GetAllList> createGetAllList(GetAllList value) {
        return new JAXBElement<GetAllList>(_GetAllList_QNAME, GetAllList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.subra.com/", name = "getAllListResponse")
    public JAXBElement<GetAllListResponse> createGetAllListResponse(GetAllListResponse value) {
        return new JAXBElement<GetAllListResponse>(_GetAllListResponse_QNAME, GetAllListResponse.class, null, value);
    }

}
