package com.everest.agile.atacado.api.dtos.notafiscal;

import java.math.BigDecimal;

public class PisCofins {
	
	private String cst;
	private BigDecimal baseCalculo;
	private BigDecimal aliquota;
	private BigDecimal valor;
	
	public PisCofins() {

	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
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

	public BigDecimal getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(BigDecimal baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	
	
	@Override
	public String toString() {
		return "PisCofins [cst=" + cst + ", baseCalculo=" + baseCalculo + ", aliquota=" + aliquota + ", valor=" + valor
				+ "]";
	}

	
	
}
