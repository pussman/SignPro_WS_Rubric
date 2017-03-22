/**
 * Entidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cmaRepos;

public class Entidade  implements java.io.Serializable {
    private java.lang.String atividadeCodIRS;

    private java.lang.String canalPrefComunicacao;

    private boolean cartaoEntregue;

    private boolean cartaoImpresso;

    private boolean cliente;

    private java.lang.String codAtivacao;

    private java.lang.String codAtividadeEconomica;

    private java.lang.String codEstadoCivil;

    private java.lang.String codFreguesiaNaturalidade;

    private java.lang.String codGrupoProfissional;

    private java.lang.String codLocalidadeNaturalidade;

    private java.lang.String codNacionalidade;

    private java.lang.String codNivelEscolaridade;

    private java.lang.String codPaisNacionalidade;

    private java.lang.String codPaisNaturalidade;

    private java.lang.String codProfissao;

    private boolean colaborador;

    private boolean coletividade;

    private boolean contaAtiva;

    private java.lang.String contactosTxt;

    private java.lang.String contumacia;

    private java.util.Calendar created;

    private java.lang.String createdBy;

    private java.util.Calendar dataAtualizacao;

    private java.util.Calendar dataExistenciaFim;

    private java.util.Calendar dataExistenciaInicio;

    private java.util.Calendar dataInscricao;

    private java.util.Calendar dataInscricaoFinancas;

    private java.util.Calendar dataInscricaoSSocial;

    private java.util.Calendar dataNascimento;

    private java.util.Calendar dataObito;

    private java.util.Calendar dataRenovInsc;

    private java.util.Calendar dataValidade;

    private java.lang.String desigComercialOutra;

    private java.lang.String designacao;

    private boolean docVitalicio;

    private java.util.Calendar dtInscPiscina;

    private java.lang.String encEducacao;

    private boolean entidadeArquivistica;

    private java.lang.String entidadeEmissora;

    private java.lang.String escEtarioINE;

    private java.lang.String escEtarioISO;

    private java.lang.String estadoCivil;

    private java.lang.String estadoEntidade;

    private java.lang.String estadoRegisto;

    private boolean estudante;

    private java.lang.String formaJuridica;

    private boolean fornecedor;

    private cmaRepos.InputStream foto_logo;

    private java.lang.String freguesiaNaturalidade;

    private java.lang.String genero;

    private java.lang.String grupoProfissional;

    private boolean hasTermo;

    private java.lang.String importadoPara;

    private java.lang.String justAusenciaNif;

    private java.util.Calendar lastUpdate;

    private java.lang.String localInscricao;

    private java.lang.String localidadeNaturalidade;

    private cmaRepos.AreaInteresseAtividades[] lstAIAtividades;

    private cmaRepos.AreaInteresseRecursos[] lstAIRecursos;

    private cmaRepos.Contacto[] lstContactos;

    private cmaRepos.MyDocument[] lstDocsFI;

    private cmaRepos.MyDocument[] lstDocumentos;

    private cmaRepos.EntidadeRelacionada[] lstEntidadesRelacionadas;

    private cmaRepos.Morada[] lstMoradas;

    private cmaRepos.RecursoOrganizacao[] lstRecursosOrganizacao;

    private cmaRepos.ReferenciaExterna[] lstRefExternas;

    private java.lang.String mails;

    private java.lang.String moradaPrincipalStr;

    private java.lang.String NIPC;

    private java.lang.String NUSNS;

    private java.lang.String nacionalidade;

    private java.lang.String naturezaEntidade;

    private java.lang.String nif;

    private java.lang.String niss;

    private java.lang.String nivelConfiancaRegisto;

    private java.lang.String nivelDetalheRegisto;

    private java.lang.String nivelEscolaridade;

    private java.lang.String nivelOrganizacional;

    private java.lang.String nome;

    private java.lang.String nomeEntidade;

    private java.lang.String nomeMae;

    private java.lang.String nomePai;

    private java.lang.String nota;

    private java.lang.String notasManutencaoRegisto;

    private java.lang.String numBiblioteca;

    private java.lang.String numEleitor;

    private java.lang.String numeroIdentificacao;

    private java.lang.String objetoAtividade;

    private java.lang.String observacoes;

    private java.lang.String outroContacto;

    private java.lang.String paisNacionalidade;

    private java.lang.String paisNaturalidade;

    private java.lang.String pass;

    private java.lang.String percentagemParticipCM_CapSocial;

    private boolean preInscricao;

    private boolean privada;

    private java.lang.String profissao;

    private boolean publica;

    private boolean receberBoletimMunicipal;

    private java.lang.String referencia;

    private java.lang.String regrasConvencoes;

    private boolean selese;

    private java.lang.String sigla;

    private java.lang.String telefones;

    private java.lang.String[] tipoDividas;

    private java.lang.String tipoEmpBib;

    private java.lang.String tipoIdentificacao;

    private java.lang.String tipoUtilizBib;

    private java.lang.String tipoUtilizador;

    private java.lang.String txtEstudante;

    private java.lang.String updatedBy;

    private boolean utilidadePublica;

    private java.lang.String valorParticipCM_CapSocial;

    private java.lang.String _Id;

    public Entidade() {
    }

    public Entidade(
           java.lang.String atividadeCodIRS,
           java.lang.String canalPrefComunicacao,
           boolean cartaoEntregue,
           boolean cartaoImpresso,
           boolean cliente,
           java.lang.String codAtivacao,
           java.lang.String codAtividadeEconomica,
           java.lang.String codEstadoCivil,
           java.lang.String codFreguesiaNaturalidade,
           java.lang.String codGrupoProfissional,
           java.lang.String codLocalidadeNaturalidade,
           java.lang.String codNacionalidade,
           java.lang.String codNivelEscolaridade,
           java.lang.String codPaisNacionalidade,
           java.lang.String codPaisNaturalidade,
           java.lang.String codProfissao,
           boolean colaborador,
           boolean coletividade,
           boolean contaAtiva,
           java.lang.String contactosTxt,
           java.lang.String contumacia,
           java.util.Calendar created,
           java.lang.String createdBy,
           java.util.Calendar dataAtualizacao,
           java.util.Calendar dataExistenciaFim,
           java.util.Calendar dataExistenciaInicio,
           java.util.Calendar dataInscricao,
           java.util.Calendar dataInscricaoFinancas,
           java.util.Calendar dataInscricaoSSocial,
           java.util.Calendar dataNascimento,
           java.util.Calendar dataObito,
           java.util.Calendar dataRenovInsc,
           java.util.Calendar dataValidade,
           java.lang.String desigComercialOutra,
           java.lang.String designacao,
           boolean docVitalicio,
           java.util.Calendar dtInscPiscina,
           java.lang.String encEducacao,
           boolean entidadeArquivistica,
           java.lang.String entidadeEmissora,
           java.lang.String escEtarioINE,
           java.lang.String escEtarioISO,
           java.lang.String estadoCivil,
           java.lang.String estadoEntidade,
           java.lang.String estadoRegisto,
           boolean estudante,
           java.lang.String formaJuridica,
           boolean fornecedor,
           cmaRepos.InputStream foto_logo,
           java.lang.String freguesiaNaturalidade,
           java.lang.String genero,
           java.lang.String grupoProfissional,
           boolean hasTermo,
           java.lang.String importadoPara,
           java.lang.String justAusenciaNif,
           java.util.Calendar lastUpdate,
           java.lang.String localInscricao,
           java.lang.String localidadeNaturalidade,
           cmaRepos.AreaInteresseAtividades[] lstAIAtividades,
           cmaRepos.AreaInteresseRecursos[] lstAIRecursos,
           cmaRepos.Contacto[] lstContactos,
           cmaRepos.MyDocument[] lstDocsFI,
           cmaRepos.MyDocument[] lstDocumentos,
           cmaRepos.EntidadeRelacionada[] lstEntidadesRelacionadas,
           cmaRepos.Morada[] lstMoradas,
           cmaRepos.RecursoOrganizacao[] lstRecursosOrganizacao,
           cmaRepos.ReferenciaExterna[] lstRefExternas,
           java.lang.String mails,
           java.lang.String moradaPrincipalStr,
           java.lang.String NIPC,
           java.lang.String NUSNS,
           java.lang.String nacionalidade,
           java.lang.String naturezaEntidade,
           java.lang.String nif,
           java.lang.String niss,
           java.lang.String nivelConfiancaRegisto,
           java.lang.String nivelDetalheRegisto,
           java.lang.String nivelEscolaridade,
           java.lang.String nivelOrganizacional,
           java.lang.String nome,
           java.lang.String nomeEntidade,
           java.lang.String nomeMae,
           java.lang.String nomePai,
           java.lang.String nota,
           java.lang.String notasManutencaoRegisto,
           java.lang.String numBiblioteca,
           java.lang.String numEleitor,
           java.lang.String numeroIdentificacao,
           java.lang.String objetoAtividade,
           java.lang.String observacoes,
           java.lang.String outroContacto,
           java.lang.String paisNacionalidade,
           java.lang.String paisNaturalidade,
           java.lang.String pass,
           java.lang.String percentagemParticipCM_CapSocial,
           boolean preInscricao,
           boolean privada,
           java.lang.String profissao,
           boolean publica,
           boolean receberBoletimMunicipal,
           java.lang.String referencia,
           java.lang.String regrasConvencoes,
           boolean selese,
           java.lang.String sigla,
           java.lang.String telefones,
           java.lang.String[] tipoDividas,
           java.lang.String tipoEmpBib,
           java.lang.String tipoIdentificacao,
           java.lang.String tipoUtilizBib,
           java.lang.String tipoUtilizador,
           java.lang.String txtEstudante,
           java.lang.String updatedBy,
           boolean utilidadePublica,
           java.lang.String valorParticipCM_CapSocial,
           java.lang.String _Id) {
           this.atividadeCodIRS = atividadeCodIRS;
           this.canalPrefComunicacao = canalPrefComunicacao;
           this.cartaoEntregue = cartaoEntregue;
           this.cartaoImpresso = cartaoImpresso;
           this.cliente = cliente;
           this.codAtivacao = codAtivacao;
           this.codAtividadeEconomica = codAtividadeEconomica;
           this.codEstadoCivil = codEstadoCivil;
           this.codFreguesiaNaturalidade = codFreguesiaNaturalidade;
           this.codGrupoProfissional = codGrupoProfissional;
           this.codLocalidadeNaturalidade = codLocalidadeNaturalidade;
           this.codNacionalidade = codNacionalidade;
           this.codNivelEscolaridade = codNivelEscolaridade;
           this.codPaisNacionalidade = codPaisNacionalidade;
           this.codPaisNaturalidade = codPaisNaturalidade;
           this.codProfissao = codProfissao;
           this.colaborador = colaborador;
           this.coletividade = coletividade;
           this.contaAtiva = contaAtiva;
           this.contactosTxt = contactosTxt;
           this.contumacia = contumacia;
           this.created = created;
           this.createdBy = createdBy;
           this.dataAtualizacao = dataAtualizacao;
           this.dataExistenciaFim = dataExistenciaFim;
           this.dataExistenciaInicio = dataExistenciaInicio;
           this.dataInscricao = dataInscricao;
           this.dataInscricaoFinancas = dataInscricaoFinancas;
           this.dataInscricaoSSocial = dataInscricaoSSocial;
           this.dataNascimento = dataNascimento;
           this.dataObito = dataObito;
           this.dataRenovInsc = dataRenovInsc;
           this.dataValidade = dataValidade;
           this.desigComercialOutra = desigComercialOutra;
           this.designacao = designacao;
           this.docVitalicio = docVitalicio;
           this.dtInscPiscina = dtInscPiscina;
           this.encEducacao = encEducacao;
           this.entidadeArquivistica = entidadeArquivistica;
           this.entidadeEmissora = entidadeEmissora;
           this.escEtarioINE = escEtarioINE;
           this.escEtarioISO = escEtarioISO;
           this.estadoCivil = estadoCivil;
           this.estadoEntidade = estadoEntidade;
           this.estadoRegisto = estadoRegisto;
           this.estudante = estudante;
           this.formaJuridica = formaJuridica;
           this.fornecedor = fornecedor;
           this.foto_logo = foto_logo;
           this.freguesiaNaturalidade = freguesiaNaturalidade;
           this.genero = genero;
           this.grupoProfissional = grupoProfissional;
           this.hasTermo = hasTermo;
           this.importadoPara = importadoPara;
           this.justAusenciaNif = justAusenciaNif;
           this.lastUpdate = lastUpdate;
           this.localInscricao = localInscricao;
           this.localidadeNaturalidade = localidadeNaturalidade;
           this.lstAIAtividades = lstAIAtividades;
           this.lstAIRecursos = lstAIRecursos;
           this.lstContactos = lstContactos;
           this.lstDocsFI = lstDocsFI;
           this.lstDocumentos = lstDocumentos;
           this.lstEntidadesRelacionadas = lstEntidadesRelacionadas;
           this.lstMoradas = lstMoradas;
           this.lstRecursosOrganizacao = lstRecursosOrganizacao;
           this.lstRefExternas = lstRefExternas;
           this.mails = mails;
           this.moradaPrincipalStr = moradaPrincipalStr;
           this.NIPC = NIPC;
           this.NUSNS = NUSNS;
           this.nacionalidade = nacionalidade;
           this.naturezaEntidade = naturezaEntidade;
           this.nif = nif;
           this.niss = niss;
           this.nivelConfiancaRegisto = nivelConfiancaRegisto;
           this.nivelDetalheRegisto = nivelDetalheRegisto;
           this.nivelEscolaridade = nivelEscolaridade;
           this.nivelOrganizacional = nivelOrganizacional;
           this.nome = nome;
           this.nomeEntidade = nomeEntidade;
           this.nomeMae = nomeMae;
           this.nomePai = nomePai;
           this.nota = nota;
           this.notasManutencaoRegisto = notasManutencaoRegisto;
           this.numBiblioteca = numBiblioteca;
           this.numEleitor = numEleitor;
           this.numeroIdentificacao = numeroIdentificacao;
           this.objetoAtividade = objetoAtividade;
           this.observacoes = observacoes;
           this.outroContacto = outroContacto;
           this.paisNacionalidade = paisNacionalidade;
           this.paisNaturalidade = paisNaturalidade;
           this.pass = pass;
           this.percentagemParticipCM_CapSocial = percentagemParticipCM_CapSocial;
           this.preInscricao = preInscricao;
           this.privada = privada;
           this.profissao = profissao;
           this.publica = publica;
           this.receberBoletimMunicipal = receberBoletimMunicipal;
           this.referencia = referencia;
           this.regrasConvencoes = regrasConvencoes;
           this.selese = selese;
           this.sigla = sigla;
           this.telefones = telefones;
           this.tipoDividas = tipoDividas;
           this.tipoEmpBib = tipoEmpBib;
           this.tipoIdentificacao = tipoIdentificacao;
           this.tipoUtilizBib = tipoUtilizBib;
           this.tipoUtilizador = tipoUtilizador;
           this.txtEstudante = txtEstudante;
           this.updatedBy = updatedBy;
           this.utilidadePublica = utilidadePublica;
           this.valorParticipCM_CapSocial = valorParticipCM_CapSocial;
           this._Id = _Id;
    }


    /**
     * Gets the atividadeCodIRS value for this Entidade.
     * 
     * @return atividadeCodIRS
     */
    public java.lang.String getAtividadeCodIRS() {
        return atividadeCodIRS;
    }


    /**
     * Sets the atividadeCodIRS value for this Entidade.
     * 
     * @param atividadeCodIRS
     */
    public void setAtividadeCodIRS(java.lang.String atividadeCodIRS) {
        this.atividadeCodIRS = atividadeCodIRS;
    }


    /**
     * Gets the canalPrefComunicacao value for this Entidade.
     * 
     * @return canalPrefComunicacao
     */
    public java.lang.String getCanalPrefComunicacao() {
        return canalPrefComunicacao;
    }


    /**
     * Sets the canalPrefComunicacao value for this Entidade.
     * 
     * @param canalPrefComunicacao
     */
    public void setCanalPrefComunicacao(java.lang.String canalPrefComunicacao) {
        this.canalPrefComunicacao = canalPrefComunicacao;
    }


    /**
     * Gets the cartaoEntregue value for this Entidade.
     * 
     * @return cartaoEntregue
     */
    public boolean isCartaoEntregue() {
        return cartaoEntregue;
    }


    /**
     * Sets the cartaoEntregue value for this Entidade.
     * 
     * @param cartaoEntregue
     */
    public void setCartaoEntregue(boolean cartaoEntregue) {
        this.cartaoEntregue = cartaoEntregue;
    }


    /**
     * Gets the cartaoImpresso value for this Entidade.
     * 
     * @return cartaoImpresso
     */
    public boolean isCartaoImpresso() {
        return cartaoImpresso;
    }


    /**
     * Sets the cartaoImpresso value for this Entidade.
     * 
     * @param cartaoImpresso
     */
    public void setCartaoImpresso(boolean cartaoImpresso) {
        this.cartaoImpresso = cartaoImpresso;
    }


    /**
     * Gets the cliente value for this Entidade.
     * 
     * @return cliente
     */
    public boolean isCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this Entidade.
     * 
     * @param cliente
     */
    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the codAtivacao value for this Entidade.
     * 
     * @return codAtivacao
     */
    public java.lang.String getCodAtivacao() {
        return codAtivacao;
    }


    /**
     * Sets the codAtivacao value for this Entidade.
     * 
     * @param codAtivacao
     */
    public void setCodAtivacao(java.lang.String codAtivacao) {
        this.codAtivacao = codAtivacao;
    }


    /**
     * Gets the codAtividadeEconomica value for this Entidade.
     * 
     * @return codAtividadeEconomica
     */
    public java.lang.String getCodAtividadeEconomica() {
        return codAtividadeEconomica;
    }


    /**
     * Sets the codAtividadeEconomica value for this Entidade.
     * 
     * @param codAtividadeEconomica
     */
    public void setCodAtividadeEconomica(java.lang.String codAtividadeEconomica) {
        this.codAtividadeEconomica = codAtividadeEconomica;
    }


    /**
     * Gets the codEstadoCivil value for this Entidade.
     * 
     * @return codEstadoCivil
     */
    public java.lang.String getCodEstadoCivil() {
        return codEstadoCivil;
    }


    /**
     * Sets the codEstadoCivil value for this Entidade.
     * 
     * @param codEstadoCivil
     */
    public void setCodEstadoCivil(java.lang.String codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }


    /**
     * Gets the codFreguesiaNaturalidade value for this Entidade.
     * 
     * @return codFreguesiaNaturalidade
     */
    public java.lang.String getCodFreguesiaNaturalidade() {
        return codFreguesiaNaturalidade;
    }


    /**
     * Sets the codFreguesiaNaturalidade value for this Entidade.
     * 
     * @param codFreguesiaNaturalidade
     */
    public void setCodFreguesiaNaturalidade(java.lang.String codFreguesiaNaturalidade) {
        this.codFreguesiaNaturalidade = codFreguesiaNaturalidade;
    }


    /**
     * Gets the codGrupoProfissional value for this Entidade.
     * 
     * @return codGrupoProfissional
     */
    public java.lang.String getCodGrupoProfissional() {
        return codGrupoProfissional;
    }


    /**
     * Sets the codGrupoProfissional value for this Entidade.
     * 
     * @param codGrupoProfissional
     */
    public void setCodGrupoProfissional(java.lang.String codGrupoProfissional) {
        this.codGrupoProfissional = codGrupoProfissional;
    }


    /**
     * Gets the codLocalidadeNaturalidade value for this Entidade.
     * 
     * @return codLocalidadeNaturalidade
     */
    public java.lang.String getCodLocalidadeNaturalidade() {
        return codLocalidadeNaturalidade;
    }


    /**
     * Sets the codLocalidadeNaturalidade value for this Entidade.
     * 
     * @param codLocalidadeNaturalidade
     */
    public void setCodLocalidadeNaturalidade(java.lang.String codLocalidadeNaturalidade) {
        this.codLocalidadeNaturalidade = codLocalidadeNaturalidade;
    }


    /**
     * Gets the codNacionalidade value for this Entidade.
     * 
     * @return codNacionalidade
     */
    public java.lang.String getCodNacionalidade() {
        return codNacionalidade;
    }


    /**
     * Sets the codNacionalidade value for this Entidade.
     * 
     * @param codNacionalidade
     */
    public void setCodNacionalidade(java.lang.String codNacionalidade) {
        this.codNacionalidade = codNacionalidade;
    }


    /**
     * Gets the codNivelEscolaridade value for this Entidade.
     * 
     * @return codNivelEscolaridade
     */
    public java.lang.String getCodNivelEscolaridade() {
        return codNivelEscolaridade;
    }


    /**
     * Sets the codNivelEscolaridade value for this Entidade.
     * 
     * @param codNivelEscolaridade
     */
    public void setCodNivelEscolaridade(java.lang.String codNivelEscolaridade) {
        this.codNivelEscolaridade = codNivelEscolaridade;
    }


    /**
     * Gets the codPaisNacionalidade value for this Entidade.
     * 
     * @return codPaisNacionalidade
     */
    public java.lang.String getCodPaisNacionalidade() {
        return codPaisNacionalidade;
    }


    /**
     * Sets the codPaisNacionalidade value for this Entidade.
     * 
     * @param codPaisNacionalidade
     */
    public void setCodPaisNacionalidade(java.lang.String codPaisNacionalidade) {
        this.codPaisNacionalidade = codPaisNacionalidade;
    }


    /**
     * Gets the codPaisNaturalidade value for this Entidade.
     * 
     * @return codPaisNaturalidade
     */
    public java.lang.String getCodPaisNaturalidade() {
        return codPaisNaturalidade;
    }


    /**
     * Sets the codPaisNaturalidade value for this Entidade.
     * 
     * @param codPaisNaturalidade
     */
    public void setCodPaisNaturalidade(java.lang.String codPaisNaturalidade) {
        this.codPaisNaturalidade = codPaisNaturalidade;
    }


    /**
     * Gets the codProfissao value for this Entidade.
     * 
     * @return codProfissao
     */
    public java.lang.String getCodProfissao() {
        return codProfissao;
    }


    /**
     * Sets the codProfissao value for this Entidade.
     * 
     * @param codProfissao
     */
    public void setCodProfissao(java.lang.String codProfissao) {
        this.codProfissao = codProfissao;
    }


    /**
     * Gets the colaborador value for this Entidade.
     * 
     * @return colaborador
     */
    public boolean isColaborador() {
        return colaborador;
    }


    /**
     * Sets the colaborador value for this Entidade.
     * 
     * @param colaborador
     */
    public void setColaborador(boolean colaborador) {
        this.colaborador = colaborador;
    }


    /**
     * Gets the coletividade value for this Entidade.
     * 
     * @return coletividade
     */
    public boolean isColetividade() {
        return coletividade;
    }


    /**
     * Sets the coletividade value for this Entidade.
     * 
     * @param coletividade
     */
    public void setColetividade(boolean coletividade) {
        this.coletividade = coletividade;
    }


    /**
     * Gets the contaAtiva value for this Entidade.
     * 
     * @return contaAtiva
     */
    public boolean isContaAtiva() {
        return contaAtiva;
    }


    /**
     * Sets the contaAtiva value for this Entidade.
     * 
     * @param contaAtiva
     */
    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }


    /**
     * Gets the contactosTxt value for this Entidade.
     * 
     * @return contactosTxt
     */
    public java.lang.String getContactosTxt() {
        return contactosTxt;
    }


    /**
     * Sets the contactosTxt value for this Entidade.
     * 
     * @param contactosTxt
     */
    public void setContactosTxt(java.lang.String contactosTxt) {
        this.contactosTxt = contactosTxt;
    }


    /**
     * Gets the contumacia value for this Entidade.
     * 
     * @return contumacia
     */
    public java.lang.String getContumacia() {
        return contumacia;
    }


    /**
     * Sets the contumacia value for this Entidade.
     * 
     * @param contumacia
     */
    public void setContumacia(java.lang.String contumacia) {
        this.contumacia = contumacia;
    }


    /**
     * Gets the created value for this Entidade.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Entidade.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the createdBy value for this Entidade.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Entidade.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dataAtualizacao value for this Entidade.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this Entidade.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the dataExistenciaFim value for this Entidade.
     * 
     * @return dataExistenciaFim
     */
    public java.util.Calendar getDataExistenciaFim() {
        return dataExistenciaFim;
    }


    /**
     * Sets the dataExistenciaFim value for this Entidade.
     * 
     * @param dataExistenciaFim
     */
    public void setDataExistenciaFim(java.util.Calendar dataExistenciaFim) {
        this.dataExistenciaFim = dataExistenciaFim;
    }


    /**
     * Gets the dataExistenciaInicio value for this Entidade.
     * 
     * @return dataExistenciaInicio
     */
    public java.util.Calendar getDataExistenciaInicio() {
        return dataExistenciaInicio;
    }


    /**
     * Sets the dataExistenciaInicio value for this Entidade.
     * 
     * @param dataExistenciaInicio
     */
    public void setDataExistenciaInicio(java.util.Calendar dataExistenciaInicio) {
        this.dataExistenciaInicio = dataExistenciaInicio;
    }


    /**
     * Gets the dataInscricao value for this Entidade.
     * 
     * @return dataInscricao
     */
    public java.util.Calendar getDataInscricao() {
        return dataInscricao;
    }


    /**
     * Sets the dataInscricao value for this Entidade.
     * 
     * @param dataInscricao
     */
    public void setDataInscricao(java.util.Calendar dataInscricao) {
        this.dataInscricao = dataInscricao;
    }


    /**
     * Gets the dataInscricaoFinancas value for this Entidade.
     * 
     * @return dataInscricaoFinancas
     */
    public java.util.Calendar getDataInscricaoFinancas() {
        return dataInscricaoFinancas;
    }


    /**
     * Sets the dataInscricaoFinancas value for this Entidade.
     * 
     * @param dataInscricaoFinancas
     */
    public void setDataInscricaoFinancas(java.util.Calendar dataInscricaoFinancas) {
        this.dataInscricaoFinancas = dataInscricaoFinancas;
    }


    /**
     * Gets the dataInscricaoSSocial value for this Entidade.
     * 
     * @return dataInscricaoSSocial
     */
    public java.util.Calendar getDataInscricaoSSocial() {
        return dataInscricaoSSocial;
    }


    /**
     * Sets the dataInscricaoSSocial value for this Entidade.
     * 
     * @param dataInscricaoSSocial
     */
    public void setDataInscricaoSSocial(java.util.Calendar dataInscricaoSSocial) {
        this.dataInscricaoSSocial = dataInscricaoSSocial;
    }


    /**
     * Gets the dataNascimento value for this Entidade.
     * 
     * @return dataNascimento
     */
    public java.util.Calendar getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this Entidade.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.util.Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the dataObito value for this Entidade.
     * 
     * @return dataObito
     */
    public java.util.Calendar getDataObito() {
        return dataObito;
    }


    /**
     * Sets the dataObito value for this Entidade.
     * 
     * @param dataObito
     */
    public void setDataObito(java.util.Calendar dataObito) {
        this.dataObito = dataObito;
    }


    /**
     * Gets the dataRenovInsc value for this Entidade.
     * 
     * @return dataRenovInsc
     */
    public java.util.Calendar getDataRenovInsc() {
        return dataRenovInsc;
    }


    /**
     * Sets the dataRenovInsc value for this Entidade.
     * 
     * @param dataRenovInsc
     */
    public void setDataRenovInsc(java.util.Calendar dataRenovInsc) {
        this.dataRenovInsc = dataRenovInsc;
    }


    /**
     * Gets the dataValidade value for this Entidade.
     * 
     * @return dataValidade
     */
    public java.util.Calendar getDataValidade() {
        return dataValidade;
    }


    /**
     * Sets the dataValidade value for this Entidade.
     * 
     * @param dataValidade
     */
    public void setDataValidade(java.util.Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }


    /**
     * Gets the desigComercialOutra value for this Entidade.
     * 
     * @return desigComercialOutra
     */
    public java.lang.String getDesigComercialOutra() {
        return desigComercialOutra;
    }


    /**
     * Sets the desigComercialOutra value for this Entidade.
     * 
     * @param desigComercialOutra
     */
    public void setDesigComercialOutra(java.lang.String desigComercialOutra) {
        this.desigComercialOutra = desigComercialOutra;
    }


    /**
     * Gets the designacao value for this Entidade.
     * 
     * @return designacao
     */
    public java.lang.String getDesignacao() {
        return designacao;
    }


    /**
     * Sets the designacao value for this Entidade.
     * 
     * @param designacao
     */
    public void setDesignacao(java.lang.String designacao) {
        this.designacao = designacao;
    }


    /**
     * Gets the docVitalicio value for this Entidade.
     * 
     * @return docVitalicio
     */
    public boolean isDocVitalicio() {
        return docVitalicio;
    }


    /**
     * Sets the docVitalicio value for this Entidade.
     * 
     * @param docVitalicio
     */
    public void setDocVitalicio(boolean docVitalicio) {
        this.docVitalicio = docVitalicio;
    }


    /**
     * Gets the dtInscPiscina value for this Entidade.
     * 
     * @return dtInscPiscina
     */
    public java.util.Calendar getDtInscPiscina() {
        return dtInscPiscina;
    }


    /**
     * Sets the dtInscPiscina value for this Entidade.
     * 
     * @param dtInscPiscina
     */
    public void setDtInscPiscina(java.util.Calendar dtInscPiscina) {
        this.dtInscPiscina = dtInscPiscina;
    }


    /**
     * Gets the encEducacao value for this Entidade.
     * 
     * @return encEducacao
     */
    public java.lang.String getEncEducacao() {
        return encEducacao;
    }


    /**
     * Sets the encEducacao value for this Entidade.
     * 
     * @param encEducacao
     */
    public void setEncEducacao(java.lang.String encEducacao) {
        this.encEducacao = encEducacao;
    }


    /**
     * Gets the entidadeArquivistica value for this Entidade.
     * 
     * @return entidadeArquivistica
     */
    public boolean isEntidadeArquivistica() {
        return entidadeArquivistica;
    }


    /**
     * Sets the entidadeArquivistica value for this Entidade.
     * 
     * @param entidadeArquivistica
     */
    public void setEntidadeArquivistica(boolean entidadeArquivistica) {
        this.entidadeArquivistica = entidadeArquivistica;
    }


    /**
     * Gets the entidadeEmissora value for this Entidade.
     * 
     * @return entidadeEmissora
     */
    public java.lang.String getEntidadeEmissora() {
        return entidadeEmissora;
    }


    /**
     * Sets the entidadeEmissora value for this Entidade.
     * 
     * @param entidadeEmissora
     */
    public void setEntidadeEmissora(java.lang.String entidadeEmissora) {
        this.entidadeEmissora = entidadeEmissora;
    }


    /**
     * Gets the escEtarioINE value for this Entidade.
     * 
     * @return escEtarioINE
     */
    public java.lang.String getEscEtarioINE() {
        return escEtarioINE;
    }


    /**
     * Sets the escEtarioINE value for this Entidade.
     * 
     * @param escEtarioINE
     */
    public void setEscEtarioINE(java.lang.String escEtarioINE) {
        this.escEtarioINE = escEtarioINE;
    }


    /**
     * Gets the escEtarioISO value for this Entidade.
     * 
     * @return escEtarioISO
     */
    public java.lang.String getEscEtarioISO() {
        return escEtarioISO;
    }


    /**
     * Sets the escEtarioISO value for this Entidade.
     * 
     * @param escEtarioISO
     */
    public void setEscEtarioISO(java.lang.String escEtarioISO) {
        this.escEtarioISO = escEtarioISO;
    }


    /**
     * Gets the estadoCivil value for this Entidade.
     * 
     * @return estadoCivil
     */
    public java.lang.String getEstadoCivil() {
        return estadoCivil;
    }


    /**
     * Sets the estadoCivil value for this Entidade.
     * 
     * @param estadoCivil
     */
    public void setEstadoCivil(java.lang.String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /**
     * Gets the estadoEntidade value for this Entidade.
     * 
     * @return estadoEntidade
     */
    public java.lang.String getEstadoEntidade() {
        return estadoEntidade;
    }


    /**
     * Sets the estadoEntidade value for this Entidade.
     * 
     * @param estadoEntidade
     */
    public void setEstadoEntidade(java.lang.String estadoEntidade) {
        this.estadoEntidade = estadoEntidade;
    }


    /**
     * Gets the estadoRegisto value for this Entidade.
     * 
     * @return estadoRegisto
     */
    public java.lang.String getEstadoRegisto() {
        return estadoRegisto;
    }


    /**
     * Sets the estadoRegisto value for this Entidade.
     * 
     * @param estadoRegisto
     */
    public void setEstadoRegisto(java.lang.String estadoRegisto) {
        this.estadoRegisto = estadoRegisto;
    }


    /**
     * Gets the estudante value for this Entidade.
     * 
     * @return estudante
     */
    public boolean isEstudante() {
        return estudante;
    }


    /**
     * Sets the estudante value for this Entidade.
     * 
     * @param estudante
     */
    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }


    /**
     * Gets the formaJuridica value for this Entidade.
     * 
     * @return formaJuridica
     */
    public java.lang.String getFormaJuridica() {
        return formaJuridica;
    }


    /**
     * Sets the formaJuridica value for this Entidade.
     * 
     * @param formaJuridica
     */
    public void setFormaJuridica(java.lang.String formaJuridica) {
        this.formaJuridica = formaJuridica;
    }


    /**
     * Gets the fornecedor value for this Entidade.
     * 
     * @return fornecedor
     */
    public boolean isFornecedor() {
        return fornecedor;
    }


    /**
     * Sets the fornecedor value for this Entidade.
     * 
     * @param fornecedor
     */
    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }


    /**
     * Gets the foto_logo value for this Entidade.
     * 
     * @return foto_logo
     */
    public cmaRepos.InputStream getFoto_logo() {
        return foto_logo;
    }


    /**
     * Sets the foto_logo value for this Entidade.
     * 
     * @param foto_logo
     */
    public void setFoto_logo(cmaRepos.InputStream foto_logo) {
        this.foto_logo = foto_logo;
    }


    /**
     * Gets the freguesiaNaturalidade value for this Entidade.
     * 
     * @return freguesiaNaturalidade
     */
    public java.lang.String getFreguesiaNaturalidade() {
        return freguesiaNaturalidade;
    }


    /**
     * Sets the freguesiaNaturalidade value for this Entidade.
     * 
     * @param freguesiaNaturalidade
     */
    public void setFreguesiaNaturalidade(java.lang.String freguesiaNaturalidade) {
        this.freguesiaNaturalidade = freguesiaNaturalidade;
    }


    /**
     * Gets the genero value for this Entidade.
     * 
     * @return genero
     */
    public java.lang.String getGenero() {
        return genero;
    }


    /**
     * Sets the genero value for this Entidade.
     * 
     * @param genero
     */
    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }


    /**
     * Gets the grupoProfissional value for this Entidade.
     * 
     * @return grupoProfissional
     */
    public java.lang.String getGrupoProfissional() {
        return grupoProfissional;
    }


    /**
     * Sets the grupoProfissional value for this Entidade.
     * 
     * @param grupoProfissional
     */
    public void setGrupoProfissional(java.lang.String grupoProfissional) {
        this.grupoProfissional = grupoProfissional;
    }


    /**
     * Gets the hasTermo value for this Entidade.
     * 
     * @return hasTermo
     */
    public boolean isHasTermo() {
        return hasTermo;
    }


    /**
     * Sets the hasTermo value for this Entidade.
     * 
     * @param hasTermo
     */
    public void setHasTermo(boolean hasTermo) {
        this.hasTermo = hasTermo;
    }


    /**
     * Gets the importadoPara value for this Entidade.
     * 
     * @return importadoPara
     */
    public java.lang.String getImportadoPara() {
        return importadoPara;
    }


    /**
     * Sets the importadoPara value for this Entidade.
     * 
     * @param importadoPara
     */
    public void setImportadoPara(java.lang.String importadoPara) {
        this.importadoPara = importadoPara;
    }


    /**
     * Gets the justAusenciaNif value for this Entidade.
     * 
     * @return justAusenciaNif
     */
    public java.lang.String getJustAusenciaNif() {
        return justAusenciaNif;
    }


    /**
     * Sets the justAusenciaNif value for this Entidade.
     * 
     * @param justAusenciaNif
     */
    public void setJustAusenciaNif(java.lang.String justAusenciaNif) {
        this.justAusenciaNif = justAusenciaNif;
    }


    /**
     * Gets the lastUpdate value for this Entidade.
     * 
     * @return lastUpdate
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this Entidade.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the localInscricao value for this Entidade.
     * 
     * @return localInscricao
     */
    public java.lang.String getLocalInscricao() {
        return localInscricao;
    }


    /**
     * Sets the localInscricao value for this Entidade.
     * 
     * @param localInscricao
     */
    public void setLocalInscricao(java.lang.String localInscricao) {
        this.localInscricao = localInscricao;
    }


    /**
     * Gets the localidadeNaturalidade value for this Entidade.
     * 
     * @return localidadeNaturalidade
     */
    public java.lang.String getLocalidadeNaturalidade() {
        return localidadeNaturalidade;
    }


    /**
     * Sets the localidadeNaturalidade value for this Entidade.
     * 
     * @param localidadeNaturalidade
     */
    public void setLocalidadeNaturalidade(java.lang.String localidadeNaturalidade) {
        this.localidadeNaturalidade = localidadeNaturalidade;
    }


    /**
     * Gets the lstAIAtividades value for this Entidade.
     * 
     * @return lstAIAtividades
     */
    public cmaRepos.AreaInteresseAtividades[] getLstAIAtividades() {
        return lstAIAtividades;
    }


    /**
     * Sets the lstAIAtividades value for this Entidade.
     * 
     * @param lstAIAtividades
     */
    public void setLstAIAtividades(cmaRepos.AreaInteresseAtividades[] lstAIAtividades) {
        this.lstAIAtividades = lstAIAtividades;
    }

    public cmaRepos.AreaInteresseAtividades getLstAIAtividades(int i) {
        return this.lstAIAtividades[i];
    }

    public void setLstAIAtividades(int i, cmaRepos.AreaInteresseAtividades _value) {
        this.lstAIAtividades[i] = _value;
    }


    /**
     * Gets the lstAIRecursos value for this Entidade.
     * 
     * @return lstAIRecursos
     */
    public cmaRepos.AreaInteresseRecursos[] getLstAIRecursos() {
        return lstAIRecursos;
    }


    /**
     * Sets the lstAIRecursos value for this Entidade.
     * 
     * @param lstAIRecursos
     */
    public void setLstAIRecursos(cmaRepos.AreaInteresseRecursos[] lstAIRecursos) {
        this.lstAIRecursos = lstAIRecursos;
    }

    public cmaRepos.AreaInteresseRecursos getLstAIRecursos(int i) {
        return this.lstAIRecursos[i];
    }

    public void setLstAIRecursos(int i, cmaRepos.AreaInteresseRecursos _value) {
        this.lstAIRecursos[i] = _value;
    }


    /**
     * Gets the lstContactos value for this Entidade.
     * 
     * @return lstContactos
     */
    public cmaRepos.Contacto[] getLstContactos() {
        return lstContactos;
    }


    /**
     * Sets the lstContactos value for this Entidade.
     * 
     * @param lstContactos
     */
    public void setLstContactos(cmaRepos.Contacto[] lstContactos) {
        this.lstContactos = lstContactos;
    }

    public cmaRepos.Contacto getLstContactos(int i) {
        return this.lstContactos[i];
    }

    public void setLstContactos(int i, cmaRepos.Contacto _value) {
        this.lstContactos[i] = _value;
    }


    /**
     * Gets the lstDocsFI value for this Entidade.
     * 
     * @return lstDocsFI
     */
    public cmaRepos.MyDocument[] getLstDocsFI() {
        return lstDocsFI;
    }


    /**
     * Sets the lstDocsFI value for this Entidade.
     * 
     * @param lstDocsFI
     */
    public void setLstDocsFI(cmaRepos.MyDocument[] lstDocsFI) {
        this.lstDocsFI = lstDocsFI;
    }

    public cmaRepos.MyDocument getLstDocsFI(int i) {
        return this.lstDocsFI[i];
    }

    public void setLstDocsFI(int i, cmaRepos.MyDocument _value) {
        this.lstDocsFI[i] = _value;
    }


    /**
     * Gets the lstDocumentos value for this Entidade.
     * 
     * @return lstDocumentos
     */
    public cmaRepos.MyDocument[] getLstDocumentos() {
        return lstDocumentos;
    }


    /**
     * Sets the lstDocumentos value for this Entidade.
     * 
     * @param lstDocumentos
     */
    public void setLstDocumentos(cmaRepos.MyDocument[] lstDocumentos) {
        this.lstDocumentos = lstDocumentos;
    }

    public cmaRepos.MyDocument getLstDocumentos(int i) {
        return this.lstDocumentos[i];
    }

    public void setLstDocumentos(int i, cmaRepos.MyDocument _value) {
        this.lstDocumentos[i] = _value;
    }


    /**
     * Gets the lstEntidadesRelacionadas value for this Entidade.
     * 
     * @return lstEntidadesRelacionadas
     */
    public cmaRepos.EntidadeRelacionada[] getLstEntidadesRelacionadas() {
        return lstEntidadesRelacionadas;
    }


    /**
     * Sets the lstEntidadesRelacionadas value for this Entidade.
     * 
     * @param lstEntidadesRelacionadas
     */
    public void setLstEntidadesRelacionadas(cmaRepos.EntidadeRelacionada[] lstEntidadesRelacionadas) {
        this.lstEntidadesRelacionadas = lstEntidadesRelacionadas;
    }

    public cmaRepos.EntidadeRelacionada getLstEntidadesRelacionadas(int i) {
        return this.lstEntidadesRelacionadas[i];
    }

    public void setLstEntidadesRelacionadas(int i, cmaRepos.EntidadeRelacionada _value) {
        this.lstEntidadesRelacionadas[i] = _value;
    }


    /**
     * Gets the lstMoradas value for this Entidade.
     * 
     * @return lstMoradas
     */
    public cmaRepos.Morada[] getLstMoradas() {
        return lstMoradas;
    }


    /**
     * Sets the lstMoradas value for this Entidade.
     * 
     * @param lstMoradas
     */
    public void setLstMoradas(cmaRepos.Morada[] lstMoradas) {
        this.lstMoradas = lstMoradas;
    }

    public cmaRepos.Morada getLstMoradas(int i) {
        return this.lstMoradas[i];
    }

    public void setLstMoradas(int i, cmaRepos.Morada _value) {
        this.lstMoradas[i] = _value;
    }


    /**
     * Gets the lstRecursosOrganizacao value for this Entidade.
     * 
     * @return lstRecursosOrganizacao
     */
    public cmaRepos.RecursoOrganizacao[] getLstRecursosOrganizacao() {
        return lstRecursosOrganizacao;
    }


    /**
     * Sets the lstRecursosOrganizacao value for this Entidade.
     * 
     * @param lstRecursosOrganizacao
     */
    public void setLstRecursosOrganizacao(cmaRepos.RecursoOrganizacao[] lstRecursosOrganizacao) {
        this.lstRecursosOrganizacao = lstRecursosOrganizacao;
    }

    public cmaRepos.RecursoOrganizacao getLstRecursosOrganizacao(int i) {
        return this.lstRecursosOrganizacao[i];
    }

    public void setLstRecursosOrganizacao(int i, cmaRepos.RecursoOrganizacao _value) {
        this.lstRecursosOrganizacao[i] = _value;
    }


    /**
     * Gets the lstRefExternas value for this Entidade.
     * 
     * @return lstRefExternas
     */
    public cmaRepos.ReferenciaExterna[] getLstRefExternas() {
        return lstRefExternas;
    }


    /**
     * Sets the lstRefExternas value for this Entidade.
     * 
     * @param lstRefExternas
     */
    public void setLstRefExternas(cmaRepos.ReferenciaExterna[] lstRefExternas) {
        this.lstRefExternas = lstRefExternas;
    }

    public cmaRepos.ReferenciaExterna getLstRefExternas(int i) {
        return this.lstRefExternas[i];
    }

    public void setLstRefExternas(int i, cmaRepos.ReferenciaExterna _value) {
        this.lstRefExternas[i] = _value;
    }


    /**
     * Gets the mails value for this Entidade.
     * 
     * @return mails
     */
    public java.lang.String getMails() {
        return mails;
    }


    /**
     * Sets the mails value for this Entidade.
     * 
     * @param mails
     */
    public void setMails(java.lang.String mails) {
        this.mails = mails;
    }


    /**
     * Gets the moradaPrincipalStr value for this Entidade.
     * 
     * @return moradaPrincipalStr
     */
    public java.lang.String getMoradaPrincipalStr() {
        return moradaPrincipalStr;
    }


    /**
     * Sets the moradaPrincipalStr value for this Entidade.
     * 
     * @param moradaPrincipalStr
     */
    public void setMoradaPrincipalStr(java.lang.String moradaPrincipalStr) {
        this.moradaPrincipalStr = moradaPrincipalStr;
    }


    /**
     * Gets the NIPC value for this Entidade.
     * 
     * @return NIPC
     */
    public java.lang.String getNIPC() {
        return NIPC;
    }


    /**
     * Sets the NIPC value for this Entidade.
     * 
     * @param NIPC
     */
    public void setNIPC(java.lang.String NIPC) {
        this.NIPC = NIPC;
    }


    /**
     * Gets the NUSNS value for this Entidade.
     * 
     * @return NUSNS
     */
    public java.lang.String getNUSNS() {
        return NUSNS;
    }


    /**
     * Sets the NUSNS value for this Entidade.
     * 
     * @param NUSNS
     */
    public void setNUSNS(java.lang.String NUSNS) {
        this.NUSNS = NUSNS;
    }


    /**
     * Gets the nacionalidade value for this Entidade.
     * 
     * @return nacionalidade
     */
    public java.lang.String getNacionalidade() {
        return nacionalidade;
    }


    /**
     * Sets the nacionalidade value for this Entidade.
     * 
     * @param nacionalidade
     */
    public void setNacionalidade(java.lang.String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    /**
     * Gets the naturezaEntidade value for this Entidade.
     * 
     * @return naturezaEntidade
     */
    public java.lang.String getNaturezaEntidade() {
        return naturezaEntidade;
    }


    /**
     * Sets the naturezaEntidade value for this Entidade.
     * 
     * @param naturezaEntidade
     */
    public void setNaturezaEntidade(java.lang.String naturezaEntidade) {
        this.naturezaEntidade = naturezaEntidade;
    }


    /**
     * Gets the nif value for this Entidade.
     * 
     * @return nif
     */
    public java.lang.String getNif() {
        return nif;
    }


    /**
     * Sets the nif value for this Entidade.
     * 
     * @param nif
     */
    public void setNif(java.lang.String nif) {
        this.nif = nif;
    }


    /**
     * Gets the niss value for this Entidade.
     * 
     * @return niss
     */
    public java.lang.String getNiss() {
        return niss;
    }


    /**
     * Sets the niss value for this Entidade.
     * 
     * @param niss
     */
    public void setNiss(java.lang.String niss) {
        this.niss = niss;
    }


    /**
     * Gets the nivelConfiancaRegisto value for this Entidade.
     * 
     * @return nivelConfiancaRegisto
     */
    public java.lang.String getNivelConfiancaRegisto() {
        return nivelConfiancaRegisto;
    }


    /**
     * Sets the nivelConfiancaRegisto value for this Entidade.
     * 
     * @param nivelConfiancaRegisto
     */
    public void setNivelConfiancaRegisto(java.lang.String nivelConfiancaRegisto) {
        this.nivelConfiancaRegisto = nivelConfiancaRegisto;
    }


    /**
     * Gets the nivelDetalheRegisto value for this Entidade.
     * 
     * @return nivelDetalheRegisto
     */
    public java.lang.String getNivelDetalheRegisto() {
        return nivelDetalheRegisto;
    }


    /**
     * Sets the nivelDetalheRegisto value for this Entidade.
     * 
     * @param nivelDetalheRegisto
     */
    public void setNivelDetalheRegisto(java.lang.String nivelDetalheRegisto) {
        this.nivelDetalheRegisto = nivelDetalheRegisto;
    }


    /**
     * Gets the nivelEscolaridade value for this Entidade.
     * 
     * @return nivelEscolaridade
     */
    public java.lang.String getNivelEscolaridade() {
        return nivelEscolaridade;
    }


    /**
     * Sets the nivelEscolaridade value for this Entidade.
     * 
     * @param nivelEscolaridade
     */
    public void setNivelEscolaridade(java.lang.String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }


    /**
     * Gets the nivelOrganizacional value for this Entidade.
     * 
     * @return nivelOrganizacional
     */
    public java.lang.String getNivelOrganizacional() {
        return nivelOrganizacional;
    }


    /**
     * Sets the nivelOrganizacional value for this Entidade.
     * 
     * @param nivelOrganizacional
     */
    public void setNivelOrganizacional(java.lang.String nivelOrganizacional) {
        this.nivelOrganizacional = nivelOrganizacional;
    }


    /**
     * Gets the nome value for this Entidade.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Entidade.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the nomeEntidade value for this Entidade.
     * 
     * @return nomeEntidade
     */
    public java.lang.String getNomeEntidade() {
        return nomeEntidade;
    }


    /**
     * Sets the nomeEntidade value for this Entidade.
     * 
     * @param nomeEntidade
     */
    public void setNomeEntidade(java.lang.String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }


    /**
     * Gets the nomeMae value for this Entidade.
     * 
     * @return nomeMae
     */
    public java.lang.String getNomeMae() {
        return nomeMae;
    }


    /**
     * Sets the nomeMae value for this Entidade.
     * 
     * @param nomeMae
     */
    public void setNomeMae(java.lang.String nomeMae) {
        this.nomeMae = nomeMae;
    }


    /**
     * Gets the nomePai value for this Entidade.
     * 
     * @return nomePai
     */
    public java.lang.String getNomePai() {
        return nomePai;
    }


    /**
     * Sets the nomePai value for this Entidade.
     * 
     * @param nomePai
     */
    public void setNomePai(java.lang.String nomePai) {
        this.nomePai = nomePai;
    }


    /**
     * Gets the nota value for this Entidade.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this Entidade.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }


    /**
     * Gets the notasManutencaoRegisto value for this Entidade.
     * 
     * @return notasManutencaoRegisto
     */
    public java.lang.String getNotasManutencaoRegisto() {
        return notasManutencaoRegisto;
    }


    /**
     * Sets the notasManutencaoRegisto value for this Entidade.
     * 
     * @param notasManutencaoRegisto
     */
    public void setNotasManutencaoRegisto(java.lang.String notasManutencaoRegisto) {
        this.notasManutencaoRegisto = notasManutencaoRegisto;
    }


    /**
     * Gets the numBiblioteca value for this Entidade.
     * 
     * @return numBiblioteca
     */
    public java.lang.String getNumBiblioteca() {
        return numBiblioteca;
    }


    /**
     * Sets the numBiblioteca value for this Entidade.
     * 
     * @param numBiblioteca
     */
    public void setNumBiblioteca(java.lang.String numBiblioteca) {
        this.numBiblioteca = numBiblioteca;
    }


    /**
     * Gets the numEleitor value for this Entidade.
     * 
     * @return numEleitor
     */
    public java.lang.String getNumEleitor() {
        return numEleitor;
    }


    /**
     * Sets the numEleitor value for this Entidade.
     * 
     * @param numEleitor
     */
    public void setNumEleitor(java.lang.String numEleitor) {
        this.numEleitor = numEleitor;
    }


    /**
     * Gets the numeroIdentificacao value for this Entidade.
     * 
     * @return numeroIdentificacao
     */
    public java.lang.String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }


    /**
     * Sets the numeroIdentificacao value for this Entidade.
     * 
     * @param numeroIdentificacao
     */
    public void setNumeroIdentificacao(java.lang.String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }


    /**
     * Gets the objetoAtividade value for this Entidade.
     * 
     * @return objetoAtividade
     */
    public java.lang.String getObjetoAtividade() {
        return objetoAtividade;
    }


    /**
     * Sets the objetoAtividade value for this Entidade.
     * 
     * @param objetoAtividade
     */
    public void setObjetoAtividade(java.lang.String objetoAtividade) {
        this.objetoAtividade = objetoAtividade;
    }


    /**
     * Gets the observacoes value for this Entidade.
     * 
     * @return observacoes
     */
    public java.lang.String getObservacoes() {
        return observacoes;
    }


    /**
     * Sets the observacoes value for this Entidade.
     * 
     * @param observacoes
     */
    public void setObservacoes(java.lang.String observacoes) {
        this.observacoes = observacoes;
    }


    /**
     * Gets the outroContacto value for this Entidade.
     * 
     * @return outroContacto
     */
    public java.lang.String getOutroContacto() {
        return outroContacto;
    }


    /**
     * Sets the outroContacto value for this Entidade.
     * 
     * @param outroContacto
     */
    public void setOutroContacto(java.lang.String outroContacto) {
        this.outroContacto = outroContacto;
    }


    /**
     * Gets the paisNacionalidade value for this Entidade.
     * 
     * @return paisNacionalidade
     */
    public java.lang.String getPaisNacionalidade() {
        return paisNacionalidade;
    }


    /**
     * Sets the paisNacionalidade value for this Entidade.
     * 
     * @param paisNacionalidade
     */
    public void setPaisNacionalidade(java.lang.String paisNacionalidade) {
        this.paisNacionalidade = paisNacionalidade;
    }


    /**
     * Gets the paisNaturalidade value for this Entidade.
     * 
     * @return paisNaturalidade
     */
    public java.lang.String getPaisNaturalidade() {
        return paisNaturalidade;
    }


    /**
     * Sets the paisNaturalidade value for this Entidade.
     * 
     * @param paisNaturalidade
     */
    public void setPaisNaturalidade(java.lang.String paisNaturalidade) {
        this.paisNaturalidade = paisNaturalidade;
    }


    /**
     * Gets the pass value for this Entidade.
     * 
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this Entidade.
     * 
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }


    /**
     * Gets the percentagemParticipCM_CapSocial value for this Entidade.
     * 
     * @return percentagemParticipCM_CapSocial
     */
    public java.lang.String getPercentagemParticipCM_CapSocial() {
        return percentagemParticipCM_CapSocial;
    }


    /**
     * Sets the percentagemParticipCM_CapSocial value for this Entidade.
     * 
     * @param percentagemParticipCM_CapSocial
     */
    public void setPercentagemParticipCM_CapSocial(java.lang.String percentagemParticipCM_CapSocial) {
        this.percentagemParticipCM_CapSocial = percentagemParticipCM_CapSocial;
    }


    /**
     * Gets the preInscricao value for this Entidade.
     * 
     * @return preInscricao
     */
    public boolean isPreInscricao() {
        return preInscricao;
    }


    /**
     * Sets the preInscricao value for this Entidade.
     * 
     * @param preInscricao
     */
    public void setPreInscricao(boolean preInscricao) {
        this.preInscricao = preInscricao;
    }


    /**
     * Gets the privada value for this Entidade.
     * 
     * @return privada
     */
    public boolean isPrivada() {
        return privada;
    }


    /**
     * Sets the privada value for this Entidade.
     * 
     * @param privada
     */
    public void setPrivada(boolean privada) {
        this.privada = privada;
    }


    /**
     * Gets the profissao value for this Entidade.
     * 
     * @return profissao
     */
    public java.lang.String getProfissao() {
        return profissao;
    }


    /**
     * Sets the profissao value for this Entidade.
     * 
     * @param profissao
     */
    public void setProfissao(java.lang.String profissao) {
        this.profissao = profissao;
    }


    /**
     * Gets the publica value for this Entidade.
     * 
     * @return publica
     */
    public boolean isPublica() {
        return publica;
    }


    /**
     * Sets the publica value for this Entidade.
     * 
     * @param publica
     */
    public void setPublica(boolean publica) {
        this.publica = publica;
    }


    /**
     * Gets the receberBoletimMunicipal value for this Entidade.
     * 
     * @return receberBoletimMunicipal
     */
    public boolean isReceberBoletimMunicipal() {
        return receberBoletimMunicipal;
    }


    /**
     * Sets the receberBoletimMunicipal value for this Entidade.
     * 
     * @param receberBoletimMunicipal
     */
    public void setReceberBoletimMunicipal(boolean receberBoletimMunicipal) {
        this.receberBoletimMunicipal = receberBoletimMunicipal;
    }


    /**
     * Gets the referencia value for this Entidade.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this Entidade.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the regrasConvencoes value for this Entidade.
     * 
     * @return regrasConvencoes
     */
    public java.lang.String getRegrasConvencoes() {
        return regrasConvencoes;
    }


    /**
     * Sets the regrasConvencoes value for this Entidade.
     * 
     * @param regrasConvencoes
     */
    public void setRegrasConvencoes(java.lang.String regrasConvencoes) {
        this.regrasConvencoes = regrasConvencoes;
    }


    /**
     * Gets the selese value for this Entidade.
     * 
     * @return selese
     */
    public boolean isSelese() {
        return selese;
    }


    /**
     * Sets the selese value for this Entidade.
     * 
     * @param selese
     */
    public void setSelese(boolean selese) {
        this.selese = selese;
    }


    /**
     * Gets the sigla value for this Entidade.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Entidade.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the telefones value for this Entidade.
     * 
     * @return telefones
     */
    public java.lang.String getTelefones() {
        return telefones;
    }


    /**
     * Sets the telefones value for this Entidade.
     * 
     * @param telefones
     */
    public void setTelefones(java.lang.String telefones) {
        this.telefones = telefones;
    }


    /**
     * Gets the tipoDividas value for this Entidade.
     * 
     * @return tipoDividas
     */
    public java.lang.String[] getTipoDividas() {
        return tipoDividas;
    }


    /**
     * Sets the tipoDividas value for this Entidade.
     * 
     * @param tipoDividas
     */
    public void setTipoDividas(java.lang.String[] tipoDividas) {
        this.tipoDividas = tipoDividas;
    }

    public java.lang.String getTipoDividas(int i) {
        return this.tipoDividas[i];
    }

    public void setTipoDividas(int i, java.lang.String _value) {
        this.tipoDividas[i] = _value;
    }


    /**
     * Gets the tipoEmpBib value for this Entidade.
     * 
     * @return tipoEmpBib
     */
    public java.lang.String getTipoEmpBib() {
        return tipoEmpBib;
    }


    /**
     * Sets the tipoEmpBib value for this Entidade.
     * 
     * @param tipoEmpBib
     */
    public void setTipoEmpBib(java.lang.String tipoEmpBib) {
        this.tipoEmpBib = tipoEmpBib;
    }


    /**
     * Gets the tipoIdentificacao value for this Entidade.
     * 
     * @return tipoIdentificacao
     */
    public java.lang.String getTipoIdentificacao() {
        return tipoIdentificacao;
    }


    /**
     * Sets the tipoIdentificacao value for this Entidade.
     * 
     * @param tipoIdentificacao
     */
    public void setTipoIdentificacao(java.lang.String tipoIdentificacao) {
        this.tipoIdentificacao = tipoIdentificacao;
    }


    /**
     * Gets the tipoUtilizBib value for this Entidade.
     * 
     * @return tipoUtilizBib
     */
    public java.lang.String getTipoUtilizBib() {
        return tipoUtilizBib;
    }


    /**
     * Sets the tipoUtilizBib value for this Entidade.
     * 
     * @param tipoUtilizBib
     */
    public void setTipoUtilizBib(java.lang.String tipoUtilizBib) {
        this.tipoUtilizBib = tipoUtilizBib;
    }


    /**
     * Gets the tipoUtilizador value for this Entidade.
     * 
     * @return tipoUtilizador
     */
    public java.lang.String getTipoUtilizador() {
        return tipoUtilizador;
    }


    /**
     * Sets the tipoUtilizador value for this Entidade.
     * 
     * @param tipoUtilizador
     */
    public void setTipoUtilizador(java.lang.String tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }


    /**
     * Gets the txtEstudante value for this Entidade.
     * 
     * @return txtEstudante
     */
    public java.lang.String getTxtEstudante() {
        return txtEstudante;
    }


    /**
     * Sets the txtEstudante value for this Entidade.
     * 
     * @param txtEstudante
     */
    public void setTxtEstudante(java.lang.String txtEstudante) {
        this.txtEstudante = txtEstudante;
    }


    /**
     * Gets the updatedBy value for this Entidade.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Entidade.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the utilidadePublica value for this Entidade.
     * 
     * @return utilidadePublica
     */
    public boolean isUtilidadePublica() {
        return utilidadePublica;
    }


    /**
     * Sets the utilidadePublica value for this Entidade.
     * 
     * @param utilidadePublica
     */
    public void setUtilidadePublica(boolean utilidadePublica) {
        this.utilidadePublica = utilidadePublica;
    }


    /**
     * Gets the valorParticipCM_CapSocial value for this Entidade.
     * 
     * @return valorParticipCM_CapSocial
     */
    public java.lang.String getValorParticipCM_CapSocial() {
        return valorParticipCM_CapSocial;
    }


    /**
     * Sets the valorParticipCM_CapSocial value for this Entidade.
     * 
     * @param valorParticipCM_CapSocial
     */
    public void setValorParticipCM_CapSocial(java.lang.String valorParticipCM_CapSocial) {
        this.valorParticipCM_CapSocial = valorParticipCM_CapSocial;
    }


    /**
     * Gets the _Id value for this Entidade.
     * 
     * @return _Id
     */
    public java.lang.String get_Id() {
        return _Id;
    }


    /**
     * Sets the _Id value for this Entidade.
     * 
     * @param _Id
     */
    public void set_Id(java.lang.String _Id) {
        this._Id = _Id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entidade)) return false;
        Entidade other = (Entidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atividadeCodIRS==null && other.getAtividadeCodIRS()==null) || 
             (this.atividadeCodIRS!=null &&
              this.atividadeCodIRS.equals(other.getAtividadeCodIRS()))) &&
            ((this.canalPrefComunicacao==null && other.getCanalPrefComunicacao()==null) || 
             (this.canalPrefComunicacao!=null &&
              this.canalPrefComunicacao.equals(other.getCanalPrefComunicacao()))) &&
            this.cartaoEntregue == other.isCartaoEntregue() &&
            this.cartaoImpresso == other.isCartaoImpresso() &&
            this.cliente == other.isCliente() &&
            ((this.codAtivacao==null && other.getCodAtivacao()==null) || 
             (this.codAtivacao!=null &&
              this.codAtivacao.equals(other.getCodAtivacao()))) &&
            ((this.codAtividadeEconomica==null && other.getCodAtividadeEconomica()==null) || 
             (this.codAtividadeEconomica!=null &&
              this.codAtividadeEconomica.equals(other.getCodAtividadeEconomica()))) &&
            ((this.codEstadoCivil==null && other.getCodEstadoCivil()==null) || 
             (this.codEstadoCivil!=null &&
              this.codEstadoCivil.equals(other.getCodEstadoCivil()))) &&
            ((this.codFreguesiaNaturalidade==null && other.getCodFreguesiaNaturalidade()==null) || 
             (this.codFreguesiaNaturalidade!=null &&
              this.codFreguesiaNaturalidade.equals(other.getCodFreguesiaNaturalidade()))) &&
            ((this.codGrupoProfissional==null && other.getCodGrupoProfissional()==null) || 
             (this.codGrupoProfissional!=null &&
              this.codGrupoProfissional.equals(other.getCodGrupoProfissional()))) &&
            ((this.codLocalidadeNaturalidade==null && other.getCodLocalidadeNaturalidade()==null) || 
             (this.codLocalidadeNaturalidade!=null &&
              this.codLocalidadeNaturalidade.equals(other.getCodLocalidadeNaturalidade()))) &&
            ((this.codNacionalidade==null && other.getCodNacionalidade()==null) || 
             (this.codNacionalidade!=null &&
              this.codNacionalidade.equals(other.getCodNacionalidade()))) &&
            ((this.codNivelEscolaridade==null && other.getCodNivelEscolaridade()==null) || 
             (this.codNivelEscolaridade!=null &&
              this.codNivelEscolaridade.equals(other.getCodNivelEscolaridade()))) &&
            ((this.codPaisNacionalidade==null && other.getCodPaisNacionalidade()==null) || 
             (this.codPaisNacionalidade!=null &&
              this.codPaisNacionalidade.equals(other.getCodPaisNacionalidade()))) &&
            ((this.codPaisNaturalidade==null && other.getCodPaisNaturalidade()==null) || 
             (this.codPaisNaturalidade!=null &&
              this.codPaisNaturalidade.equals(other.getCodPaisNaturalidade()))) &&
            ((this.codProfissao==null && other.getCodProfissao()==null) || 
             (this.codProfissao!=null &&
              this.codProfissao.equals(other.getCodProfissao()))) &&
            this.colaborador == other.isColaborador() &&
            this.coletividade == other.isColetividade() &&
            this.contaAtiva == other.isContaAtiva() &&
            ((this.contactosTxt==null && other.getContactosTxt()==null) || 
             (this.contactosTxt!=null &&
              this.contactosTxt.equals(other.getContactosTxt()))) &&
            ((this.contumacia==null && other.getContumacia()==null) || 
             (this.contumacia!=null &&
              this.contumacia.equals(other.getContumacia()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.dataExistenciaFim==null && other.getDataExistenciaFim()==null) || 
             (this.dataExistenciaFim!=null &&
              this.dataExistenciaFim.equals(other.getDataExistenciaFim()))) &&
            ((this.dataExistenciaInicio==null && other.getDataExistenciaInicio()==null) || 
             (this.dataExistenciaInicio!=null &&
              this.dataExistenciaInicio.equals(other.getDataExistenciaInicio()))) &&
            ((this.dataInscricao==null && other.getDataInscricao()==null) || 
             (this.dataInscricao!=null &&
              this.dataInscricao.equals(other.getDataInscricao()))) &&
            ((this.dataInscricaoFinancas==null && other.getDataInscricaoFinancas()==null) || 
             (this.dataInscricaoFinancas!=null &&
              this.dataInscricaoFinancas.equals(other.getDataInscricaoFinancas()))) &&
            ((this.dataInscricaoSSocial==null && other.getDataInscricaoSSocial()==null) || 
             (this.dataInscricaoSSocial!=null &&
              this.dataInscricaoSSocial.equals(other.getDataInscricaoSSocial()))) &&
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.dataObito==null && other.getDataObito()==null) || 
             (this.dataObito!=null &&
              this.dataObito.equals(other.getDataObito()))) &&
            ((this.dataRenovInsc==null && other.getDataRenovInsc()==null) || 
             (this.dataRenovInsc!=null &&
              this.dataRenovInsc.equals(other.getDataRenovInsc()))) &&
            ((this.dataValidade==null && other.getDataValidade()==null) || 
             (this.dataValidade!=null &&
              this.dataValidade.equals(other.getDataValidade()))) &&
            ((this.desigComercialOutra==null && other.getDesigComercialOutra()==null) || 
             (this.desigComercialOutra!=null &&
              this.desigComercialOutra.equals(other.getDesigComercialOutra()))) &&
            ((this.designacao==null && other.getDesignacao()==null) || 
             (this.designacao!=null &&
              this.designacao.equals(other.getDesignacao()))) &&
            this.docVitalicio == other.isDocVitalicio() &&
            ((this.dtInscPiscina==null && other.getDtInscPiscina()==null) || 
             (this.dtInscPiscina!=null &&
              this.dtInscPiscina.equals(other.getDtInscPiscina()))) &&
            ((this.encEducacao==null && other.getEncEducacao()==null) || 
             (this.encEducacao!=null &&
              this.encEducacao.equals(other.getEncEducacao()))) &&
            this.entidadeArquivistica == other.isEntidadeArquivistica() &&
            ((this.entidadeEmissora==null && other.getEntidadeEmissora()==null) || 
             (this.entidadeEmissora!=null &&
              this.entidadeEmissora.equals(other.getEntidadeEmissora()))) &&
            ((this.escEtarioINE==null && other.getEscEtarioINE()==null) || 
             (this.escEtarioINE!=null &&
              this.escEtarioINE.equals(other.getEscEtarioINE()))) &&
            ((this.escEtarioISO==null && other.getEscEtarioISO()==null) || 
             (this.escEtarioISO!=null &&
              this.escEtarioISO.equals(other.getEscEtarioISO()))) &&
            ((this.estadoCivil==null && other.getEstadoCivil()==null) || 
             (this.estadoCivil!=null &&
              this.estadoCivil.equals(other.getEstadoCivil()))) &&
            ((this.estadoEntidade==null && other.getEstadoEntidade()==null) || 
             (this.estadoEntidade!=null &&
              this.estadoEntidade.equals(other.getEstadoEntidade()))) &&
            ((this.estadoRegisto==null && other.getEstadoRegisto()==null) || 
             (this.estadoRegisto!=null &&
              this.estadoRegisto.equals(other.getEstadoRegisto()))) &&
            this.estudante == other.isEstudante() &&
            ((this.formaJuridica==null && other.getFormaJuridica()==null) || 
             (this.formaJuridica!=null &&
              this.formaJuridica.equals(other.getFormaJuridica()))) &&
            this.fornecedor == other.isFornecedor() &&
            ((this.foto_logo==null && other.getFoto_logo()==null) || 
             (this.foto_logo!=null &&
              this.foto_logo.equals(other.getFoto_logo()))) &&
            ((this.freguesiaNaturalidade==null && other.getFreguesiaNaturalidade()==null) || 
             (this.freguesiaNaturalidade!=null &&
              this.freguesiaNaturalidade.equals(other.getFreguesiaNaturalidade()))) &&
            ((this.genero==null && other.getGenero()==null) || 
             (this.genero!=null &&
              this.genero.equals(other.getGenero()))) &&
            ((this.grupoProfissional==null && other.getGrupoProfissional()==null) || 
             (this.grupoProfissional!=null &&
              this.grupoProfissional.equals(other.getGrupoProfissional()))) &&
            this.hasTermo == other.isHasTermo() &&
            ((this.importadoPara==null && other.getImportadoPara()==null) || 
             (this.importadoPara!=null &&
              this.importadoPara.equals(other.getImportadoPara()))) &&
            ((this.justAusenciaNif==null && other.getJustAusenciaNif()==null) || 
             (this.justAusenciaNif!=null &&
              this.justAusenciaNif.equals(other.getJustAusenciaNif()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.localInscricao==null && other.getLocalInscricao()==null) || 
             (this.localInscricao!=null &&
              this.localInscricao.equals(other.getLocalInscricao()))) &&
            ((this.localidadeNaturalidade==null && other.getLocalidadeNaturalidade()==null) || 
             (this.localidadeNaturalidade!=null &&
              this.localidadeNaturalidade.equals(other.getLocalidadeNaturalidade()))) &&
            ((this.lstAIAtividades==null && other.getLstAIAtividades()==null) || 
             (this.lstAIAtividades!=null &&
              java.util.Arrays.equals(this.lstAIAtividades, other.getLstAIAtividades()))) &&
            ((this.lstAIRecursos==null && other.getLstAIRecursos()==null) || 
             (this.lstAIRecursos!=null &&
              java.util.Arrays.equals(this.lstAIRecursos, other.getLstAIRecursos()))) &&
            ((this.lstContactos==null && other.getLstContactos()==null) || 
             (this.lstContactos!=null &&
              java.util.Arrays.equals(this.lstContactos, other.getLstContactos()))) &&
            ((this.lstDocsFI==null && other.getLstDocsFI()==null) || 
             (this.lstDocsFI!=null &&
              java.util.Arrays.equals(this.lstDocsFI, other.getLstDocsFI()))) &&
            ((this.lstDocumentos==null && other.getLstDocumentos()==null) || 
             (this.lstDocumentos!=null &&
              java.util.Arrays.equals(this.lstDocumentos, other.getLstDocumentos()))) &&
            ((this.lstEntidadesRelacionadas==null && other.getLstEntidadesRelacionadas()==null) || 
             (this.lstEntidadesRelacionadas!=null &&
              java.util.Arrays.equals(this.lstEntidadesRelacionadas, other.getLstEntidadesRelacionadas()))) &&
            ((this.lstMoradas==null && other.getLstMoradas()==null) || 
             (this.lstMoradas!=null &&
              java.util.Arrays.equals(this.lstMoradas, other.getLstMoradas()))) &&
            ((this.lstRecursosOrganizacao==null && other.getLstRecursosOrganizacao()==null) || 
             (this.lstRecursosOrganizacao!=null &&
              java.util.Arrays.equals(this.lstRecursosOrganizacao, other.getLstRecursosOrganizacao()))) &&
            ((this.lstRefExternas==null && other.getLstRefExternas()==null) || 
             (this.lstRefExternas!=null &&
              java.util.Arrays.equals(this.lstRefExternas, other.getLstRefExternas()))) &&
            ((this.mails==null && other.getMails()==null) || 
             (this.mails!=null &&
              this.mails.equals(other.getMails()))) &&
            ((this.moradaPrincipalStr==null && other.getMoradaPrincipalStr()==null) || 
             (this.moradaPrincipalStr!=null &&
              this.moradaPrincipalStr.equals(other.getMoradaPrincipalStr()))) &&
            ((this.NIPC==null && other.getNIPC()==null) || 
             (this.NIPC!=null &&
              this.NIPC.equals(other.getNIPC()))) &&
            ((this.NUSNS==null && other.getNUSNS()==null) || 
             (this.NUSNS!=null &&
              this.NUSNS.equals(other.getNUSNS()))) &&
            ((this.nacionalidade==null && other.getNacionalidade()==null) || 
             (this.nacionalidade!=null &&
              this.nacionalidade.equals(other.getNacionalidade()))) &&
            ((this.naturezaEntidade==null && other.getNaturezaEntidade()==null) || 
             (this.naturezaEntidade!=null &&
              this.naturezaEntidade.equals(other.getNaturezaEntidade()))) &&
            ((this.nif==null && other.getNif()==null) || 
             (this.nif!=null &&
              this.nif.equals(other.getNif()))) &&
            ((this.niss==null && other.getNiss()==null) || 
             (this.niss!=null &&
              this.niss.equals(other.getNiss()))) &&
            ((this.nivelConfiancaRegisto==null && other.getNivelConfiancaRegisto()==null) || 
             (this.nivelConfiancaRegisto!=null &&
              this.nivelConfiancaRegisto.equals(other.getNivelConfiancaRegisto()))) &&
            ((this.nivelDetalheRegisto==null && other.getNivelDetalheRegisto()==null) || 
             (this.nivelDetalheRegisto!=null &&
              this.nivelDetalheRegisto.equals(other.getNivelDetalheRegisto()))) &&
            ((this.nivelEscolaridade==null && other.getNivelEscolaridade()==null) || 
             (this.nivelEscolaridade!=null &&
              this.nivelEscolaridade.equals(other.getNivelEscolaridade()))) &&
            ((this.nivelOrganizacional==null && other.getNivelOrganizacional()==null) || 
             (this.nivelOrganizacional!=null &&
              this.nivelOrganizacional.equals(other.getNivelOrganizacional()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.nomeEntidade==null && other.getNomeEntidade()==null) || 
             (this.nomeEntidade!=null &&
              this.nomeEntidade.equals(other.getNomeEntidade()))) &&
            ((this.nomeMae==null && other.getNomeMae()==null) || 
             (this.nomeMae!=null &&
              this.nomeMae.equals(other.getNomeMae()))) &&
            ((this.nomePai==null && other.getNomePai()==null) || 
             (this.nomePai!=null &&
              this.nomePai.equals(other.getNomePai()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota()))) &&
            ((this.notasManutencaoRegisto==null && other.getNotasManutencaoRegisto()==null) || 
             (this.notasManutencaoRegisto!=null &&
              this.notasManutencaoRegisto.equals(other.getNotasManutencaoRegisto()))) &&
            ((this.numBiblioteca==null && other.getNumBiblioteca()==null) || 
             (this.numBiblioteca!=null &&
              this.numBiblioteca.equals(other.getNumBiblioteca()))) &&
            ((this.numEleitor==null && other.getNumEleitor()==null) || 
             (this.numEleitor!=null &&
              this.numEleitor.equals(other.getNumEleitor()))) &&
            ((this.numeroIdentificacao==null && other.getNumeroIdentificacao()==null) || 
             (this.numeroIdentificacao!=null &&
              this.numeroIdentificacao.equals(other.getNumeroIdentificacao()))) &&
            ((this.objetoAtividade==null && other.getObjetoAtividade()==null) || 
             (this.objetoAtividade!=null &&
              this.objetoAtividade.equals(other.getObjetoAtividade()))) &&
            ((this.observacoes==null && other.getObservacoes()==null) || 
             (this.observacoes!=null &&
              this.observacoes.equals(other.getObservacoes()))) &&
            ((this.outroContacto==null && other.getOutroContacto()==null) || 
             (this.outroContacto!=null &&
              this.outroContacto.equals(other.getOutroContacto()))) &&
            ((this.paisNacionalidade==null && other.getPaisNacionalidade()==null) || 
             (this.paisNacionalidade!=null &&
              this.paisNacionalidade.equals(other.getPaisNacionalidade()))) &&
            ((this.paisNaturalidade==null && other.getPaisNaturalidade()==null) || 
             (this.paisNaturalidade!=null &&
              this.paisNaturalidade.equals(other.getPaisNaturalidade()))) &&
            ((this.pass==null && other.getPass()==null) || 
             (this.pass!=null &&
              this.pass.equals(other.getPass()))) &&
            ((this.percentagemParticipCM_CapSocial==null && other.getPercentagemParticipCM_CapSocial()==null) || 
             (this.percentagemParticipCM_CapSocial!=null &&
              this.percentagemParticipCM_CapSocial.equals(other.getPercentagemParticipCM_CapSocial()))) &&
            this.preInscricao == other.isPreInscricao() &&
            this.privada == other.isPrivada() &&
            ((this.profissao==null && other.getProfissao()==null) || 
             (this.profissao!=null &&
              this.profissao.equals(other.getProfissao()))) &&
            this.publica == other.isPublica() &&
            this.receberBoletimMunicipal == other.isReceberBoletimMunicipal() &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.regrasConvencoes==null && other.getRegrasConvencoes()==null) || 
             (this.regrasConvencoes!=null &&
              this.regrasConvencoes.equals(other.getRegrasConvencoes()))) &&
            this.selese == other.isSelese() &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.telefones==null && other.getTelefones()==null) || 
             (this.telefones!=null &&
              this.telefones.equals(other.getTelefones()))) &&
            ((this.tipoDividas==null && other.getTipoDividas()==null) || 
             (this.tipoDividas!=null &&
              java.util.Arrays.equals(this.tipoDividas, other.getTipoDividas()))) &&
            ((this.tipoEmpBib==null && other.getTipoEmpBib()==null) || 
             (this.tipoEmpBib!=null &&
              this.tipoEmpBib.equals(other.getTipoEmpBib()))) &&
            ((this.tipoIdentificacao==null && other.getTipoIdentificacao()==null) || 
             (this.tipoIdentificacao!=null &&
              this.tipoIdentificacao.equals(other.getTipoIdentificacao()))) &&
            ((this.tipoUtilizBib==null && other.getTipoUtilizBib()==null) || 
             (this.tipoUtilizBib!=null &&
              this.tipoUtilizBib.equals(other.getTipoUtilizBib()))) &&
            ((this.tipoUtilizador==null && other.getTipoUtilizador()==null) || 
             (this.tipoUtilizador!=null &&
              this.tipoUtilizador.equals(other.getTipoUtilizador()))) &&
            ((this.txtEstudante==null && other.getTxtEstudante()==null) || 
             (this.txtEstudante!=null &&
              this.txtEstudante.equals(other.getTxtEstudante()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            this.utilidadePublica == other.isUtilidadePublica() &&
            ((this.valorParticipCM_CapSocial==null && other.getValorParticipCM_CapSocial()==null) || 
             (this.valorParticipCM_CapSocial!=null &&
              this.valorParticipCM_CapSocial.equals(other.getValorParticipCM_CapSocial()))) &&
            ((this._Id==null && other.get_Id()==null) || 
             (this._Id!=null &&
              this._Id.equals(other.get_Id())));
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
        if (getAtividadeCodIRS() != null) {
            _hashCode += getAtividadeCodIRS().hashCode();
        }
        if (getCanalPrefComunicacao() != null) {
            _hashCode += getCanalPrefComunicacao().hashCode();
        }
        _hashCode += (isCartaoEntregue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCartaoImpresso() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCliente() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodAtivacao() != null) {
            _hashCode += getCodAtivacao().hashCode();
        }
        if (getCodAtividadeEconomica() != null) {
            _hashCode += getCodAtividadeEconomica().hashCode();
        }
        if (getCodEstadoCivil() != null) {
            _hashCode += getCodEstadoCivil().hashCode();
        }
        if (getCodFreguesiaNaturalidade() != null) {
            _hashCode += getCodFreguesiaNaturalidade().hashCode();
        }
        if (getCodGrupoProfissional() != null) {
            _hashCode += getCodGrupoProfissional().hashCode();
        }
        if (getCodLocalidadeNaturalidade() != null) {
            _hashCode += getCodLocalidadeNaturalidade().hashCode();
        }
        if (getCodNacionalidade() != null) {
            _hashCode += getCodNacionalidade().hashCode();
        }
        if (getCodNivelEscolaridade() != null) {
            _hashCode += getCodNivelEscolaridade().hashCode();
        }
        if (getCodPaisNacionalidade() != null) {
            _hashCode += getCodPaisNacionalidade().hashCode();
        }
        if (getCodPaisNaturalidade() != null) {
            _hashCode += getCodPaisNaturalidade().hashCode();
        }
        if (getCodProfissao() != null) {
            _hashCode += getCodProfissao().hashCode();
        }
        _hashCode += (isColaborador() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isColetividade() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isContaAtiva() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContactosTxt() != null) {
            _hashCode += getContactosTxt().hashCode();
        }
        if (getContumacia() != null) {
            _hashCode += getContumacia().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDataExistenciaFim() != null) {
            _hashCode += getDataExistenciaFim().hashCode();
        }
        if (getDataExistenciaInicio() != null) {
            _hashCode += getDataExistenciaInicio().hashCode();
        }
        if (getDataInscricao() != null) {
            _hashCode += getDataInscricao().hashCode();
        }
        if (getDataInscricaoFinancas() != null) {
            _hashCode += getDataInscricaoFinancas().hashCode();
        }
        if (getDataInscricaoSSocial() != null) {
            _hashCode += getDataInscricaoSSocial().hashCode();
        }
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getDataObito() != null) {
            _hashCode += getDataObito().hashCode();
        }
        if (getDataRenovInsc() != null) {
            _hashCode += getDataRenovInsc().hashCode();
        }
        if (getDataValidade() != null) {
            _hashCode += getDataValidade().hashCode();
        }
        if (getDesigComercialOutra() != null) {
            _hashCode += getDesigComercialOutra().hashCode();
        }
        if (getDesignacao() != null) {
            _hashCode += getDesignacao().hashCode();
        }
        _hashCode += (isDocVitalicio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDtInscPiscina() != null) {
            _hashCode += getDtInscPiscina().hashCode();
        }
        if (getEncEducacao() != null) {
            _hashCode += getEncEducacao().hashCode();
        }
        _hashCode += (isEntidadeArquivistica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEntidadeEmissora() != null) {
            _hashCode += getEntidadeEmissora().hashCode();
        }
        if (getEscEtarioINE() != null) {
            _hashCode += getEscEtarioINE().hashCode();
        }
        if (getEscEtarioISO() != null) {
            _hashCode += getEscEtarioISO().hashCode();
        }
        if (getEstadoCivil() != null) {
            _hashCode += getEstadoCivil().hashCode();
        }
        if (getEstadoEntidade() != null) {
            _hashCode += getEstadoEntidade().hashCode();
        }
        if (getEstadoRegisto() != null) {
            _hashCode += getEstadoRegisto().hashCode();
        }
        _hashCode += (isEstudante() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFormaJuridica() != null) {
            _hashCode += getFormaJuridica().hashCode();
        }
        _hashCode += (isFornecedor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFoto_logo() != null) {
            _hashCode += getFoto_logo().hashCode();
        }
        if (getFreguesiaNaturalidade() != null) {
            _hashCode += getFreguesiaNaturalidade().hashCode();
        }
        if (getGenero() != null) {
            _hashCode += getGenero().hashCode();
        }
        if (getGrupoProfissional() != null) {
            _hashCode += getGrupoProfissional().hashCode();
        }
        _hashCode += (isHasTermo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getImportadoPara() != null) {
            _hashCode += getImportadoPara().hashCode();
        }
        if (getJustAusenciaNif() != null) {
            _hashCode += getJustAusenciaNif().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getLocalInscricao() != null) {
            _hashCode += getLocalInscricao().hashCode();
        }
        if (getLocalidadeNaturalidade() != null) {
            _hashCode += getLocalidadeNaturalidade().hashCode();
        }
        if (getLstAIAtividades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstAIAtividades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstAIAtividades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstAIRecursos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstAIRecursos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstAIRecursos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstContactos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstContactos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstContactos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstDocsFI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstDocsFI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstDocsFI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstDocumentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstDocumentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstDocumentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstEntidadesRelacionadas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstEntidadesRelacionadas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstEntidadesRelacionadas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstMoradas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstMoradas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstMoradas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstRecursosOrganizacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstRecursosOrganizacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstRecursosOrganizacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLstRefExternas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLstRefExternas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLstRefExternas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMails() != null) {
            _hashCode += getMails().hashCode();
        }
        if (getMoradaPrincipalStr() != null) {
            _hashCode += getMoradaPrincipalStr().hashCode();
        }
        if (getNIPC() != null) {
            _hashCode += getNIPC().hashCode();
        }
        if (getNUSNS() != null) {
            _hashCode += getNUSNS().hashCode();
        }
        if (getNacionalidade() != null) {
            _hashCode += getNacionalidade().hashCode();
        }
        if (getNaturezaEntidade() != null) {
            _hashCode += getNaturezaEntidade().hashCode();
        }
        if (getNif() != null) {
            _hashCode += getNif().hashCode();
        }
        if (getNiss() != null) {
            _hashCode += getNiss().hashCode();
        }
        if (getNivelConfiancaRegisto() != null) {
            _hashCode += getNivelConfiancaRegisto().hashCode();
        }
        if (getNivelDetalheRegisto() != null) {
            _hashCode += getNivelDetalheRegisto().hashCode();
        }
        if (getNivelEscolaridade() != null) {
            _hashCode += getNivelEscolaridade().hashCode();
        }
        if (getNivelOrganizacional() != null) {
            _hashCode += getNivelOrganizacional().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNomeEntidade() != null) {
            _hashCode += getNomeEntidade().hashCode();
        }
        if (getNomeMae() != null) {
            _hashCode += getNomeMae().hashCode();
        }
        if (getNomePai() != null) {
            _hashCode += getNomePai().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        if (getNotasManutencaoRegisto() != null) {
            _hashCode += getNotasManutencaoRegisto().hashCode();
        }
        if (getNumBiblioteca() != null) {
            _hashCode += getNumBiblioteca().hashCode();
        }
        if (getNumEleitor() != null) {
            _hashCode += getNumEleitor().hashCode();
        }
        if (getNumeroIdentificacao() != null) {
            _hashCode += getNumeroIdentificacao().hashCode();
        }
        if (getObjetoAtividade() != null) {
            _hashCode += getObjetoAtividade().hashCode();
        }
        if (getObservacoes() != null) {
            _hashCode += getObservacoes().hashCode();
        }
        if (getOutroContacto() != null) {
            _hashCode += getOutroContacto().hashCode();
        }
        if (getPaisNacionalidade() != null) {
            _hashCode += getPaisNacionalidade().hashCode();
        }
        if (getPaisNaturalidade() != null) {
            _hashCode += getPaisNaturalidade().hashCode();
        }
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        if (getPercentagemParticipCM_CapSocial() != null) {
            _hashCode += getPercentagemParticipCM_CapSocial().hashCode();
        }
        _hashCode += (isPreInscricao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPrivada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProfissao() != null) {
            _hashCode += getProfissao().hashCode();
        }
        _hashCode += (isPublica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceberBoletimMunicipal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getRegrasConvencoes() != null) {
            _hashCode += getRegrasConvencoes().hashCode();
        }
        _hashCode += (isSelese() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getTelefones() != null) {
            _hashCode += getTelefones().hashCode();
        }
        if (getTipoDividas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTipoDividas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTipoDividas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoEmpBib() != null) {
            _hashCode += getTipoEmpBib().hashCode();
        }
        if (getTipoIdentificacao() != null) {
            _hashCode += getTipoIdentificacao().hashCode();
        }
        if (getTipoUtilizBib() != null) {
            _hashCode += getTipoUtilizBib().hashCode();
        }
        if (getTipoUtilizador() != null) {
            _hashCode += getTipoUtilizador().hashCode();
        }
        if (getTxtEstudante() != null) {
            _hashCode += getTxtEstudante().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        _hashCode += (isUtilidadePublica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValorParticipCM_CapSocial() != null) {
            _hashCode += getValorParticipCM_CapSocial().hashCode();
        }
        if (get_Id() != null) {
            _hashCode += get_Id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entidade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "entidade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atividadeCodIRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atividadeCodIRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canalPrefComunicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canalPrefComunicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartaoEntregue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartaoEntregue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartaoImpresso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartaoImpresso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAtivacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codAtivacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAtividadeEconomica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codAtividadeEconomica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEstadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codEstadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFreguesiaNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codFreguesiaNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codGrupoProfissional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codGrupoProfissional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codLocalidadeNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codLocalidadeNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNacionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codNacionalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNivelEscolaridade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codNivelEscolaridade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPaisNacionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPaisNacionalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPaisNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codPaisNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codProfissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codProfissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colaborador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colaborador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coletividade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coletividade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaAtiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaAtiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactosTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactosTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contumacia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contumacia"));
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
        elemField.setFieldName("dataAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExistenciaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataExistenciaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExistenciaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataExistenciaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInscricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInscricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInscricaoFinancas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInscricaoFinancas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInscricaoSSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInscricaoSSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataObito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataObito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRenovInsc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRenovInsc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desigComercialOutra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desigComercialOutra"));
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
        elemField.setFieldName("docVitalicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docVitalicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtInscPiscina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtInscPiscina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encEducacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encEducacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidadeArquivistica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entidadeArquivistica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidadeEmissora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entidadeEmissora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escEtarioINE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escEtarioINE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escEtarioISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escEtarioISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoEntidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoEntidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoRegisto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoRegisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estudante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estudante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaJuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaJuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foto_logo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foto_logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "inputStream"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freguesiaNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freguesiaNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoProfissional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grupoProfissional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTermo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTermo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importadoPara");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importadoPara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justAusenciaNif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justAusenciaNif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localInscricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localInscricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidadeNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localidadeNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstAIAtividades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstAIAtividades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "areaInteresseAtividades"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstAIRecursos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstAIRecursos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "areaInteresseRecursos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstContactos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstContactos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "contacto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstDocsFI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstDocsFI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "myDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstDocumentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstDocumentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "myDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstEntidadesRelacionadas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstEntidadesRelacionadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "entidadeRelacionada"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstMoradas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstMoradas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "morada"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstRecursosOrganizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstRecursosOrganizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "recursoOrganizacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstRefExternas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstRefExternas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cmaRepos/", "referenciaExterna"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moradaPrincipalStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moradaPrincipalStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIPC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NIPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUSNS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUSNS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacionalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturezaEntidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naturezaEntidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("niss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "niss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelConfiancaRegisto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelConfiancaRegisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelDetalheRegisto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelDetalheRegisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelEscolaridade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelEscolaridade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelOrganizacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelOrganizacional"));
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
        elemField.setFieldName("nomeEntidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeEntidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeMae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomePai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasManutencaoRegisto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasManutencaoRegisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numBiblioteca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numBiblioteca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEleitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numEleitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroIdentificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objetoAtividade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objetoAtividade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outroContacto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outroContacto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisNacionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisNacionalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisNaturalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisNaturalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentagemParticipCM_CapSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentagemParticipCM_CapSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preInscricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preInscricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receberBoletimMunicipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receberBoletimMunicipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regrasConvencoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regrasConvencoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selese");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDividas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDividas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEmpBib");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoEmpBib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIdentificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUtilizBib");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoUtilizBib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUtilizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoUtilizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtEstudante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txtEstudante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilidadePublica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utilidadePublica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParticipCM_CapSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorParticipCM_CapSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_Id"));
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
