/**
 * MetaWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public interface MetaWebService extends java.rmi.Remote {
    public com.tecsys.meta.wsclient.MetaWsSearchResponse search(com.tecsys.meta.wsclient.MetaWsSearchRequest arg0) throws java.rmi.RemoteException;
    public com.tecsys.meta.wsclient.MetaWsUpdateResponse update(com.tecsys.meta.wsclient.MetaWsUpdateRequest arg0) throws java.rmi.RemoteException;
    public boolean isValidUserCredentials(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
}
