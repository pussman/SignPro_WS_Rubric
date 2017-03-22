/**
 * CodPostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class CodPostal  implements java.io.Serializable {
    private java.lang.String codPostal;

    private java.lang.String localidade;

    public CodPostal() {
    }

    public CodPostal(
           java.lang.String codPostal,
           java.lang.String localidade) {
           this.codPostal = codPostal;
           this.localidade = localidade;
    }


    /**
     * Gets the codPostal value for this CodPostal.
     * 
     * @return codPostal
     */
    public java.lang.String getCodPostal() {
        return codPostal;
    }


    /**
     * Sets the codPostal value for this CodPostal.
     * 
     * @param codPostal
     */
    public void setCodPostal(java.lang.String codPostal) {
        this.codPostal = codPostal;
    }


    /**
     * Gets the localidade value for this CodPostal.
     * 
     * @return localidade
     */
    public java.lang.String getLocalidade() {
        return localidade;
    }


    /**
     * Sets the localidade value for this CodPostal.
     * 
     * @param localidade
     */
    public void setLocalidade(java.lang.String localidade) {
        this.localidade = localidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodPostal)) return false;
        CodPostal other = (CodPostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codPostal==null && other.getCodPostal()==null) || 
             (this.codPostal!=null &&
              this.codPostal.equals(other.getCodPostal()))) &&
            ((this.localidade==null && other.getLocalidade()==null) || 
             (this.localidade!=null &&
              this.localidade.equals(other.getLocalidade())));
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
        if (getCodPostal() != null) {
            _hashCode += getCodPostal().hashCode();
        }
        if (getLocalidade() != null) {
            _hashCode += getLocalidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodPostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "codPostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localidade"));
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
