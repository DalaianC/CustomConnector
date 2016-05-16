package com.tecsys.meta.wsclient;

public class MetaWebServiceProxy implements com.tecsys.meta.wsclient.MetaWebService {
  private String _endpoint = null;
  private com.tecsys.meta.wsclient.MetaWebService metaWebService = null;
  
  public MetaWebServiceProxy() {
    _initMetaWebServiceProxy();
  }
  
  public MetaWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetaWebServiceProxy();
  }
  
  private void _initMetaWebServiceProxy() {
    try {
      metaWebService = (new com.tecsys.meta.wsclient.MetaWebServiceServiceLocator()).getMetaWebServicePort();
      if (metaWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metaWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metaWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metaWebService != null)
      ((javax.xml.rpc.Stub)metaWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tecsys.meta.wsclient.MetaWebService getMetaWebService() {
    if (metaWebService == null)
      _initMetaWebServiceProxy();
    return metaWebService;
  }
  
  public com.tecsys.meta.wsclient.MetaWsSearchResponse search(com.tecsys.meta.wsclient.MetaWsSearchRequest arg0) throws java.rmi.RemoteException{
    if (metaWebService == null)
      _initMetaWebServiceProxy();
    return metaWebService.search(arg0);
  }
  
  public com.tecsys.meta.wsclient.MetaWsUpdateResponse update(com.tecsys.meta.wsclient.MetaWsUpdateRequest arg0) throws java.rmi.RemoteException{
    if (metaWebService == null)
      _initMetaWebServiceProxy();
    return metaWebService.update(arg0);
  }
  
  public boolean isValidUserCredentials(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (metaWebService == null)
      _initMetaWebServiceProxy();
    return metaWebService.isValidUserCredentials(userName, password);
  }
  
  
}