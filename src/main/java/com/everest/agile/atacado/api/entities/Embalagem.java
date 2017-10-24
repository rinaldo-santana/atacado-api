package com.everest.agile.atacado.api.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "EMBALAGENS")
public class Embalagem {

	@Id
	@Column(name = "emb_codigo")
	private Long codigo;
	
	@NaturalId
	@ManyToOne()
	@JoinColumn(name = "emb_produto")
	private Produtos produto;
	
	@Column(name = "emb_ean")
	private String ean;
	
	@Column(name = "emb_volume")
	private BigDecimal volume;
	
	@NaturalId
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emb_unidade")
	private Unidade unidade;

	@Column(name = "emb_menorunid")
	private String memorUnidade;
	
	
	public Embalagem() {

	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public Produtos getProduto() {
		return produto;
	}


	public void setProduto(Produtos produto) {
		this.produto = produto;
	}


	public String getEan() {
		return ean;
	}


	public void setEan(String ean) {
		this.ean = ean;
	}


	public BigDecimal getVolume() {
		return volume;
	}


	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}


	public Unidade getUnidade() {
		return unidade;
	}


	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}


	@Transient
	public Boolean isMemorUnidade() {		
		return  "S".equals(this.memorUnidade.toUpperCase()) ? true : false;
	}


	@Override
	public String toString() {
		return "Embalagem [codigo=" + codigo + ", produto=" + produto + ", ean=" + ean + ", volume=" + volume
				+ ", unidade=" + unidade + ", memorUnidade=" + memorUnidade + "]";
	}


	
	
	
	
}
