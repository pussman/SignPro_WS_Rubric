/**
 * Conteudo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class Conteudo  implements java.io.Serializable {
    private java.lang.String autor;

    private java.lang.String descricao;

    private java.lang.String designacao;

    private java.lang.String localizacao;

    private java.lang.String numConjunto;

    private java.lang.String numIdentificacao;

    private java.lang.String numRegisto;

    private java.lang.String tipoAutoria;

    private java.lang.String tipoTarefa;

    private java.lang.String titulo;

    public Conteudo() {
    }

    public Conteudo(
           java.lang.String autor,
           java.lang.String descricao,
           java.lang.String designacao,
           java.lang.String localizacao,
           java.lang.String numConjunto,
           java.lang.String numIdentificacao,
           java.lang.String numRegisto,
           java.lang.String tipoAutoria,
           java.lang.String tipoTarefa,
           java.lang.String titulo) {
           this.autor = autor;
           this.descricao = descricao;
           this.designacao = designacao;
           this.localizacao = localizacao;
           this.numConjunto = numConjunto;
           this.numIdentificacao = numIdentificacao;
           this.numRegisto = numRegisto;
           this.tipoAutoria = tipoAutoria;
           this.tipoTarefa = tipoTarefa;
           this.titulo = titulo;
    }


    /**
     * Gets the autor value for this Conteudo.
     * 
     * @return autor
     */
    public java.lang.String getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this Conteudo.
     * 
     * @param autor
     */
    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }


    /**
     * Gets the descricao value for this Conteudo.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Conteudo.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the designacao value for this Conteudo.
     * 
     * @return designacao
     */
    public java.lang.String getDesignacao() {
        return designacao;
    }


    /**
     * Sets the designacao value for this Conteudo.
     * 
     * @param designacao
     */
    public void setDesignacao(java.lang.String designacao) {
        this.designacao = designacao;
    }


    /**
     * Gets the localizacao value for this Conteudo.
     * 
     * @return localizacao
     */
    public java.lang.String getLocalizacao() {
        return localizacao;
    }


    /**
     * Sets the localizacao value for this Conteudo.
     * 
     * @param localizacao
     */
    public void setLocalizacao(java.lang.String localizacao) {
        this.localizacao = localizacao;
    }


    /**
     * Gets the numConjunto value for this Conteudo.
     * 
     * @return numConjunto
     */
    public java.lang.String getNumConjunto() {
        return numConjunto;
    }


    /**
     * Sets the numConjunto value for this Conteudo.
     * 
     * @param numConjunto
     */
    public void setNumConjunto(java.lang.String numConjunto) {
        this.numConjunto = numConjunto;
    }


    /**
     * Gets the numIdentificacao value for this Conteudo.
     * 
     * @return numIdentificacao
     */
    public java.lang.String getNumIdentificacao() {
        return numIdentificacao;
    }


    /**
     * Sets the numIdentificacao value for this Conteudo.
     * 
     * @param numIdentificacao
     */
    public void setNumIdentificacao(java.lang.String numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }


    /**
     * Gets the numRegisto value for this Conteudo.
     * 
     * @return numRegisto
     */
    public java.lang.String getNumRegisto() {
        return numRegisto;
    }


    /**
     * Sets the numRegisto value for this Conteudo.
     * 
     * @param numRegisto
     */
    public void setNumRegisto(java.lang.String numRegisto) {
        this.numRegisto = numRegisto;
    }


    /**
     * Gets the tipoAutoria value for this Conteudo.
     * 
     * @return tipoAutoria
     */
    public java.lang.String getTipoAutoria() {
        return tipoAutoria;
    }


    /**
     * Sets the tipoAutoria value for this Conteudo.
     * 
     * @param tipoAutoria
     */
    public void setTipoAutoria(java.lang.String tipoAutoria) {
        this.tipoAutoria = tipoAutoria;
    }


    /**
     * Gets the tipoTarefa value for this Conteudo.
     * 
     * @return tipoTarefa
     */
    public java.lang.String getTipoTarefa() {
        return tipoTarefa;
    }


    /**
     * Sets the tipoTarefa value for this Conteudo.
     * 
     * @param tipoTarefa
     */
    public void setTipoTarefa(java.lang.String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }


    /**
     * Gets the titulo value for this Conteudo.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Conteudo.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Conteudo)) return false;
        Conteudo other = (Conteudo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.designacao==null && other.getDesignacao()==null) || 
             (this.designacao!=null &&
              this.designacao.equals(other.getDesignacao()))) &&
            ((this.localizacao==null && other.getLocalizacao()==null) || 
             (this.localizacao!=null &&
              this.localizacao.equals(other.getLocalizacao()))) &&
            ((this.numConjunto==null && other.getNumConjunto()==null) || 
             (this.numConjunto!=null &&
              this.numConjunto.equals(other.getNumConjunto()))) &&
            ((this.numIdentificacao==null && other.getNumIdentificacao()==null) || 
             (this.numIdentificacao!=null &&
              this.numIdentificacao.equals(other.getNumIdentificacao()))) &&
            ((this.numRegisto==null && other.getNumRegisto()==null) || 
             (this.numRegisto!=null &&
              this.numRegisto.equals(other.getNumRegisto()))) &&
            ((this.tipoAutoria==null && other.getTipoAutoria()==null) || 
             (this.tipoAutoria!=null &&
              this.tipoAutoria.equals(other.getTipoAutoria()))) &&
            ((this.tipoTarefa==null && other.getTipoTarefa()==null) || 
             (this.tipoTarefa!=null &&
              this.tipoTarefa.equals(other.getTipoTarefa()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
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
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getDesignacao() != null) {
            _hashCode += getDesignacao().hashCode();
        }
        if (getLocalizacao() != null) {
            _hashCode += getLocalizacao().hashCode();
        }
        if (getNumConjunto() != null) {
            _hashCode += getNumConjunto().hashCode();
        }
        if (getNumIdentificacao() != null) {
            _hashCode += getNumIdentificacao().hashCode();
        }
        if (getNumRegisto() != null) {
            _hashCode += getNumRegisto().hashCode();
        }
        if (getTipoAutoria() != null) {
            _hashCode += getTipoAutoria().hashCode();
        }
        if (getTipoTarefa() != null) {
            _hashCode += getTipoTarefa().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Conteudo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "conteudo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
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
        elemField.setFieldName("localizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConjunto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numConjunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numIdentificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numIdentificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegisto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRegisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAutoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoAutoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTarefa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTarefa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
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
