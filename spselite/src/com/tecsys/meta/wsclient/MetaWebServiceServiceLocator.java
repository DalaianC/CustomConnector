/**
 * MetaWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaWebServiceServiceLocator extends org.apache.axis.client.Service implements com.tecsys.meta.wsclient.MetaWebServiceService {

    public MetaWebServiceServiceLocator() {
    }


    public MetaWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetaWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MetaWebServicePort
    private java.lang.String MetaWebServicePort_address = "https://lqil0219spsap01.cardinalhealth.net/qa_84/ws/MetaWebService";

    public java.lang.String getMetaWebServicePortAddress() {
        return MetaWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetaWebServicePortWSDDServiceName = "MetaWebServicePort";

    public java.lang.String getMetaWebServicePortWSDDServiceName() {
        return MetaWebServicePortWSDDServiceName;
    }

    public void setMetaWebServicePortWSDDServiceName(java.lang.String name) {
        MetaWebServicePortWSDDServiceName = name;
    }

    public com.tecsys.meta.wsclient.MetaWebService getMetaWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MetaWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetaWebServicePort(endpoint);
    }

    public com.tecsys.meta.wsclient.MetaWebService getMetaWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tecsys.meta.wsclient.MetaWebServiceBindingStub _stub = new com.tecsys.meta.wsclient.MetaWebServiceBindingStub(portAddress, this);
            _stub.setPortName(getMetaWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetaWebServicePortEndpointAddress(java.lang.String address) {
        MetaWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tecsys.meta.wsclient.MetaWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tecsys.meta.wsclient.MetaWebServiceBindingStub _stub = new com.tecsys.meta.wsclient.MetaWebServiceBindingStub(new java.net.URL(MetaWebServicePort_address), this);
                _stub.setPortName(getMetaWebServicePortWSDDServiceName());
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
        if ("MetaWebServicePort".equals(inputPortName)) {
            return getMetaWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "MetaWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "MetaWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MetaWebServicePort".equals(portName)) {
            setMetaWebServicePortEndpointAddress(address);
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
