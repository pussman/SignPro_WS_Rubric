/**
 * EntidadeRelacionada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class EntidadeRelacionada  implements java.io.Serializable {
    private cmaRepos.Contacto contacto;

    private java.lang.String id;

    private cmaRepos.Morada moradaPrincipal;

    private java.lang.String nif;

    private java.lang.String nome;

    private java.lang.String referencia;

    public EntidadeRelacionada() {
    }

    public EntidadeRelacionada(
           cmaRepos.Contacto contacto,
           java.lang.String id,
           cmaRepos.Morada moradaPrincipal,
           java.lang.String nif,
           java.lang.String nome,
           java.lang.String referencia) {
           this.contacto = contacto;
           this.id = id;
           this.moradaPrincipal = moradaPrincipal;
           this.nif = nif;
           this.nome = nome;
           this.referencia = referencia;
    }


    /**
     * Gets the contacto value for this EntidadeRelacionada.
     * 
     * @return contacto
     */
    public cmaRepos.Contacto getContacto() {
        return contacto;
    }


    /**
     * Sets the contacto value for this EntidadeRelacionada.
     * 
     * @param contacto
     */
    public void setContacto(cmaRepos.Contacto contacto) {
        this.contacto = contacto;
    }


    /**
     * Gets the id value for this EntidadeRelacionada.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this EntidadeRelacionada.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the moradaPrincipal value for this EntidadeRelacionada.
     * 
     * @return moradaPrincipal
     */
    public cmaRepos.Morada getMoradaPrincipal() {
        return moradaPrincipal;
    }


    /**
     * Sets the moradaPrincipal value for this EntidadeRelacionada.
     * 
     * @param moradaPrincipal
     */
    public void setMoradaPrincipal(cmaRepos.Morada moradaPrincipal) {
        this.moradaPrincipal = moradaPrincipal;
    }


    /**
     * Gets the nif value for this EntidadeRelacionada.
     * 
     * @return nif
     */
    public java.lang.String getNif() {
        return nif;
    }


    /**
     * Sets the nif value for this EntidadeRelacionada.
     * 
     * @param nif
     */
    public void setNif(java.lang.String nif) {
        this.nif = nif;
    }


    /**
     * Gets the nome value for this EntidadeRelacionada.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this EntidadeRelacionada.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the referencia value for this EntidadeRelacionada.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this EntidadeRelacionada.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntidadeRelacionada)) return false;
        EntidadeRelacionada other = (EntidadeRelacionada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contacto==null && other.getContacto()==null) || 
             (this.contacto!=null &&
              this.contacto.equals(other.getContacto()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.moradaPrincipal==null && other.getMoradaPrincipal()==null) || 
             (this.moradaPrincipal!=null &&
              this.moradaPrincipal.equals(other.getMoradaPrincipal()))) &&
            ((this.nif==null && other.getNif()==null) || 
             (this.nif!=null &&
              this.nif.equals(other.getNif()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia())));
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
        if (getContacto() != null) {
            _hashCode += getContacto().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMoradaPrincipal() != null) {
            _hashCode += getMoradaPrincipal().hashCode();
        }
        if (getNif() != null) {
            _hashCode += getNif().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntidadeRelacionada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "entidadeRelacionada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contacto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "contacto"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moradaPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moradaPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "morada"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencia"));
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
