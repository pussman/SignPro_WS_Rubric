/**
 * ReposWSDEV_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class ReposWSDEV_ServiceLocator extends org.apache.axis.client.Service implements cmaRepos.ReposWSDEV_Service {

    public ReposWSDEV_ServiceLocator() {
    }


    public ReposWSDEV_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReposWSDEV_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReposWSDEVPort
    private java.lang.String ReposWSDEVPort_address = "http://webforms.cm-abrantes.pt:8080/ReposGUIDEV/ReposWSDEV";

    public java.lang.String getReposWSDEVPortAddress() {
        return ReposWSDEVPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReposWSDEVPortWSDDServiceName = "ReposWSDEVPort";

    public java.lang.String getReposWSDEVPortWSDDServiceName() {
        return ReposWSDEVPortWSDDServiceName;
    }

    public void setReposWSDEVPortWSDDServiceName(java.lang.String name) {
        ReposWSDEVPortWSDDServiceName = name;
    }

    public cmaRepos.ReposWSDEV_PortType getReposWSDEVPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReposWSDEVPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReposWSDEVPort(endpoint);
    }

    public cmaRepos.ReposWSDEV_PortType getReposWSDEVPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cmaRepos.ReposWSDEVPortBindingStub _stub = new cmaRepos.ReposWSDEVPortBindingStub(portAddress, this);
            _stub.setPortName(getReposWSDEVPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReposWSDEVPortEndpointAddress(java.lang.String address) {
        ReposWSDEVPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cmaRepos.ReposWSDEV_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cmaRepos.ReposWSDEVPortBindingStub _stub = new cmaRepos.ReposWSDEVPortBindingStub(new java.net.URL(ReposWSDEVPort_address), this);
                _stub.setPortName(getReposWSDEVPortWSDDServiceName());
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
        if ("ReposWSDEVPort".equals(inputPortName)) {
            return getReposWSDEVPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cmaRepos/", "ReposWSDEV");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cmaRepos/", "ReposWSDEVPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReposWSDEVPort".equals(portName)) {
            setReposWSDEVPortEndpointAddress(address);
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
