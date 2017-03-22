package cmaRepos;

public class ReposWSDEVProxy implements cmaRepos.ReposWSDEV_PortType {
  private String _endpoint = null;
  private cmaRepos.ReposWSDEV_PortType reposWSDEV_PortType = null;
  
  public ReposWSDEVProxy() {
    _initReposWSDEVProxy();
  }
  
  public ReposWSDEVProxy(String endpoint) {
    _endpoint = endpoint;
    _initReposWSDEVProxy();
  }
  
  private void _initReposWSDEVProxy() {
    try {
      reposWSDEV_PortType = (new cmaRepos.ReposWSDEV_ServiceLocator()).getReposWSDEVPort();
      if (reposWSDEV_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reposWSDEV_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reposWSDEV_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reposWSDEV_PortType != null)
      ((javax.xml.rpc.Stub)reposWSDEV_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cmaRepos.ReposWSDEV_PortType getReposWSDEV_PortType() {
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType;
  }
  
  public java.lang.String deleteFile(java.lang.String id, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.deleteFile(id, user);
  }
  
  public java.lang.String uploadDefaultFile(java.lang.String docName, java.util.Calendar insertedDate, cmaRepos.MyDocument meta, byte[] fileData, java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.uploadDefaultFile(docName, insertedDate, meta, fileData, user);
  }
  
  public java.lang.String deleteRubric(java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.deleteRubric(user);
  }
  
  public java.lang.String updateRubric(java.lang.String filename, byte[] rubric, java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.updateRubric(filename, rubric, user);
  }
  
  public byte[] getRubric(java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.getRubric(user);
  }
  
  public java.lang.String insertRubric(java.lang.String filename, byte[] rubric, java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.insertRubric(filename, rubric, user);
  }
  
  public byte[] downloadFile(java.lang.String id, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.downloadFile(id, user);
  }
  
  public java.lang.Object[] showLastXDocsByUser(int numDocs, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.showLastXDocsByUser(numDocs, user);
  }
  
  public void instanceRepos(java.lang.String user, java.lang.String pwd) throws java.rmi.RemoteException, cmaRepos.InvalidCredentialsException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    reposWSDEV_PortType.instanceRepos(user, pwd);
  }
  
  public java.lang.String uploadFile(java.lang.String docName, int pid, int fid, cmaRepos.MyDocument meta, byte[] fileData, java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.uploadFile(docName, pid, fid, meta, fileData, user);
  }
  
  public java.lang.String updateFile(java.lang.String docID, java.lang.String docName, byte[] fileData, cmaRepos.MyDocument meta, java.lang.String user) throws java.rmi.RemoteException{
    if (reposWSDEV_PortType == null)
      _initReposWSDEVProxy();
    return reposWSDEV_PortType.updateFile(docID, docName, fileData, meta, user);
  }
  
  
}