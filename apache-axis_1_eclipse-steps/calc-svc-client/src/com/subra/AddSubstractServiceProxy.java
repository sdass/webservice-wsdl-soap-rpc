package com.subra;

public class AddSubstractServiceProxy implements com.subra.AddSubstractService {
  private String _endpoint = null;
  private com.subra.AddSubstractService addSubstractService = null;
  
  public AddSubstractServiceProxy() {
    _initAddSubstractServiceProxy();
  }
  
  public AddSubstractServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddSubstractServiceProxy();
  }
  
  private void _initAddSubstractServiceProxy() {
    try {
      addSubstractService = (new com.subra.AddSubstractServiceServiceLocator()).getAddSubstractService();
      if (addSubstractService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addSubstractService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addSubstractService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addSubstractService != null)
      ((javax.xml.rpc.Stub)addSubstractService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.subra.AddSubstractService getAddSubstractService() {
    if (addSubstractService == null)
      _initAddSubstractServiceProxy();
    return addSubstractService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (addSubstractService == null)
      _initAddSubstractServiceProxy();
    return addSubstractService.add(i, j);
  }
  
  public int substract(int i, int j) throws java.rmi.RemoteException{
    if (addSubstractService == null)
      _initAddSubstractServiceProxy();
    return addSubstractService.substract(i, j);
  }
  
  
}