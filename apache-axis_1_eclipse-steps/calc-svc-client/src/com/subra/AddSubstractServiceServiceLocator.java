/**
 * AddSubstractServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.subra;

public class AddSubstractServiceServiceLocator extends org.apache.axis.client.Service implements com.subra.AddSubstractServiceService {

    public AddSubstractServiceServiceLocator() {
    }


    public AddSubstractServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddSubstractServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddSubstractService
    private java.lang.String AddSubstractService_address = "http://localhost:8080/calc-svc/services/AddSubstractService";

    public java.lang.String getAddSubstractServiceAddress() {
        return AddSubstractService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddSubstractServiceWSDDServiceName = "AddSubstractService";

    public java.lang.String getAddSubstractServiceWSDDServiceName() {
        return AddSubstractServiceWSDDServiceName;
    }

    public void setAddSubstractServiceWSDDServiceName(java.lang.String name) {
        AddSubstractServiceWSDDServiceName = name;
    }

    public com.subra.AddSubstractService getAddSubstractService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddSubstractService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddSubstractService(endpoint);
    }

    public com.subra.AddSubstractService getAddSubstractService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.subra.AddSubstractServiceSoapBindingStub _stub = new com.subra.AddSubstractServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddSubstractServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddSubstractServiceEndpointAddress(java.lang.String address) {
        AddSubstractService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.subra.AddSubstractService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.subra.AddSubstractServiceSoapBindingStub _stub = new com.subra.AddSubstractServiceSoapBindingStub(new java.net.URL(AddSubstractService_address), this);
                _stub.setPortName(getAddSubstractServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddSubstractService".equals(inputPortName)) {
            return getAddSubstractService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://subra.com", "AddSubstractServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://subra.com", "AddSubstractService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddSubstractService".equals(portName)) {
            setAddSubstractServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
