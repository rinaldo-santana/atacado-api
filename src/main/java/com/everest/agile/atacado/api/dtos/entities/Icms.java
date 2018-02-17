package com.everest.agile.atacado.api.dtos.entities;

import java.math.BigDecimal;

public class Icms {
	
	private String cst;
	private String origem;
	
	private BigDecimal baseCalculo;
	private BigDecimal aliquota;
	private BigDecimal valor;
	private BigDecimal percentualReducaoBaseCalculo;
	
	private BigDecimal mvaST;
	private BigDecimal baseCalculoST;
	private BigDecimal aliquotaST;
	private BigDecimal valorST;
	private BigDecimal percentualReducaoBaseCalculoST;
	
	
	public Icms() {

	}


	public String getCst() {
		return cst;
	}


	public void setCst(String cst) {
		this.cst = cst;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}


	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}


	public BigDecimal getAliquota() {
		return aliquota;
	}


	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public BigDecimal getPercentualReducaoBaseCalculo() {
		return percentualReducaoBaseCalculo;
	}


	public void setPercentualReducaoBaseCalculo(BigDecimal percentualReducaoBaseCalculo) {
		this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
	}


	public BigDecimal getMvaST() {
		return mvaST;
	}


	public void setMvaST(BigDecimal mvaST) {
		this.mvaST = mvaST;
	}


	public BigDecimal getBaseCalculoST() {
		return baseCalculoST;
	}


	public void setBaseCalculoST(BigDecimal baseCalculoST) {
		this.baseCalculoST = baseCalculoST;
	}


	public BigDecimal getAliquotaST() {
		return aliquotaST;
	}


	public void setAliquotaST(BigDecimal aliquotaST) {
		this.aliquotaST = aliquotaST;
	}


	public BigDecimal getValorST() {
		return valorST;
	}


	public void setValorST(BigDecimal valorST) {
		this.valorST = valorST;
	}


	public BigDecimal getPercentualReducaoBaseCalculoST() {
		return percentualReducaoBaseCalculoST;
	}


	public void setPercentualReducaoBaseCalculoST(BigDecimal percentualReducaoBaseCalculoST) {
		this.percentualReducaoBaseCalculoST = percentualReducaoBaseCalculoST;
	}
	
	
}

