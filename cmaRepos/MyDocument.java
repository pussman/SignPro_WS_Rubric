/**
 * MyDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class MyDocument  implements java.io.Serializable {
    private java.lang.String amec;

    private java.lang.String businessApp;

    private java.lang.String catSeguranca;

    private java.lang.String category;

    private java.lang.String cdu;

    private java.lang.String collection;

    private java.lang.String contentType;

    private cmaRepos.Conteudo conteudo;

    private java.lang.String copyright;

    private java.util.Calendar created;

    private java.lang.String createdBy;

    private byte[] dados;

    private boolean digitalSign;

    private java.lang.String docOriginal;

    private java.lang.String docType;

    private java.lang.String docVital;

    private cmaRepos.Entidade entidade;

    private java.lang.String existeEmPapel;

    private java.util.Calendar expirationDate;

    private int fid;

    private java.lang.String id;

    private java.lang.String idFinalDoc;

    private java.util.Calendar inserted;

    private java.lang.String insertedBy;

    private boolean internalDoc;

    private java.lang.String keywords;

    private cmaRepos.Entidade[] lstEntidades;

    private java.lang.String mef;

    private java.util.Calendar metaDate;

    private java.lang.String metaUser;

    private cmaRepos.MetaDoc metadados;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String origemDoc;

    private boolean otherFormat;

    private java.lang.String pasta;

    private int pid;

    private java.lang.String reference;

    private int rowid;

    private java.lang.String service;

    private int showValidIcon;

    private long size;

    private java.lang.String status;

    private java.lang.String subPasta;

    private java.lang.String subSubPasta;

    private java.lang.String subject;

    private java.lang.String subsystem;

    private java.lang.String tipologia;

    private java.lang.String title;

    private boolean toCatalogue;

    private java.lang.String txtDtInsercao;

    private java.lang.String txtDtVersao;

    private java.lang.String url;

    private java.lang.String usersAcesso;

    private java.util.Calendar versionDate;

    private int versionNumber;

    private java.lang.String versionUser;

    public MyDocument() {
    }

    public MyDocument(
           java.lang.String amec,
           java.lang.String businessApp,
           java.lang.String catSeguranca,
           java.lang.String category,
           java.lang.String cdu,
           java.lang.String collection,
           java.lang.String contentType,
           cmaRepos.Conteudo conteudo,
           java.lang.String copyright,
           java.util.Calendar created,
           java.lang.String createdBy,
           byte[] dados,
           boolean digitalSign,
           java.lang.String docOriginal,
           java.lang.String docType,
           java.lang.String docVital,
           cmaRepos.Entidade entidade,
           java.lang.String existeEmPapel,
           java.util.Calendar expirationDate,
           int fid,
           java.lang.String id,
           java.lang.String idFinalDoc,
           java.util.Calendar inserted,
           java.lang.String insertedBy,
           boolean internalDoc,
           java.lang.String keywords,
           cmaRepos.Entidade[] lstEntidades,
           java.lang.String mef,
           java.util.Calendar metaDate,
           java.lang.String metaUser,
           cmaRepos.MetaDoc metadados,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String origemDoc,
           boolean otherFormat,
           java.lang.String pasta,
           int pid,
           java.lang.String reference,
           int rowid,
           java.lang.String service,
           int showValidIcon,
           long size,
           java.lang.String status,
           java.lang.String subPasta,
           java.lang.String subSubPasta,
           java.lang.String subject,
           java.lang.String subsystem,
           java.lang.String tipologia,
           java.lang.String title,
           boolean toCatalogue,
           java.lang.String txtDtInsercao,
           java.lang.String txtDtVersao,
           java.lang.String url,
           java.lang.String usersAcesso,
           java.util.Calendar versionDate,
           int versionNumber,
           java.lang.String versionUser) {
           this.amec = amec;
           this.businessApp = businessApp;
           this.catSeguranca = catSeguranca;
           this.category = category;
           this.cdu = cdu;
           this.collection = collection;
           this.contentType = contentType;
           this.conteudo = conteudo;
           this.copyright = copyright;
           this.created = created;
           this.createdBy = createdBy;
           this.dados = dados;
           this.digitalSign = digitalSign;
           this.docOriginal = docOriginal;
           this.docType = docType;
           this.docVital = docVital;
           this.entidade = entidade;
           this.existeEmPapel = existeEmPapel;
           this.expirationDate = expirationDate;
           this.fid = fid;
           this.id = id;
           this.idFinalDoc = idFinalDoc;
           this.inserted = inserted;
           this.insertedBy = insertedBy;
           this.internalDoc = internalDoc;
           this.keywords = keywords;
           this.lstEntidades = lstEntidades;
           this.mef = mef;
           this.metaDate = metaDate;
           this.metaUser = metaUser;
           this.metadados = metadados;
           this.name = name;
           this.notes = notes;
           this.origemDoc = origemDoc;
           this.otherFormat = otherFormat;
           this.pasta = pasta;
           this.pid = pid;
           this.reference = reference;
           this.rowid = rowid;
           this.service = service;
           this.showValidIcon = showValidIcon;
           this.size = size;
           this.status = status;
           this.subPasta = subPasta;
           this.subSubPasta = subSubPasta;
           this.subject = subject;
           this.subsystem = subsystem;
           this.tipologia = tipologia;
           this.title = title;
           this.toCatalogue = toCatalogue;
           this.txtDtInsercao = txtDtInsercao;
           this.txtDtVersao = txtDtVersao;
           this.url = url;
           this.usersAcesso = usersAcesso;
           this.versionDate = versionDate;
           this.versionNumber = versionNumber;
           this.versionUser = versionUser;
    }


    /**
     * Gets the amec value for this MyDocument.
     * 
     * @return amec
     */
    public java.lang.String getAmec() {
        return amec;
    }


    /**
     * Sets the amec value for this MyDocument.
     * 
     * @param amec
     */
    public void setAmec(java.lang.String amec) {
        this.amec = amec;
    }


    /**
     * Gets the businessApp value for this MyDocument.
     * 
     * @return businessApp
     */
    public java.lang.String getBusinessApp() {
        return businessApp;
    }


    /**
     * Sets the businessApp value for this MyDocument.
     * 
     * @param businessApp
     */
    public void setBusinessApp(java.lang.String businessApp) {
        this.businessApp = businessApp;
    }


    /**
     * Gets the catSeguranca value for this MyDocument.
     * 
     * @return catSeguranca
     */
    public java.lang.String getCatSeguranca() {
        return catSeguranca;
    }


    /**
     * Sets the catSeguranca value for this MyDocument.
     * 
     * @param catSeguranca
     */
    public void setCatSeguranca(java.lang.String catSeguranca) {
        this.catSeguranca = catSeguranca;
    }


    /**
     * Gets the category value for this MyDocument.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this MyDocument.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the cdu value for this MyDocument.
     * 
     * @return cdu
     */
    public java.lang.String getCdu() {
        return cdu;
    }


    /**
     * Sets the cdu value for this MyDocument.
     * 
     * @param cdu
     */
    public void setCdu(java.lang.String cdu) {
        this.cdu = cdu;
    }


    /**
     * Gets the collection value for this MyDocument.
     * 
     * @return collection
     */
    public java.lang.String getCollection() {
        return collection;
    }


    /**
     * Sets the collection value for this MyDocument.
     * 
     * @param collection
     */
    public void setCollection(java.lang.String collection) {
        this.collection = collection;
    }


    /**
     * Gets the contentType value for this MyDocument.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this MyDocument.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the conteudo value for this MyDocument.
     * 
     * @return conteudo
     */
    public cmaRepos.Conteudo getConteudo() {
        return conteudo;
    }


    /**
     * Sets the conteudo value for this MyDocument.
     * 
     * @param conteudo
     */
    public void setConteudo(cmaRepos.Conteudo conteudo) {
        this.conteudo = conteudo;
    }


    /**
     * Gets the copyright value for this MyDocument.
     * 
     * @return copyright
     */
    public java.lang.String getCopyright() {
        return copyright;
    }


    /**
     * Sets the copyright value for this MyDocument.
     * 
     * @param copyright
     */
    public void setCopyright(java.lang.String copyright) {
        this.copyright = copyright;
    }


    /**
     * Gets the created value for this MyDocument.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this MyDocument.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the createdBy value for this MyDocument.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this MyDocument.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dados value for this MyDocument.
     * 
     * @return dados
     */
    public byte[] getDados() {
        return dados;
    }


    /**
     * Sets the dados value for this MyDocument.
     * 
     * @param dados
     */
    public void setDados(byte[] dados) {
        this.dados = dados;
    }


    /**
     * Gets the digitalSign value for this MyDocument.
     * 
     * @return digitalSign
     */
    public boolean isDigitalSign() {
        return digitalSign;
    }


    /**
     * Sets the digitalSign value for this MyDocument.
     * 
     * @param digitalSign
     */
    public void setDigitalSign(boolean digitalSign) {
        this.digitalSign = digitalSign;
    }


    /**
     * Gets the docOriginal value for this MyDocument.
     * 
     * @return docOriginal
     */
    public java.lang.String getDocOriginal() {
        return docOriginal;
    }


    /**
     * Sets the docOriginal value for this MyDocument.
     * 
     * @param docOriginal
     */
    public void setDocOriginal(java.lang.String docOriginal) {
        this.docOriginal = docOriginal;
    }


    /**
     * Gets the docType value for this MyDocument.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this MyDocument.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the docVital value for this MyDocument.
     * 
     * @return docVital
     */
    public java.lang.String getDocVital() {
        return docVital;
    }


    /**
     * Sets the docVital value for this MyDocument.
     * 
     * @param docVital
     */
    public void setDocVital(java.lang.String docVital) {
        this.docVital = docVital;
    }


    /**
     * Gets the entidade value for this MyDocument.
     * 
     * @return entidade
     */
    public cmaRepos.Entidade getEntidade() {
        return entidade;
    }


    /**
     * Sets the entidade value for this MyDocument.
     * 
     * @param entidade
     */
    public void setEntidade(cmaRepos.Entidade entidade) {
        this.entidade = entidade;
    }


    /**
     * Gets the existeEmPapel value for this MyDocument.
     * 
     * @return existeEmPapel
     */
    public java.lang.String getExisteEmPapel() {
        return existeEmPapel;
    }


    /**
     * Sets the existeEmPapel value for this MyDocument.
     * 
     * @param existeEmPapel
     */
    public void setExisteEmPapel(java.lang.String existeEmPapel) {
        this.existeEmPapel = existeEmPapel;
    }


    /**
     * Gets the expirationDate value for this MyDocument.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this MyDocument.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the fid value for this MyDocument.
     * 
     * @return fid
     */
    public int getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this MyDocument.
     * 
     * @param fid
     */
    public void setFid(int fid) {
        this.fid = fid;
    }


    /**
     * Gets the id value for this MyDocument.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this MyDocument.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the idFinalDoc value for this MyDocument.
     * 
     * @return idFinalDoc
     */
    public java.lang.String getIdFinalDoc() {
        return idFinalDoc;
    }


    /**
     * Sets the idFinalDoc value for this MyDocument.
     * 
     * @param idFinalDoc
     */
    public void setIdFinalDoc(java.lang.String idFinalDoc) {
        this.idFinalDoc = idFinalDoc;
    }


    /**
     * Gets the inserted value for this MyDocument.
     * 
     * @return inserted
     */
    public java.util.Calendar getInserted() {
        return inserted;
    }


    /**
     * Sets the inserted value for this MyDocument.
     * 
     * @param inserted
     */
    public void setInserted(java.util.Calendar inserted) {
        this.inserted = inserted;
    }


    /**
     * Gets the insertedBy value for this MyDocument.
     * 
     * @return insertedBy
     */
    public java.lang.String getInsertedBy() {
        return insertedBy;
    }


    /**
     * Sets the insertedBy value for this MyDocument.
     * 
     * @param insertedBy
     */
    public void setInsertedBy(java.lang.String insertedBy) {
        this.insertedBy = insertedBy;
    }


    /**
     * Gets the internalDoc value for this MyDocument.
     * 
     * @return internalDoc
     */
    public boolean isInternalDoc() {
        return internalDoc;
    }


    /**
     * Sets the internalDoc value for this MyDocument.
     * 
     * @param internalDoc
     */
    public void setInternalDoc(boolean internalDoc) {
        this.internalDoc = internalDoc;
    }


    /**
     * Gets the keywords value for this MyDocument.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this MyDocument.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the lstEntidades value for this MyDocument.
     * 
     * @return lstEntidades
     */
    public cmaRepos.Entidade[] getLstEntidades() {
        return lstEntidades;
    }


    /**
     * Sets the lstEntidades value for this MyDocument.
     * 
     * @param lstEntidades
     */
    public void setLstEntidades(cmaRepos.Entidade[] lstEntidades) {
        this.lstEntidades = lstEntidades;
    }

    public cmaRepos.Entidade getLstEntidades(int i) {
        return this.lstEntidades[i];
    }

    public void setLstEntidades(int i, cmaRepos.Entidade _value) {
        this.lstEntidades[i] = _value;
    }


    /**
     * Gets the mef value for this MyDocument.
     * 
     * @return mef
     */
    public java.lang.String getMef() {
        return mef;
    }


    /**
     * Sets the mef value for this MyDocument.
     * 
     * @param mef
     */
    public void setMef(java.lang.String mef) {
        this.mef = mef;
    }


    /**
     * Gets the metaDate value for this MyDocument.
     * 
     * @return metaDate
     */
    public java.util.Calendar getMetaDate() {
        return metaDate;
    }


    /**
     * Sets the metaDate value for this MyDocument.
     * 
     * @param metaDate
     */
    public void setMetaDate(java.util.Calendar metaDate) {
        this.metaDate = metaDate;
    }


    /**
     * Gets the metaUser value for this MyDocument.
     * 
     * @return metaUser
     */
    public java.lang.String getMetaUser() {
        return metaUser;
    }


    /**
     * Sets the metaUser value for this MyDocument.
     * 
     * @param metaUser
     */
    public void setMetaUser(java.lang.String metaUser) {
        this.metaUser = metaUser;
    }


    /**
     * Gets the metadados value for this MyDocument.
     * 
     * @return metadados
     */
    public cmaRepos.MetaDoc getMetadados() {
        return metadados;
    }


    /**
     * Sets the metadados value for this MyDocument.
     * 
     * @param metadados
     */
    public void setMetadados(cmaRepos.MetaDoc metadados) {
        this.metadados = metadados;
    }


    /**
     * Gets the name value for this MyDocument.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MyDocument.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this MyDocument.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this MyDocument.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the origemDoc value for this MyDocument.
     * 
     * @return origemDoc
     */
    public java.lang.String getOrigemDoc() {
        return origemDoc;
    }


    /**
     * Sets the origemDoc value for this MyDocument.
     * 
     * @param origemDoc
     */
    public void setOrigemDoc(java.lang.String origemDoc) {
        this.origemDoc = origemDoc;
    }


    /**
     * Gets the otherFormat value for this MyDocument.
     * 
     * @return otherFormat
     */
    public boolean isOtherFormat() {
        return otherFormat;
    }


    /**
     * Sets the otherFormat value for this MyDocument.
     * 
     * @param otherFormat
     */
    public void setOtherFormat(boolean otherFormat) {
        this.otherFormat = otherFormat;
    }


    /**
     * Gets the pasta value for this MyDocument.
     * 
     * @return pasta
     */
    public java.lang.String getPasta() {
        return pasta;
    }


    /**
     * Sets the pasta value for this MyDocument.
     * 
     * @param pasta
     */
    public void setPasta(java.lang.String pasta) {
        this.pasta = pasta;
    }


    /**
     * Gets the pid value for this MyDocument.
     * 
     * @return pid
     */
    public int getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this MyDocument.
     * 
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }


    /**
     * Gets the reference value for this MyDocument.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this MyDocument.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the rowid value for this MyDocument.
     * 
     * @return rowid
     */
    public int getRowid() {
        return rowid;
    }


    /**
     * Sets the rowid value for this MyDocument.
     * 
     * @param rowid
     */
    public void setRowid(int rowid) {
        this.rowid = rowid;
    }


    /**
     * Gets the service value for this MyDocument.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this MyDocument.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the showValidIcon value for this MyDocument.
     * 
     * @return showValidIcon
     */
    public int getShowValidIcon() {
        return showValidIcon;
    }


    /**
     * Sets the showValidIcon value for this MyDocument.
     * 
     * @param showValidIcon
     */
    public void setShowValidIcon(int showValidIcon) {
        this.showValidIcon = showValidIcon;
    }


    /**
     * Gets the size value for this MyDocument.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this MyDocument.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the status value for this MyDocument.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MyDocument.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subPasta value for this MyDocument.
     * 
     * @return subPasta
     */
    public java.lang.String getSubPasta() {
        return subPasta;
    }


    /**
     * Sets the subPasta value for this MyDocument.
     * 
     * @param subPasta
     */
    public void setSubPasta(java.lang.String subPasta) {
        this.subPasta = subPasta;
    }


    /**
     * Gets the subSubPasta value for this MyDocument.
     * 
     * @return subSubPasta
     */
    public java.lang.String getSubSubPasta() {
        return subSubPasta;
    }


    /**
     * Sets the subSubPasta value for this MyDocument.
     * 
     * @param subSubPasta
     */
    public void setSubSubPasta(java.lang.String subSubPasta) {
        this.subSubPasta = subSubPasta;
    }


    /**
     * Gets the subject value for this MyDocument.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MyDocument.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the subsystem value for this MyDocument.
     * 
     * @return subsystem
     */
    public java.lang.String getSubsystem() {
        return subsystem;
    }


    /**
     * Sets the subsystem value for this MyDocument.
     * 
     * @param subsystem
     */
    public void setSubsystem(java.lang.String subsystem) {
        this.subsystem = subsystem;
    }


    /**
     * Gets the tipologia value for this MyDocument.
     * 
     * @return tipologia
     */
    public java.lang.String getTipologia() {
        return tipologia;
    }


    /**
     * Sets the tipologia value for this MyDocument.
     * 
     * @param tipologia
     */
    public void setTipologia(java.lang.String tipologia) {
        this.tipologia = tipologia;
    }


    /**
     * Gets the title value for this MyDocument.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this MyDocument.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the toCatalogue value for this MyDocument.
     * 
     * @return toCatalogue
     */
    public boolean isToCatalogue() {
        return toCatalogue;
    }


    /**
     * Sets the toCatalogue value for this MyDocument.
     * 
     * @param toCatalogue
     */
    public void setToCatalogue(boolean toCatalogue) {
        this.toCatalogue = toCatalogue;
    }


    /**
     * Gets the txtDtInsercao value for this MyDocument.
     * 
     * @return txtDtInsercao
     */
    public java.lang.String getTxtDtInsercao() {
        return txtDtInsercao;
    }


    /**
     * Sets the txtDtInsercao value for this MyDocument.
     * 
     * @param txtDtInsercao
     */
    public void setTxtDtInsercao(java.lang.String txtDtInsercao) {
        this.txtDtInsercao = txtDtInsercao;
    }


    /**
     * Gets the txtDtVersao value for this MyDocument.
     * 
     * @return txtDtVersao
     */
    public java.lang.String getTxtDtVersao() {
        return txtDtVersao;
    }


    /**
     * Sets the txtDtVersao value for this MyDocument.
     * 
     * @param txtDtVersao
     */
    public void setTxtDtVersao(java.lang.String txtDtVersao) {
        this.txtDtVersao = txtDtVersao;
    }


    /**
     * Gets the url value for this MyDocument.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this MyDocument.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the usersAcesso value for this MyDocument.
     * 
     * @return usersAcesso
     */
    public java.lang.String getUsersAcesso() {
        return usersAcesso;
    }


    /**
     * Sets the usersAcesso value for this MyDocument.
     * 
     * @param usersAcesso
     */
    public void setUsersAcesso(java.lang.String usersAcesso) {
        this.usersAcesso = usersAcesso;
    }


    /**
     * Gets the versionDate value for this MyDocument.
     * 
     * @return versionDate
     */
    public java.util.Calendar getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this MyDocument.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.util.Calendar versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionNumber value for this MyDocument.
     * 
     * @return versionNumber
     */
    public int getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this MyDocument.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the versionUser value for this MyDocument.
     * 
     * @return versionUser
     */
    public java.lang.String getVersionUser() {
        return versionUser;
    }


    /**
     * Sets the versionUser value for this MyDocument.
     * 
     * @param versionUser
     */
    public void setVersionUser(java.lang.String versionUser) {
        this.versionUser = versionUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyDocument)) return false;
        MyDocument other = (MyDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amec==null && other.getAmec()==null) || 
             (this.amec!=null &&
              this.amec.equals(other.getAmec()))) &&
            ((this.businessApp==null && other.getBusinessApp()==null) || 
             (this.businessApp!=null &&
              this.businessApp.equals(other.getBusinessApp()))) &&
            ((this.catSeguranca==null && other.getCatSeguranca()==null) || 
             (this.catSeguranca!=null &&
              this.catSeguranca.equals(other.getCatSeguranca()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.cdu==null && other.getCdu()==null) || 
             (this.cdu!=null &&
              this.cdu.equals(other.getCdu()))) &&
            ((this.collection==null && other.getCollection()==null) || 
             (this.collection!=null &&
              this.collection.equals(other.getCollection()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.conteudo==null && other.getConteudo()==null) || 
             (this.conteudo!=null &&
              this.conteudo.equals(other.getConteudo()))) &&
            ((this.copyright==null && other.getCopyright()==null) || 
             (this.copyright!=null &&
              this.copyright.equals(other.getCopyright()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dados==null && other.getDados()==null) || 
             (this.dados!=null &&
              java.util.Arrays.equals(this.dados, other.getDados()))) &&
            this.digitalSign == other.isDigitalSign() &&
            ((this.docOriginal==null && other.getDocOriginal()==null) || 
             (this.docOriginal!=null &&
              this.docOriginal.equals(other.getDocOriginal()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.docVital==null && other.getDocVital()==null) || 
             (this.docVital!=null &&
              this.docVital.equals(other.getDocVital()))) &&
            ((this.entidade==null && other.getEntidade()==null) || 
             (this.entidade!=null &&
              this.entidade.equals(other.getEntidade()))) &&
            ((this.existeEmPapel==null && other.getExisteEmPapel()==null) || 
             (this.existeEmPapel!=null &&
              this.existeEmPapel.equals(other.getExisteEmPapel()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            this.fid == other.getFid() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idFinalDoc==null && other.getIdFinalDoc()==null) || 
             (this.idFinalDoc!=null &&
              this.idFinalDoc.equals(other.getIdFinalDoc()))) &&
            ((this.inserted==null && other.getInserted()==null) || 
             (this.inserted!=null &&
              this.inserted.equals(other.getInserted()))) &&
            ((this.insertedBy==null && other.getInsertedBy()==null) || 
             (this.insertedBy!=null &&
              this.insertedBy.equals(other.getInsertedBy()))) &&
            this.internalDoc == other.isInternalDoc() &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.lstEntidades==null && other.getLstEntidades()==null) || 
             (this.lstEntidades!=null &&
              java.util.Arrays.equals(this.lstEntidades, other.getLstEntidades()))) &&
            ((this.mef==null && other.getMef()==null) || 
             (this.mef!=null &&
              this.mef.equals(other.getMef()))) &&
            ((this.metaDate==null && other.getMetaDate()==null) || 
             (this.metaDate!=null &&
              this.metaDate.equals(other.getMetaDate()))) &&
            ((this.metaUser==null && other.getMetaUser()==null) || 
             (this.metaUser!=null &&
              this.metaUser.equals(other.getMetaUser()))) &&
            ((this.metadados==null && other.getMetadados()==null) || 
             (this.metadados!=null &&
              this.metadados.equals(other.getMetadados()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.origemDoc==null && other.getOrigemDoc()==null) || 
             (this.origemDoc!=null &&
              this.origemDoc.equals(other.getOrigemDoc()))) &&
            this.otherFormat == other.isOtherFormat() &&
            ((this.pasta==null && other.getPasta()==null) || 
             (this.pasta!=null &&
              this.pasta.equals(other.getPasta()))) &&
            this.pid == other.getPid() &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            this.rowid == other.getRowid() &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            this.showValidIcon == other.getShowValidIcon() &&
            this.size == other.getSize() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subPasta==null && other.getSubPasta()==null) || 
             (this.subPasta!=null &&
              this.subPasta.equals(other.getSubPasta()))) &&
            ((this.subSubPasta==null && other.getSubSubPasta()==null) || 
             (this.subSubPasta!=null &&
              this.subSubPasta.equals(other.getSubSubPasta()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.subsystem==null && other.getSubsystem()==null) || 
             (this.subsystem!=null &&
              this.subsystem.equals(other.getSubsystem()))) &&
            ((this.tipologia==null && other.getTipologia()==null) || 
             (this.tipologia!=null &&
              this.tipologia.equals(other.getTipologia()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.toCatalogue == other.isToCatalogue() &&
            ((this.txtDtInsercao==null && other.getTxtDtInsercao()==null) || 
             (this.txtDtInsercao!=null &&
              this.txtDtInsercao.equals(other.getTxtDtInsercao()))) &&
            ((this.txtDtVersao==null && other.getTxtDtVersao()==null) || 
             (this.txtDtVersao!=null &&
              this.txtDtVersao.equals(other.getTxtDtVersao()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.usersAcesso==null && other.getUsersAcesso()==null) || 
             (this.usersAcesso!=null &&
              this.usersAcesso.equals(other.getUsersAcesso()))) &&
            ((this.versionDate==null && other.getVersionDate()==null) || 
             (this.versionDate!=null &&
              this.versionDate.equals(other.getVersionDate()))) &&
            this.versionNumber == other.getVersionNumber() &&
            ((this.versionUser==null && other.getVersionUser()==null) || 
             (this.versionUser!=null &&
              this.versionUser.equals(other.getVersionUser())));
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
        if (getAmec() != null) {
            _hashCode += getAmec().hashCode();
        }
        if (getBusinessApp() != null) {
            _hashCode += getBusinessApp().hashCode();
        }
        if (getCatSeguranca() != null) {
            _hashCode += getCatSeguranca().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCdu() != null) {
            _hashCode += getCdu().hashCode();
        }
        if (getCollection() != null) {
            _hashCode += getCollection().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getConteudo() != null) {
            _hashCode += getConteudo().hashCode();
        }
        if (getCopyright() != null) {
            _hashCode += getCopyright().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDigitalSign() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDocOriginal() != null) {
            _hashCode += getDocOriginal().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getDocVital() != null) {
            _hashCode += getDocVital().hashCode();
        }
        if (getEntidade() != null) {
            _hashCode += getEntidade().hashCode();
        }
        if (getExisteEmPapel() != null) {
            _hashCode += getExisteEmPapel().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        _hashCode += getFid();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdFinalDoc() != null) {
            _hashCode += getIdFinalDoc().hashCode();
        }
        if (getInserted() != null) {
            _hashCode += getInserted().hashCode();
        }
        if (getInsertedBy() != null) {
            _hashCode += getInsertedBy().hashCode();
        }
        _hashCode += (isInternalDoc() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getLstEntidades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstEntidades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstEntidades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMef() != null) {
            _hashCode += getMef().hashCode();
        }
        if (getMetaDate() != null) {
            _hashCode += getMetaDate().hashCode();
        }
        if (getMetaUser() != null) {
            _hashCode += getMetaUser().hashCode();
        }
        if (getMetadados() != null) {
            _hashCode += getMetadados().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOrigemDoc() != null) {
            _hashCode += getOrigemDoc().hashCode();
        }
        _hashCode += (isOtherFormat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPasta() != null) {
            _hashCode += getPasta().hashCode();
        }
        _hashCode += getPid();
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        _hashCode += getRowid();
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        _hashCode += getShowValidIcon();
        _hashCode += new Long(getSize()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubPasta() != null) {
            _hashCode += getSubPasta().hashCode();
        }
        if (getSubSubPasta() != null) {
            _hashCode += getSubSubPasta().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSubsystem() != null) {
            _hashCode += getSubsystem().hashCode();
        }
        if (getTipologia() != null) {
            _hashCode += getTipologia().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += (isToCatalogue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTxtDtInsercao() != null) {
            _hashCode += getTxtDtInsercao().hashCode();
        }
        if (getTxtDtVersao() != null) {
            _hashCode += getTxtDtVersao().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUsersAcesso() != null) {
            _hashCode += getUsersAcesso().hashCode();
        }
        if (getVersionDate() != null) {
            _hashCode += getVersionDate().hashCode();
        }
        _hashCode += getVersionNumber();
        if (getVersionUser() != null) {
            _hashCode += getVersionUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "myDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessApp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catSeguranca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "catSeguranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conteudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conteudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "conteudo"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitalSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docVital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docVital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "entidade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existeEmPapel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existeEmPapel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("idFinalDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFinalDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inserted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inserted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstEntidades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstEntidades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "entidade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metaDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metaUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metadados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "metaDoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origemDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origemDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pasta"));
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
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showValidIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showValidIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subPasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSubPasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subSubPasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCatalogue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCatalogue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtDtInsercao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txtDtInsercao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtDtVersao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txtDtVersao"));
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
        elemField.setFieldName("usersAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usersAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionUser"));
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
