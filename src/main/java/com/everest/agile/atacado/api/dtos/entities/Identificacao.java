package com.everest.agile.atacado.api.dtos.entities;

import java.util.Date;

public class Identificacao {
	
	private String operacao;
	private String modelo;
	private String serie;
	private Long numero;
	private Date dataEmissao;
	private Date dataMovimento;
	
	public Identificacao() {

	}
	
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataMovimento() {
		return dataMovimento;
	}
	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((dataMovimento == null) ? 0 : dataMovimento.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((operacao == null) ? 0 : operacao.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
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
		Identificacao other = (Identificacao) obj;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (dataMovimento == null) {
			if (other.dataMovimento != null)
				return false;
		} else if (!dataMovimento.equals(other.dataMovimento))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (operacao == null) {
			if (other.operacao != null)
				return false;
		} else if (!operacao.equals(other.operacao))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
	}
	
	


}
