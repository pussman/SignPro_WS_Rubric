/**
 * IdsMoradaAppExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class IdsMoradaAppExt  implements java.io.Serializable {
    private java.lang.String app;

    private java.lang.String design;

    private java.lang.String id;

    public IdsMoradaAppExt() {
    }

    public IdsMoradaAppExt(
           java.lang.String app,
           java.lang.String design,
           java.lang.String id) {
           this.app = app;
           this.design = design;
           this.id = id;
    }


    /**
     * Gets the app value for this IdsMoradaAppExt.
     * 
     * @return app
     */
    public java.lang.String getApp() {
        return app;
    }


    /**
     * Sets the app value for this IdsMoradaAppExt.
     * 
     * @param app
     */
    public void setApp(java.lang.String app) {
        this.app = app;
    }


    /**
     * Gets the design value for this IdsMoradaAppExt.
     * 
     * @return design
     */
    public java.lang.String getDesign() {
        return design;
    }


    /**
     * Sets the design value for this IdsMoradaAppExt.
     * 
     * @param design
     */
    public void setDesign(java.lang.String design) {
        this.design = design;
    }


    /**
     * Gets the id value for this IdsMoradaAppExt.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this IdsMoradaAppExt.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdsMoradaAppExt)) return false;
        IdsMoradaAppExt other = (IdsMoradaAppExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.app==null && other.getApp()==null) || 
             (this.app!=null &&
              this.app.equals(other.getApp()))) &&
            ((this.design==null && other.getDesign()==null) || 
             (this.design!=null &&
              this.design.equals(other.getDesign()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getApp() != null) {
            _hashCode += getApp().hashCode();
        }
        if (getDesign() != null) {
            _hashCode += getDesign().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdsMoradaAppExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "idsMoradaAppExt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("app");
        elemField.setXmlName(new javax.xml.namespace.QName("", "app"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("design");
        elemField.setXmlName(new javax.xml.namespace.QName("", "design"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
