package com.everest.agile.atacado.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BAIRROS")
public class Bairro {
	
	@Id
	@Column(name = "bairro_codigo")
	private Long codigo;
	
	@Column(name = "bairro_descricao")
	private String descricao;

	
	public Bairro() {

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
	
	
}
