/**
 * MetaWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public interface MetaWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getMetaWebServicePortAddress();

    public com.tecsys.meta.wsclient.MetaWebService getMetaWebServicePort() throws javax.xml.rpc.ServiceException;

    public com.tecsys.meta.wsclient.MetaWebService getMetaWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
