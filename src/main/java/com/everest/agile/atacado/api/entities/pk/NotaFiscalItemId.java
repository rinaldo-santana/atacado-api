package com.everest.agile.atacado.api.entities.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

import com.everest.agile.atacado.api.entities.Empresa;

@Embeddable
public class NotaFiscalItemId implements Serializable {
	
	private static final long serialVersionUID = 3172689659087698285L;

	@NaturalId
	@Column(name = "nfei_nfe")
	private Long nota;
	
	@NaturalId
	@Column(name = "nfei_serie" )
	private String serie;

	@NaturalId
	@Column(name = "nfei_modelo")
	private String modelo;
	
	@NaturalId
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nfei_empresa")
	private Empresa empresa;
//

	public NotaFiscalItemId() {

	}

	public Long getNota() {
		return nota;
	}

	public void setNota(Long nota) {
		this.nota = nota;
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
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
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
		NotaFiscalItemId other = (NotaFiscalItemId) obj;
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
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
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
		return "NotaFiscalItemId [nota=" + nota + ", serie=" + serie + ", modelo=" + modelo + ", empresa=" + empresa
				+ "]";
	}


}
