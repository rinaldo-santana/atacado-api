package com.everest.agile.atacado.api.dtos.entities;

import java.math.BigDecimal;

public class Imposto {
	
	private BigDecimal valorTotalTributos;
	private Icms icms;
	private Ipi ipi;
	private PisCofins pis;
	private PisCofins cofins;


	public Imposto() {

	}


	public BigDecimal getValorTotalTributos() {
		return valorTotalTributos;
	}


	public void setValorTotalTributos(BigDecimal valorTotalTributos) {
		this.valorTotalTributos = valorTotalTributos;
	}


	public Icms getIcms() {
		return icms;
	}


	public void setIcms(Icms icms) {
		this.icms = icms;
	}


	public Ipi getIpi() {
		return ipi;
	}


	public void setIpi(Ipi ipi) {
		this.ipi = ipi;
	}


	public PisCofins getPis() {
		return pis;
	}


	public void setPis(PisCofins pis) {
		this.pis = pis;
	}


	public PisCofins getCofins() {
		return cofins;
	}


	public void setCofins(PisCofins cofins) {
		this.cofins = cofins;
	}

	
	
	
}
