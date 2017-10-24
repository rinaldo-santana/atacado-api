package com.everest.agile.atacado.api.entities.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.everest.agile.atacado.api.entities.Empresa;

@Embeddable
public class NotaFiscalId implements Serializable {

	private static final long serialVersionUID = -6033364229738276830L;
	
	@Column(name = "NFE_NOTAFISCAL" )
	private Long numero;
	
	@Column(name = "NFE_SERIE")
	private String serie;
	
	@Column(name = "NFE_MODELO")	
	private String modelo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nfe_empresa")
	private Empresa empresa;
	
	public NotaFiscalId() {

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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		NotaFiscalId other = (NotaFiscalId) obj;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
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
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NotaFiscalId [numero=" + numero + ", serie=" + serie + ", modelo=" + modelo + ", empresa=" + empresa
				+ "]";
	}

	
}
