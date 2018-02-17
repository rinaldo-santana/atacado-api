package com.everest.agile.atacado.api.dtos.entities;

public class Detalhe {
	
	private Produto produto;
	private Imposto imposto;
	
	public Detalhe() {

	}

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	
	

}
