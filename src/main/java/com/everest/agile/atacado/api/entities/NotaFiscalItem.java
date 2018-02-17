package com.everest.agile.atacado.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.everest.agile.atacado.api.entities.pk.NotaFiscalItemId;

@Entity
@Table(name = "NFEITENS")
public class NotaFiscalItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Embedded
	private NotaFiscalItemId  id;

	@Id	
	@ManyToOne
	@JoinColumn(name = "nfei_produto",  foreignKey =@ForeignKey(name = "NFEITENS_PRODUTOS_FK"))
	private Produtos produto;		

	@Id	
	@Column(name = "nfei_item")
	private Integer item;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nfei_embcodigo")
	private Embalagem embalagem ;
	
	@Column(name = "nfei_qtd")
	private BigDecimal quantidade;
	
	@Column(name = "nfei_preco")
	private BigDecimal valorUnitario;
	
	@Column(name = "nfei_cfop")
	private String cfop;
	
	@Column(name = "nfei_class_cst")
	private String cst;

	@Column(name = "nfei_class_origem")
	private Integer origemMercadoria;	
	
	@Column(name = "nfei_class_cstmod")
	private Integer modalidadeICMS;
	
	@Column(name = "nfei_class_cstbase")
	private BigDecimal baseCalculoICMS;

	@Column(name = "nfei_class_cstaliquota")
	private BigDecimal aliquotaICMS;

	@Column(name = "nfei_class_csticms")
	private BigDecimal valorICMS;

	@Column(name = "nfei_class_reducaoestadual")
	private BigDecimal percentualReducaoBaseCalculo;

	@Column(name = "nfei_basest")
	private BigDecimal baseCalculoIcmsST;

	@Column(name = "nfei_aliquotast")
	private BigDecimal aliquotaIcmsST;

	@Column(name = "nfei_icmsst")
	private BigDecimal valorIcmsST;	
	
	@Column(name = "nfei_stmva")
	private BigDecimal margemValorAgregadoST;		
	
	@Column(name = "nfei_desconto")
	private BigDecimal valorDesconto;
	
	@Column(name = "nfei_outrasdesp")
	private BigDecimal valorOutrasDespesas;	
	
	
	@Column(name = "nfei_ipi_cst")
	private String cstIPI;	
	
	@Column(name = "nfei_ipi_aliquota")
	private BigDecimal aliquotaIPI;
	
	@Column(name = "nfei_ipi_basecalculo")
	private BigDecimal baseCalculoIPI;

	@Column(name = "nfei_ipi_valor")
	private BigDecimal valorIPI;	
	

	@Column(name = "nfei_pis_cst")
	private String cstPIS;	
	
	@Column(name = "nfei_pis_aliquota")
	private BigDecimal aliquotaPIS;	
	
	@Column(name = "nfei_pis_basecalculo")
	private BigDecimal baseCalculoPIS;	
	
	@Column(name = "nfei_pis_valor")
	private BigDecimal valorPIS;	
	
		
	@Column(name = "nfei_cofins_cst")
	private String cstCOFINS;	
	
	@Column(name = "nfei_cofins_aliquota")
	private BigDecimal aliquotaCOFINS;	
	
	@Column(name = "nfei_cofins_basecalculo")
	private BigDecimal baseCalculoCOFINS;	
	
	@Column(name = "nfei_cofins_valor")
	private BigDecimal valorCOFINS;	

	
	
	public NotaFiscalItem() {
		
	}


	@Transient
	public BigDecimal getValorTotal(){
		return this.valorUnitario.multiply(this.quantidade);
	}


	public NotaFiscalItemId getId() {
		return id;
	}


	public void setId(NotaFiscalItemId id) {
		this.id = id;
	}


	public Produtos getProduto() {
		return produto;
	}


	public void setProduto(Produtos produto) {
		this.produto = produto;
	}


	public Integer getItem() {
		return item;
	}


	public void setItem(Integer item) {
		this.item = item;
	}


	public Embalagem getEmbalagem() {
		return embalagem;
	}


	public void setEmbalagem(Embalagem embalagem) {
		this.embalagem = embalagem;
	}


	public BigDecimal getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public String getCfop() {
		return cfop;
	}


	public void setCfop(String cfop) {
		this.cfop = cfop;
	}


	public String getCst() {
		return cst;
	}


	public void setCst(String cst) {
		this.cst = cst;
	}


	public Integer getOrigemMercadoria() {
		return origemMercadoria;
	}


	public void setOrigemMercadoria(Integer origemMercadoria) {
		this.origemMercadoria = origemMercadoria;
	}


	public Integer getModalidadeICMS() {
		return modalidadeICMS;
	}


	public void setModalidadeICMS(Integer modalidadeICMS) {
		this.modalidadeICMS = modalidadeICMS;
	}


	public BigDecimal getBaseCalculoICMS() {
		return baseCalculoICMS;
	}


	public void setBaseCalculoICMS(BigDecimal baseCalculoICMS) {
		this.baseCalculoICMS = baseCalculoICMS;
	}


	public BigDecimal getAliquotaICMS() {
		return aliquotaICMS;
	}


	public void setAliquotaICMS(BigDecimal aliquotaICMS) {
		this.aliquotaICMS = aliquotaICMS;
	}


	public BigDecimal getValorICMS() {
		return valorICMS;
	}


	public void setValorICMS(BigDecimal valorICMS) {
		this.valorICMS = valorICMS;
	}


	public BigDecimal getPercentualReducaoBaseCalculo() {
		return percentualReducaoBaseCalculo;
	}


	public void setPercentualReducaoBaseCalculo(BigDecimal percentualReducaoBaseCalculo) {
		this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
	}


	public BigDecimal getBaseCalculoIcmsST() {
		return baseCalculoIcmsST;
	}


	public void setBaseCalculoIcmsST(BigDecimal baseCalculoIcmsST) {
		this.baseCalculoIcmsST = baseCalculoIcmsST;
	}


	public BigDecimal getAliquotaIcmsST() {
		return aliquotaIcmsST;
	}


	public void setAliquotaIcmsST(BigDecimal aliquotaIcmsST) {
		this.aliquotaIcmsST = aliquotaIcmsST;
	}


	public BigDecimal getValorIcmsST() {
		return valorIcmsST;
	}


	public void setValorIcmsST(BigDecimal valorIcmsST) {
		this.valorIcmsST = valorIcmsST;
	}


	public BigDecimal getMargemValorAgregadoST() {
		return margemValorAgregadoST;
	}


	public void setMargemValorAgregadoST(BigDecimal margemValorAgregadoST) {
		this.margemValorAgregadoST = margemValorAgregadoST;
	}


	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}


	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}


	public BigDecimal getValorOutrasDespesas() {
		return valorOutrasDespesas;
	}


	public void setValorOutrasDespesas(BigDecimal valorOutrasDespesas) {
		this.valorOutrasDespesas = valorOutrasDespesas;
	}


	public String getCstIPI() {
		return cstIPI;
	}


	public void setCstIPI(String cstIPI) {
		this.cstIPI = cstIPI;
	}


	public BigDecimal getAliquotaIPI() {
		return aliquotaIPI;
	}


	public void setAliquotaIPI(BigDecimal aliquotaIPI) {
		this.aliquotaIPI = aliquotaIPI;
	}


	public BigDecimal getBaseCalculoIPI() {
		return baseCalculoIPI;
	}


	public void setBaseCalculoIPI(BigDecimal baseCalculoIPI) {
		this.baseCalculoIPI = baseCalculoIPI;
	}


	public BigDecimal getValorIPI() {
		return valorIPI;
	}


	public void setValorIPI(BigDecimal valorIPI) {
		this.valorIPI = valorIPI;
	}


	public String getCstPIS() {
		return cstPIS;
	}


	public void setCstPIS(String cstPIS) {
		this.cstPIS = cstPIS;
	}


	public BigDecimal getAliquotaPIS() {
		return aliquotaPIS;
	}


	public void setAliquotaPIS(BigDecimal aliquotaPIS) {
		this.aliquotaPIS = aliquotaPIS;
	}


	public BigDecimal getBaseCalculoPIS() {
		return baseCalculoPIS;
	}


	public void setBaseCalculoPIS(BigDecimal baseCalculoPIS) {
		this.baseCalculoPIS = baseCalculoPIS;
	}


	public BigDecimal getValorPIS() {
		return valorPIS;
	}


	public void setValorPIS(BigDecimal valorPIS) {
		this.valorPIS = valorPIS;
	}


	public String getCstCOFINS() {
		return cstCOFINS;
	}


	public void setCstCOFINS(String cstCOFINS) {
		this.cstCOFINS = cstCOFINS;
	}


	public BigDecimal getAliquotaCOFINS() {
		return aliquotaCOFINS;
	}


	public void setAliquotaCOFINS(BigDecimal aliquotaCOFINS) {
		this.aliquotaCOFINS = aliquotaCOFINS;
	}


	public BigDecimal getBaseCalculoCOFINS() {
		return baseCalculoCOFINS;
	}


	public void setBaseCalculoCOFINS(BigDecimal baseCalculoCOFINS) {
		this.baseCalculoCOFINS = baseCalculoCOFINS;
	}


	public BigDecimal getValorCOFINS() {
		return valorCOFINS;
	}


	public void setValorCOFINS(BigDecimal valorCOFINS) {
		this.valorCOFINS = valorCOFINS;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		NotaFiscalItem other = (NotaFiscalItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "NotaFiscalItem [id=" + id + ", produto=" + produto + ", item=" + item + ", embalagem=" + embalagem
				+ ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", cfop=" + cfop + ", cst=" + cst
				+ ", origemMercadoria=" + origemMercadoria + ", modalidadeICMS=" + modalidadeICMS + ", baseCalculoICMS="
				+ baseCalculoICMS + ", aliquotaICMS=" + aliquotaICMS + ", valorICMS=" + valorICMS
				+ ", percentualReducaoBaseCalculo=" + percentualReducaoBaseCalculo + ", baseCalculoIcmsST="
				+ baseCalculoIcmsST + ", aliquotaIcmsST=" + aliquotaIcmsST + ", valorIcmsST=" + valorIcmsST
				+ ", margemValorAgregadoST=" + margemValorAgregadoST + ", valorDesconto=" + valorDesconto
				+ ", valorOutrasDespesas=" + valorOutrasDespesas + ", cstIPI=" + cstIPI + ", aliquotaIPI=" + aliquotaIPI
				+ ", baseCalculoIPI=" + baseCalculoIPI + ", valorIPI=" + valorIPI + ", cstPIS=" + cstPIS
				+ ", aliquotaPIS=" + aliquotaPIS + ", baseCalculoPIS=" + baseCalculoPIS + ", valorPIS=" + valorPIS
				+ ", cstCOFINS=" + cstCOFINS + ", aliquotaCOFINS=" + aliquotaCOFINS + ", baseCalculoCOFINS="
				+ baseCalculoCOFINS + ", valorCOFINS=" + valorCOFINS + "]";
	}
	
	
	
}
