/**
 * ReposWSDEV_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public interface ReposWSDEV_PortType extends java.rmi.Remote {
    public java.lang.String deleteFile(java.lang.String id, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException;
    public java.lang.String uploadDefaultFile(java.lang.String docName, java.util.Calendar insertedDate, cmaRepos.MyDocument meta, byte[] fileData, java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String deleteRubric(java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String updateRubric(java.lang.String filename, byte[] rubric, java.lang.String user) throws java.rmi.RemoteException;
    public byte[] getRubric(java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String insertRubric(java.lang.String filename, byte[] rubric, java.lang.String user) throws java.rmi.RemoteException;
    public byte[] downloadFile(java.lang.String id, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException;
    public java.lang.Object[] showLastXDocsByUser(int numDocs, java.lang.String user) throws java.rmi.RemoteException, cmaRepos.IOException;
    public void instanceRepos(java.lang.String user, java.lang.String pwd) throws java.rmi.RemoteException, cmaRepos.InvalidCredentialsException;
    public java.lang.String uploadFile(java.lang.String docName, int pid, int fid, cmaRepos.MyDocument meta, byte[] fileData, java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String updateFile(java.lang.String docID, java.lang.String docName, byte[] fileData, cmaRepos.MyDocument meta, java.lang.String user) throws java.rmi.RemoteException;
}
