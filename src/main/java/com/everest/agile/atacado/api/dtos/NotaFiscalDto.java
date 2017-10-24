package com.everest.agile.atacado.api.dtos;

import java.math.BigDecimal;

public class NotaFiscalDto {
	
	private Long id;
	private Integer empresa;
	private String modelo;
	private Long numero;
	private String serie;
	private BigDecimal valorProdutos;
	private BigDecimal valorContabil;
	private Integer carga;


	
	public NotaFiscalDto() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

	public Integer getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}	


	public Long getNumero() {
		return numero;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public BigDecimal getValorProdutos() {
		return valorProdutos;
	}


	public void setValorProdutos(BigDecimal valorProdutos) {
		this.valorProdutos = valorProdutos;
	}


	public BigDecimal getValorContabil() {
		return valorContabil;
	}


	public void setValorContabil(BigDecimal valorContabil) {
		this.valorContabil = valorContabil;
	}


	public Integer getCarga() {
		return carga;
	}


	public void setCarga(Integer carga) {
		this.carga = carga;
	}


	@Override
	public String toString() {
		return "NotaFiscalDto [id=" + id + ", empresa=" + empresa + ", numero=" + numero + ", serie=" + serie
				+ ", modelo=" + modelo + ", valorProdutos=" + valorProdutos + ", valorContabil=" + valorContabil
				+ ", carga=" + carga + "]";
	}



	

}
