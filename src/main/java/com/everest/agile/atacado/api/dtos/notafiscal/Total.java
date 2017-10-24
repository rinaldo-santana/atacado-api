package com.everest.agile.atacado.api.dtos.notafiscal;

import java.math.BigDecimal;

public class Total {
	
	private BigDecimal valorBaseCalculoICMS;
	private BigDecimal valorICMS;
	private BigDecimal valorBaseCalculoST;
	private BigDecimal valorST;
	private BigDecimal valorProdutos;
	private BigDecimal valorFrete;
	private BigDecimal valorSeguro;
	private BigDecimal valorDesconto;
	private BigDecimal valorIPI;
	private BigDecimal valorPIS;
	private BigDecimal valorCOFINS;
	private BigDecimal valorOutros;
	private BigDecimal valorNotaFiscal;
	private BigDecimal valorTotalTributos;
	
	public Total() {

	}

	public BigDecimal getValorBaseCalculoICMS() {
		return valorBaseCalculoICMS;
	}

	public void setValorBaseCalculoICMS(BigDecimal valorBaseCalculoICMS) {
		this.valorBaseCalculoICMS = valorBaseCalculoICMS;
	}

	public BigDecimal getValorICMS() {
		return valorICMS;
	}

	public void setValorICMS(BigDecimal valorICMS) {
		this.valorICMS = valorICMS;
	}

	public BigDecimal getValorBaseCalculoST() {
		return valorBaseCalculoST;
	}

	public void setValorBaseCalculoST(BigDecimal valorBaseCalculoST) {
		this.valorBaseCalculoST = valorBaseCalculoST;
	}

	public BigDecimal getValorST() {
		return valorST;
	}

	public void setValorST(BigDecimal valorST) {
		this.valorST = valorST;
	}

	public BigDecimal getValorProdutos() {
		return valorProdutos;
	}

	public void setValorProdutos(BigDecimal valorProdutos) {
		this.valorProdutos = valorProdutos;
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

	public BigDecimal getValorIPI() {
		return valorIPI;
	}

	public void setValorIPI(BigDecimal valorIPI) {
		this.valorIPI = valorIPI;
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

	public BigDecimal getValorOutros() {
		return valorOutros;
	}

	public void setValorOutros(BigDecimal valorOutros) {
		this.valorOutros = valorOutros;
	}

	public BigDecimal getValorNotaFiscal() {
		return valorNotaFiscal;
	}

	public void setValorNotaFiscal(BigDecimal valorNotaFiscal) {
		this.valorNotaFiscal = valorNotaFiscal;
	}

	public BigDecimal getValorTotalTributos() {
		return valorTotalTributos;
	}

	public void setValorTotalTributos(BigDecimal valorTotalTributos) {
		this.valorTotalTributos = valorTotalTributos;
	}

	
}
