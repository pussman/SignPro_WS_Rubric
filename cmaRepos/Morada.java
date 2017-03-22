/**
 * Morada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class Morada  implements java.io.Serializable {
    private java.lang.String andar;

    private java.lang.String apartado;

    private cmaRepos.CodPostal codPostal;

    private java.lang.String concelho;

    private java.lang.String designacao;

    private java.lang.String freguesia;

    private java.lang.String justificaAlteracao;

    private java.lang.String lado;

    private cmaRepos.IdsMoradaAppExt[] lstIdsMAppExt;

    private java.lang.String lugar;

    private java.lang.String moradaCompleta;

    private java.lang.String numero;

    private java.lang.String pais;

    private java.lang.String tipo;

    private java.lang.String tipoVia;

    public Morada() {
    }

    public Morada(
           java.lang.String andar,
           java.lang.String apartado,
           cmaRepos.CodPostal codPostal,
           java.lang.String concelho,
           java.lang.String designacao,
           java.lang.String freguesia,
           java.lang.String justificaAlteracao,
           java.lang.String lado,
           cmaRepos.IdsMoradaAppExt[] lstIdsMAppExt,
           java.lang.String lugar,
           java.lang.String moradaCompleta,
           java.lang.String numero,
           java.lang.String pais,
           java.lang.String tipo,
           java.lang.String tipoVia) {
           this.andar = andar;
           this.apartado = apartado;
           this.codPostal = codPostal;
           this.concelho = concelho;
           this.designacao = designacao;
           this.freguesia = freguesia;
           this.justificaAlteracao = justificaAlteracao;
           this.lado = lado;
           this.lstIdsMAppExt = lstIdsMAppExt;
           this.lugar = lugar;
           this.moradaCompleta = moradaCompleta;
           this.numero = numero;
           this.pais = pais;
           this.tipo = tipo;
           this.tipoVia = tipoVia;
    }


    /**
     * Gets the andar value for this Morada.
     * 
     * @return andar
     */
    public java.lang.String getAndar() {
        return andar;
    }


    /**
     * Sets the andar value for this Morada.
     * 
     * @param andar
     */
    public void setAndar(java.lang.String andar) {
        this.andar = andar;
    }


    /**
     * Gets the apartado value for this Morada.
     * 
     * @return apartado
     */
    public java.lang.String getApartado() {
        return apartado;
    }


    /**
     * Sets the apartado value for this Morada.
     * 
     * @param apartado
     */
    public void setApartado(java.lang.String apartado) {
        this.apartado = apartado;
    }


    /**
     * Gets the codPostal value for this Morada.
     * 
     * @return codPostal
     */
    public cmaRepos.CodPostal getCodPostal() {
        return codPostal;
    }


    /**
     * Sets the codPostal value for this Morada.
     * 
     * @param codPostal
     */
    public void setCodPostal(cmaRepos.CodPostal codPostal) {
        this.codPostal = codPostal;
    }


    /**
     * Gets the concelho value for this Morada.
     * 
     * @return concelho
     */
    public java.lang.String getConcelho() {
        return concelho;
    }


    /**
     * Sets the concelho value for this Morada.
     * 
     * @param concelho
     */
    public void setConcelho(java.lang.String concelho) {
        this.concelho = concelho;
    }


    /**
     * Gets the designacao value for this Morada.
     * 
     * @return designacao
     */
    public java.lang.String getDesignacao() {
        return designacao;
    }


    /**
     * Sets the designacao value for this Morada.
     * 
     * @param designacao
     */
    public void setDesignacao(java.lang.String designacao) {
        this.designacao = designacao;
    }


    /**
     * Gets the freguesia value for this Morada.
     * 
     * @return freguesia
     */
    public java.lang.String getFreguesia() {
        return freguesia;
    }


    /**
     * Sets the freguesia value for this Morada.
     * 
     * @param freguesia
     */
    public void setFreguesia(java.lang.String freguesia) {
        this.freguesia = freguesia;
    }


    /**
     * Gets the justificaAlteracao value for this Morada.
     * 
     * @return justificaAlteracao
     */
    public java.lang.String getJustificaAlteracao() {
        return justificaAlteracao;
    }


    /**
     * Sets the justificaAlteracao value for this Morada.
     * 
     * @param justificaAlteracao
     */
    public void setJustificaAlteracao(java.lang.String justificaAlteracao) {
        this.justificaAlteracao = justificaAlteracao;
    }


    /**
     * Gets the lado value for this Morada.
     * 
     * @return lado
     */
    public java.lang.String getLado() {
        return lado;
    }


    /**
     * Sets the lado value for this Morada.
     * 
     * @param lado
     */
    public void setLado(java.lang.String lado) {
        this.lado = lado;
    }


    /**
     * Gets the lstIdsMAppExt value for this Morada.
     * 
     * @return lstIdsMAppExt
     */
    public cmaRepos.IdsMoradaAppExt[] getLstIdsMAppExt() {
        return lstIdsMAppExt;
    }


    /**
     * Sets the lstIdsMAppExt value for this Morada.
     * 
     * @param lstIdsMAppExt
     */
    public void setLstIdsMAppExt(cmaRepos.IdsMoradaAppExt[] lstIdsMAppExt) {
        this.lstIdsMAppExt = lstIdsMAppExt;
    }

    public cmaRepos.IdsMoradaAppExt getLstIdsMAppExt(int i) {
        return this.lstIdsMAppExt[i];
    }

    public void setLstIdsMAppExt(int i, cmaRepos.IdsMoradaAppExt _value) {
        this.lstIdsMAppExt[i] = _value;
    }


    /**
     * Gets the lugar value for this Morada.
     * 
     * @return lugar
     */
    public java.lang.String getLugar() {
        return lugar;
    }


    /**
     * Sets the lugar value for this Morada.
     * 
     * @param lugar
     */
    public void setLugar(java.lang.String lugar) {
        this.lugar = lugar;
    }


    /**
     * Gets the moradaCompleta value for this Morada.
     * 
     * @return moradaCompleta
     */
    public java.lang.String getMoradaCompleta() {
        return moradaCompleta;
    }


    /**
     * Sets the moradaCompleta value for this Morada.
     * 
     * @param moradaCompleta
     */
    public void setMoradaCompleta(java.lang.String moradaCompleta) {
        this.moradaCompleta = moradaCompleta;
    }


    /**
     * Gets the numero value for this Morada.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Morada.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the pais value for this Morada.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Morada.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the tipo value for this Morada.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Morada.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the tipoVia value for this Morada.
     * 
     * @return tipoVia
     */
    public java.lang.String getTipoVia() {
        return tipoVia;
    }


    /**
     * Sets the tipoVia value for this Morada.
     * 
     * @param tipoVia
     */
    public void setTipoVia(java.lang.String tipoVia) {
        this.tipoVia = tipoVia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Morada)) return false;
        Morada other = (Morada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.andar==null && other.getAndar()==null) || 
             (this.andar!=null &&
              this.andar.equals(other.getAndar()))) &&
            ((this.apartado==null && other.getApartado()==null) || 
             (this.apartado!=null &&
              this.apartado.equals(other.getApartado()))) &&
            ((this.codPostal==null && other.getCodPostal()==null) || 
             (this.codPostal!=null &&
              this.codPostal.equals(other.getCodPostal()))) &&
            ((this.concelho==null && other.getConcelho()==null) || 
             (this.concelho!=null &&
              this.concelho.equals(other.getConcelho()))) &&
            ((this.designacao==null && other.getDesignacao()==null) || 
             (this.designacao!=null &&
              this.designacao.equals(other.getDesignacao()))) &&
            ((this.freguesia==null && other.getFreguesia()==null) || 
             (this.freguesia!=null &&
              this.freguesia.equals(other.getFreguesia()))) &&
            ((this.justificaAlteracao==null && other.getJustificaAlteracao()==null) || 
             (this.justificaAlteracao!=null &&
              this.justificaAlteracao.equals(other.getJustificaAlteracao()))) &&
            ((this.lado==null && other.getLado()==null) || 
             (this.lado!=null &&
              this.lado.equals(other.getLado()))) &&
            ((this.lstIdsMAppExt==null && other.getLstIdsMAppExt()==null) || 
             (this.lstIdsMAppExt!=null &&
              java.util.Arrays.equals(this.lstIdsMAppExt, other.getLstIdsMAppExt()))) &&
            ((this.lugar==null && other.getLugar()==null) || 
             (this.lugar!=null &&
              this.lugar.equals(other.getLugar()))) &&
            ((this.moradaCompleta==null && other.getMoradaCompleta()==null) || 
             (this.moradaCompleta!=null &&
              this.moradaCompleta.equals(other.getMoradaCompleta()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.tipoVia==null && other.getTipoVia()==null) || 
             (this.tipoVia!=null &&
              this.tipoVia.equals(other.getTipoVia())));
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
        if (getAndar() != null) {
            _hashCode += getAndar().hashCode();
        }
        if (getApartado() != null) {
            _hashCode += getApartado().hashCode();
        }
        if (getCodPostal() != null) {
            _hashCode += getCodPostal().hashCode();
        }
        if (getConcelho() != null) {
            _hashCode += getConcelho().hashCode();
        }
        if (getDesignacao() != null) {
            _hashCode += getDesignacao().hashCode();
        }
        if (getFreguesia() != null) {
            _hashCode += getFreguesia().hashCode();
        }
        if (getJustificaAlteracao() != null) {
            _hashCode += getJustificaAlteracao().hashCode();
        }
        if (getLado() != null) {
            _hashCode += getLado().hashCode();
        }
        if (getLstIdsMAppExt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstIdsMAppExt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstIdsMAppExt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLugar() != null) {
            _hashCode += getLugar().hashCode();
        }
        if (getMoradaCompleta() != null) {
            _hashCode += getMoradaCompleta().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getTipoVia() != null) {
            _hashCode += getTipoVia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Morada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "morada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("andar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "andar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apartado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apartado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "codPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concelho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "concelho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freguesia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freguesia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificaAlteracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificaAlteracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstIdsMAppExt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstIdsMAppExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "idsMoradaAppExt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lugar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moradaCompleta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moradaCompleta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoVia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoVia"));
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
