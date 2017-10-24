package com.everest.agile.atacado.api.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTOS")
public class Produtos {

	@Id
	@Column(name = "produto_codigo")
	private Long codigo;
	
	@Column(name = "produto_descricao")
	private String descricao;
	
	@Column(name = "produto_ncm")
	private String ncm;
	
	@Column(name = "produto_cest")
	private String cest;
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<Embalagem> embalagems;
	
	public Produtos() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public List<Embalagem> getEmbalagems() {
		return embalagems;
	}

	public void setEmbalagems(List<Embalagem> embalagems) {
		this.embalagems = embalagems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Produtos other = (Produtos) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", descricao=" + descricao + ", ncm=" + ncm + ", cest=" + cest
				+ ", embalagems=" + embalagems + "]";
	}
	

	

}
