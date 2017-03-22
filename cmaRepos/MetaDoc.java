/**
 * MetaDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class MetaDoc  implements java.io.Serializable {
    private java.lang.String assunto;

    private java.lang.String autor;

    private java.lang.String coAutor;

    private java.lang.String copyright;

    private java.util.Calendar dataHoraCarregamento;

    private java.lang.String editor;

    private boolean existeOutrosFormatos;

    private java.lang.String extensao;

    private java.lang.String natEspecifica;

    private java.lang.String natGeral;

    private java.lang.String nomeFicheiro;

    private java.lang.String notasConteudo;

    private java.lang.String notasGerais;

    private java.lang.String numRec;

    private java.lang.String produtor;

    private java.lang.String servicoCarregou;

    private long tamanho;

    private java.lang.String titulo;

    private java.lang.String url;

    private java.lang.String userCarregou;

    public MetaDoc() {
    }

    public MetaDoc(
           java.lang.String assunto,
           java.lang.String autor,
           java.lang.String coAutor,
           java.lang.String copyright,
           java.util.Calendar dataHoraCarregamento,
           java.lang.String editor,
           boolean existeOutrosFormatos,
           java.lang.String extensao,
           java.lang.String natEspecifica,
           java.lang.String natGeral,
           java.lang.String nomeFicheiro,
           java.lang.String notasConteudo,
           java.lang.String notasGerais,
           java.lang.String numRec,
           java.lang.String produtor,
           java.lang.String servicoCarregou,
           long tamanho,
           java.lang.String titulo,
           java.lang.String url,
           java.lang.String userCarregou) {
           this.assunto = assunto;
           this.autor = autor;
           this.coAutor = coAutor;
           this.copyright = copyright;
           this.dataHoraCarregamento = dataHoraCarregamento;
           this.editor = editor;
           this.existeOutrosFormatos = existeOutrosFormatos;
           this.extensao = extensao;
           this.natEspecifica = natEspecifica;
           this.natGeral = natGeral;
           this.nomeFicheiro = nomeFicheiro;
           this.notasConteudo = notasConteudo;
           this.notasGerais = notasGerais;
           this.numRec = numRec;
           this.produtor = produtor;
           this.servicoCarregou = servicoCarregou;
           this.tamanho = tamanho;
           this.titulo = titulo;
           this.url = url;
           this.userCarregou = userCarregou;
    }


    /**
     * Gets the assunto value for this MetaDoc.
     * 
     * @return assunto
     */
    public java.lang.String getAssunto() {
        return assunto;
    }


    /**
     * Sets the assunto value for this MetaDoc.
     * 
     * @param assunto
     */
    public void setAssunto(java.lang.String assunto) {
        this.assunto = assunto;
    }


    /**
     * Gets the autor value for this MetaDoc.
     * 
     * @return autor
     */
    public java.lang.String getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this MetaDoc.
     * 
     * @param autor
     */
    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }


    /**
     * Gets the coAutor value for this MetaDoc.
     * 
     * @return coAutor
     */
    public java.lang.String getCoAutor() {
        return coAutor;
    }


    /**
     * Sets the coAutor value for this MetaDoc.
     * 
     * @param coAutor
     */
    public void setCoAutor(java.lang.String coAutor) {
        this.coAutor = coAutor;
    }


    /**
     * Gets the copyright value for this MetaDoc.
     * 
     * @return copyright
     */
    public java.lang.String getCopyright() {
        return copyright;
    }


    /**
     * Sets the copyright value for this MetaDoc.
     * 
     * @param copyright
     */
    public void setCopyright(java.lang.String copyright) {
        this.copyright = copyright;
    }


    /**
     * Gets the dataHoraCarregamento value for this MetaDoc.
     * 
     * @return dataHoraCarregamento
     */
    public java.util.Calendar getDataHoraCarregamento() {
        return dataHoraCarregamento;
    }


    /**
     * Sets the dataHoraCarregamento value for this MetaDoc.
     * 
     * @param dataHoraCarregamento
     */
    public void setDataHoraCarregamento(java.util.Calendar dataHoraCarregamento) {
        this.dataHoraCarregamento = dataHoraCarregamento;
    }


    /**
     * Gets the editor value for this MetaDoc.
     * 
     * @return editor
     */
    public java.lang.String getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this MetaDoc.
     * 
     * @param editor
     */
    public void setEditor(java.lang.String editor) {
        this.editor = editor;
    }


    /**
     * Gets the existeOutrosFormatos value for this MetaDoc.
     * 
     * @return existeOutrosFormatos
     */
    public boolean isExisteOutrosFormatos() {
        return existeOutrosFormatos;
    }


    /**
     * Sets the existeOutrosFormatos value for this MetaDoc.
     * 
     * @param existeOutrosFormatos
     */
    public void setExisteOutrosFormatos(boolean existeOutrosFormatos) {
        this.existeOutrosFormatos = existeOutrosFormatos;
    }


    /**
     * Gets the extensao value for this MetaDoc.
     * 
     * @return extensao
     */
    public java.lang.String getExtensao() {
        return extensao;
    }


    /**
     * Sets the extensao value for this MetaDoc.
     * 
     * @param extensao
     */
    public void setExtensao(java.lang.String extensao) {
        this.extensao = extensao;
    }


    /**
     * Gets the natEspecifica value for this MetaDoc.
     * 
     * @return natEspecifica
     */
    public java.lang.String getNatEspecifica() {
        return natEspecifica;
    }


    /**
     * Sets the natEspecifica value for this MetaDoc.
     * 
     * @param natEspecifica
     */
    public void setNatEspecifica(java.lang.String natEspecifica) {
        this.natEspecifica = natEspecifica;
    }


    /**
     * Gets the natGeral value for this MetaDoc.
     * 
     * @return natGeral
     */
    public java.lang.String getNatGeral() {
        return natGeral;
    }


    /**
     * Sets the natGeral value for this MetaDoc.
     * 
     * @param natGeral
     */
    public void setNatGeral(java.lang.String natGeral) {
        this.natGeral = natGeral;
    }


    /**
     * Gets the nomeFicheiro value for this MetaDoc.
     * 
     * @return nomeFicheiro
     */
    public java.lang.String getNomeFicheiro() {
        return nomeFicheiro;
    }


    /**
     * Sets the nomeFicheiro value for this MetaDoc.
     * 
     * @param nomeFicheiro
     */
    public void setNomeFicheiro(java.lang.String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }


    /**
     * Gets the notasConteudo value for this MetaDoc.
     * 
     * @return notasConteudo
     */
    public java.lang.String getNotasConteudo() {
        return notasConteudo;
    }


    /**
     * Sets the notasConteudo value for this MetaDoc.
     * 
     * @param notasConteudo
     */
    public void setNotasConteudo(java.lang.String notasConteudo) {
        this.notasConteudo = notasConteudo;
    }


    /**
     * Gets the notasGerais value for this MetaDoc.
     * 
     * @return notasGerais
     */
    public java.lang.String getNotasGerais() {
        return notasGerais;
    }


    /**
     * Sets the notasGerais value for this MetaDoc.
     * 
     * @param notasGerais
     */
    public void setNotasGerais(java.lang.String notasGerais) {
        this.notasGerais = notasGerais;
    }


    /**
     * Gets the numRec value for this MetaDoc.
     * 
     * @return numRec
     */
    public java.lang.String getNumRec() {
        return numRec;
    }


    /**
     * Sets the numRec value for this MetaDoc.
     * 
     * @param numRec
     */
    public void setNumRec(java.lang.String numRec) {
        this.numRec = numRec;
    }


    /**
     * Gets the produtor value for this MetaDoc.
     * 
     * @return produtor
     */
    public java.lang.String getProdutor() {
        return produtor;
    }


    /**
     * Sets the produtor value for this MetaDoc.
     * 
     * @param produtor
     */
    public void setProdutor(java.lang.String produtor) {
        this.produtor = produtor;
    }


    /**
     * Gets the servicoCarregou value for this MetaDoc.
     * 
     * @return servicoCarregou
     */
    public java.lang.String getServicoCarregou() {
        return servicoCarregou;
    }


    /**
     * Sets the servicoCarregou value for this MetaDoc.
     * 
     * @param servicoCarregou
     */
    public void setServicoCarregou(java.lang.String servicoCarregou) {
        this.servicoCarregou = servicoCarregou;
    }


    /**
     * Gets the tamanho value for this MetaDoc.
     * 
     * @return tamanho
     */
    public long getTamanho() {
        return tamanho;
    }


    /**
     * Sets the tamanho value for this MetaDoc.
     * 
     * @param tamanho
     */
    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }


    /**
     * Gets the titulo value for this MetaDoc.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this MetaDoc.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }


    /**
     * Gets the url value for this MetaDoc.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this MetaDoc.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the userCarregou value for this MetaDoc.
     * 
     * @return userCarregou
     */
    public java.lang.String getUserCarregou() {
        return userCarregou;
    }


    /**
     * Sets the userCarregou value for this MetaDoc.
     * 
     * @param userCarregou
     */
    public void setUserCarregou(java.lang.String userCarregou) {
        this.userCarregou = userCarregou;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaDoc)) return false;
        MetaDoc other = (MetaDoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assunto==null && other.getAssunto()==null) || 
             (this.assunto!=null &&
              this.assunto.equals(other.getAssunto()))) &&
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.coAutor==null && other.getCoAutor()==null) || 
             (this.coAutor!=null &&
              this.coAutor.equals(other.getCoAutor()))) &&
            ((this.copyright==null && other.getCopyright()==null) || 
             (this.copyright!=null &&
              this.copyright.equals(other.getCopyright()))) &&
            ((this.dataHoraCarregamento==null && other.getDataHoraCarregamento()==null) || 
             (this.dataHoraCarregamento!=null &&
              this.dataHoraCarregamento.equals(other.getDataHoraCarregamento()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            this.existeOutrosFormatos == other.isExisteOutrosFormatos() &&
            ((this.extensao==null && other.getExtensao()==null) || 
             (this.extensao!=null &&
              this.extensao.equals(other.getExtensao()))) &&
            ((this.natEspecifica==null && other.getNatEspecifica()==null) || 
             (this.natEspecifica!=null &&
              this.natEspecifica.equals(other.getNatEspecifica()))) &&
            ((this.natGeral==null && other.getNatGeral()==null) || 
             (this.natGeral!=null &&
              this.natGeral.equals(other.getNatGeral()))) &&
            ((this.nomeFicheiro==null && other.getNomeFicheiro()==null) || 
             (this.nomeFicheiro!=null &&
              this.nomeFicheiro.equals(other.getNomeFicheiro()))) &&
            ((this.notasConteudo==null && other.getNotasConteudo()==null) || 
             (this.notasConteudo!=null &&
              this.notasConteudo.equals(other.getNotasConteudo()))) &&
            ((this.notasGerais==null && other.getNotasGerais()==null) || 
             (this.notasGerais!=null &&
              this.notasGerais.equals(other.getNotasGerais()))) &&
            ((this.numRec==null && other.getNumRec()==null) || 
             (this.numRec!=null &&
              this.numRec.equals(other.getNumRec()))) &&
            ((this.produtor==null && other.getProdutor()==null) || 
             (this.produtor!=null &&
              this.produtor.equals(other.getProdutor()))) &&
            ((this.servicoCarregou==null && other.getServicoCarregou()==null) || 
             (this.servicoCarregou!=null &&
              this.servicoCarregou.equals(other.getServicoCarregou()))) &&
            this.tamanho == other.getTamanho() &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.userCarregou==null && other.getUserCarregou()==null) || 
             (this.userCarregou!=null &&
              this.userCarregou.equals(other.getUserCarregou())));
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
        if (getAssunto() != null) {
            _hashCode += getAssunto().hashCode();
        }
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getCoAutor() != null) {
            _hashCode += getCoAutor().hashCode();
        }
        if (getCopyright() != null) {
            _hashCode += getCopyright().hashCode();
        }
        if (getDataHoraCarregamento() != null) {
            _hashCode += getDataHoraCarregamento().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        _hashCode += (isExisteOutrosFormatos() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtensao() != null) {
            _hashCode += getExtensao().hashCode();
        }
        if (getNatEspecifica() != null) {
            _hashCode += getNatEspecifica().hashCode();
        }
        if (getNatGeral() != null) {
            _hashCode += getNatGeral().hashCode();
        }
        if (getNomeFicheiro() != null) {
            _hashCode += getNomeFicheiro().hashCode();
        }
        if (getNotasConteudo() != null) {
            _hashCode += getNotasConteudo().hashCode();
        }
        if (getNotasGerais() != null) {
            _hashCode += getNotasGerais().hashCode();
        }
        if (getNumRec() != null) {
            _hashCode += getNumRec().hashCode();
        }
        if (getProdutor() != null) {
            _hashCode += getProdutor().hashCode();
        }
        if (getServicoCarregou() != null) {
            _hashCode += getServicoCarregou().hashCode();
        }
        _hashCode += new Long(getTamanho()).hashCode();
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUserCarregou() != null) {
            _hashCode += getUserCarregou().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaDoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "metaDoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assunto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coAutor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coAutor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyright");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyright"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHoraCarregamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataHoraCarregamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existeOutrosFormatos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existeOutrosFormatos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natEspecifica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natEspecifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natGeral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natGeral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFicheiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFicheiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasConteudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasConteudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasGerais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasGerais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produtor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "produtor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicoCarregou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicoCarregou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tamanho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tamanho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCarregou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCarregou"));
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
