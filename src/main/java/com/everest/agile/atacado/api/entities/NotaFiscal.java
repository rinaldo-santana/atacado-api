package com.everest.agile.atacado.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.everest.agile.atacado.api.entities.pk.NotaFiscalId;

@Entity
@Table(name = "NFE")
public class NotaFiscal implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NotaFiscalId id;
	
	@Column(name = "nfe_datamovimento")
	private Date dataMovimento;
	
	@Column(name = "nfe_dataemissao")
	private Date dataEmissao;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nfe_natoper")
	private NaturezaOperacao operacao;

	@Column(name = "nfe_forpag")
	private String formaPagamento;
	
	@Column(name = "nfe_tipo")
	private String tipo;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nfe_destinatario")
	private Cliente destinatario;
	
	@Column(name="nfe_bassub")
	private BigDecimal baseIcmsSubstituto;
	
	@Column(name="nfe_icmssub")
	private BigDecimal valorIcmsSubstituto;
	
	@Column(name="nfe_basecalculo")
	private BigDecimal baseCalculoIcms;
	
	@Column(name="nfe_icms")
	private BigDecimal valorIcms;
	
	@Column(name = "nfe_totalprodutos")
	private BigDecimal totalProdutos;
	
	@Column(name = "nfe_carga")
	private Integer carga;
	
	@Column(name = "nfe_frete")
	private BigDecimal valorFrete;
	
	@Column(name = "nfe_seguro")
	private BigDecimal valorSeguro;
	
	@Column(name = "nfe_desconto")
	private BigDecimal valorDesconto;
	
	@Column(name = "nfe_despacess")
	private BigDecimal valorDespesaAcessoria;
	
	@Column(name = "nfe_pistotal")
	private BigDecimal valorPIS;
	
	@Column(name = "nfe_cofinstotal")
	private BigDecimal valorCOFINS;	
	
	@Column(name = "nfe_ipitotal")
	private BigDecimal valorIPI;	
	
	@Column(name = "nfe_valorcontabil")
	private BigDecimal valorContabil;	
	
	@Column(name = "nfe_dadosadicionais")
	private String dadosAdicionais;	

	@Column(name = "nfe_infoadicional")
	private String informacaoAdicionais;	
	
	@Column(name = "nfe_nfeid")
	private String chaveEletronica;	
	
	@Column(name = "nfe_pedido")
	private Integer pedido;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="id")
	private List<NotaFiscalItem> items;
	

	public NotaFiscal() {

	}
	
	
	public NotaFiscalId getId() {
		return id;
	}

	public void setId(NotaFiscalId id) {
		this.id = id;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public NaturezaOperacao getOperacao() {
		return operacao;
	}

	public void setOperacao(NaturezaOperacao operacao) {
		this.operacao = operacao;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}

	public BigDecimal getBaseIcmsSubstituto() {
		return baseIcmsSubstituto;
	}

	public void setBaseIcmsSubstituto(BigDecimal baseIcmsSubstituto) {
		this.baseIcmsSubstituto = baseIcmsSubstituto;
	}

	public BigDecimal getValorIcmsSubstituto() {
		return valorIcmsSubstituto;
	}

	public void setValorIcmsSubstituto(BigDecimal valorIcmsSubstituto) {
		this.valorIcmsSubstituto = valorIcmsSubstituto;
	}

	public BigDecimal getBaseCalculoIcms() {
		return baseCalculoIcms;
	}

	public void setBaseCalculoIcms(BigDecimal baseCalculoIcms) {
		this.baseCalculoIcms = baseCalculoIcms;
	}

	public BigDecimal getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public BigDecimal getTotalProdutos() {
		return totalProdutos;
	}

	public void setTotalProdutos(BigDecimal totalProdutos) {
		this.totalProdutos = totalProdutos;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(BigDecimal valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorDespesaAcessoria() {
		return valorDespesaAcessoria;
	}

	public void setValorDespesaAcessoria(BigDecimal valorDespesaAcessoria) {
		this.valorDespesaAcessoria = valorDespesaAcessoria;
	}

	public BigDecimal getValorPIS() {
		return valorPIS;
	}

	public void setValorPIS(BigDecimal valorPIS) {
		this.valorPIS = valorPIS;
	}

	public BigDecimal getValorCOFINS() {
		return valorCOFINS;
	}

	public void setValorCOFINS(BigDecimal valorCOFINS) {
		this.valorCOFINS = valorCOFINS;
	}

	public BigDecimal getValorIPI() {
		return valorIPI;
	}

	public void setValorIPI(BigDecimal valorIPI) {
		this.valorIPI = valorIPI;
	}

	public BigDecimal getValorContabil() {
		return valorContabil;
	}

	public void setValorContabil(BigDecimal valorContabil) {
		this.valorContabil = valorContabil;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public String getInformacaoAdicionais() {
		return informacaoAdicionais;
	}

	public void setInformacaoAdicionais(String informacaoAdicionais) {
		this.informacaoAdicionais = informacaoAdicionais;
	}

	public String getChaveEletronica() {
		return chaveEletronica;
	}

	public void setChaveEletronica(String chaveEletronica) {
		this.chaveEletronica = chaveEletronica;
	}

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public List<NotaFiscalItem> getItems() {
		return items;
	}

	public void setItems(List<NotaFiscalItem> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NotaFiscal [id=" + id + ", dataMovimento=" + dataMovimento + ", dataEmissao=" + dataEmissao
				+ ", operacao=" + operacao + ", formaPagamento=" + formaPagamento + ", tipo=" + tipo + ", destinatario="
				+ destinatario + ", baseIcmsSubstituto=" + baseIcmsSubstituto + ", valorIcmsSubstituto="
				+ valorIcmsSubstituto + ", baseCalculoIcms=" + baseCalculoIcms + ", valorIcms=" + valorIcms
				+ ", totalProdutos=" + totalProdutos + ", carga=" + carga + ", valorFrete=" + valorFrete
				+ ", valorSeguro=" + valorSeguro + ", valorDesconto=" + valorDesconto + ", valorDespesaAcessoria="
				+ valorDespesaAcessoria + ", valorPIS=" + valorPIS + ", valorCOFINS=" + valorCOFINS + ", valorIPI="
				+ valorIPI + ", valorContabil=" + valorContabil + ", dadosAdicionais=" + dadosAdicionais
				+ ", informacaoAdicionais=" + informacaoAdicionais + ", chaveEletronica=" + chaveEletronica
				+ ", pedido=" + pedido + ", items=" + items + "]";
	}
	
}
