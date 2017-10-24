package com.everest.agile.atacado.api.dtos.notafiscal;

public class Emitente {
	
	private String cnpj;
	private String nome;
	private Endereco endereco;
	private String inscricaoEstadual;
	
	public Emitente() {
		
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}


	@Override
	public String toString() {
		return "Emitente [cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", inscricaoEstadual="
				+ inscricaoEstadual + "]";
	}
	
	
}
