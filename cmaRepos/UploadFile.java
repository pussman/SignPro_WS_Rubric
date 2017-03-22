/**
 * UploadFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class UploadFile  implements java.io.Serializable {
    private java.lang.String docName;

    private int pid;

    private int fid;

    private cmaRepos.MyDocument meta;

    private byte[] fileData;

    private java.lang.String user;

    public UploadFile() {
    }

    public UploadFile(
           java.lang.String docName,
           int pid,
           int fid,
           cmaRepos.MyDocument meta,
           byte[] fileData,
           java.lang.String user) {
           this.docName = docName;
           this.pid = pid;
           this.fid = fid;
           this.meta = meta;
           this.fileData = fileData;
           this.user = user;
    }


    /**
     * Gets the docName value for this UploadFile.
     * 
     * @return docName
     */
    public java.lang.String getDocName() {
        return docName;
    }


    /**
     * Sets the docName value for this UploadFile.
     * 
     * @param docName
     */
    public void setDocName(java.lang.String docName) {
        this.docName = docName;
    }


    /**
     * Gets the pid value for this UploadFile.
     * 
     * @return pid
     */
    public int getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this UploadFile.
     * 
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }


    /**
     * Gets the fid value for this UploadFile.
     * 
     * @return fid
     */
    public int getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this UploadFile.
     * 
     * @param fid
     */
    public void setFid(int fid) {
        this.fid = fid;
    }


    /**
     * Gets the meta value for this UploadFile.
     * 
     * @return meta
     */
    public cmaRepos.MyDocument getMeta() {
        return meta;
    }


    /**
     * Sets the meta value for this UploadFile.
     * 
     * @param meta
     */
    public void setMeta(cmaRepos.MyDocument meta) {
        this.meta = meta;
    }


    /**
     * Gets the fileData value for this UploadFile.
     * 
     * @return fileData
     */
    public byte[] getFileData() {
        return fileData;
    }


    /**
     * Sets the fileData value for this UploadFile.
     * 
     * @param fileData
     */
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }


    /**
     * Gets the user value for this UploadFile.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this UploadFile.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadFile)) return false;
        UploadFile other = (UploadFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docName==null && other.getDocName()==null) || 
             (this.docName!=null &&
              this.docName.equals(other.getDocName()))) &&
            this.pid == other.getPid() &&
            this.fid == other.getFid() &&
            ((this.meta==null && other.getMeta()==null) || 
             (this.meta!=null &&
              this.meta.equals(other.getMeta()))) &&
            ((this.fileData==null && other.getFileData()==null) || 
             (this.fileData!=null &&
              java.util.Arrays.equals(this.fileData, other.getFileData()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocName() != null) {
            _hashCode += getDocName().hashCode();
        }
        _hashCode += getPid();
        _hashCode += getFid();
        if (getMeta() != null) {
            _hashCode += getMeta().hashCode();
        }
        if (getFileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "uploadFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "myDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
