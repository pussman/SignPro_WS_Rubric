/**
 * AreaInteresseAtividades.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class AreaInteresseAtividades  implements java.io.Serializable {
    private java.lang.String designacao;

    private java.lang.String local;

    private java.lang.String servico;

    public AreaInteresseAtividades() {
    }

    public AreaInteresseAtividades(
           java.lang.String designacao,
           java.lang.String local,
           java.lang.String servico) {
           this.designacao = designacao;
           this.local = local;
           this.servico = servico;
    }


    /**
     * Gets the designacao value for this AreaInteresseAtividades.
     * 
     * @return designacao
     */
    public java.lang.String getDesignacao() {
        return designacao;
    }


    /**
     * Sets the designacao value for this AreaInteresseAtividades.
     * 
     * @param designacao
     */
    public void setDesignacao(java.lang.String designacao) {
        this.designacao = designacao;
    }


    /**
     * Gets the local value for this AreaInteresseAtividades.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this AreaInteresseAtividades.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the servico value for this AreaInteresseAtividades.
     * 
     * @return servico
     */
    public java.lang.String getServico() {
        return servico;
    }


    /**
     * Sets the servico value for this AreaInteresseAtividades.
     * 
     * @param servico
     */
    public void setServico(java.lang.String servico) {
        this.servico = servico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AreaInteresseAtividades)) return false;
        AreaInteresseAtividades other = (AreaInteresseAtividades) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designacao==null && other.getDesignacao()==null) || 
             (this.designacao!=null &&
              this.designacao.equals(other.getDesignacao()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.servico==null && other.getServico()==null) || 
             (this.servico!=null &&
              this.servico.equals(other.getServico())));
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
        if (getDesignacao() != null) {
            _hashCode += getDesignacao().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getServico() != null) {
            _hashCode += getServico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AreaInteresseAtividades.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "areaInteresseAtividades"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servico"));
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
