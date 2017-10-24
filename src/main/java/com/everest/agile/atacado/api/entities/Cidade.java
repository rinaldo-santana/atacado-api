package com.everest.agile.atacado.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIDADES")
public class Cidade {
	
	@Id
	@Column(name = "cidade_codigo")
	private Long codigo;
	
	@Column(name = "cidade_descricao")
	private String descricao;	
	
	@Column(name = "cidade_uf")
	private String uf;		
		
	@Column(name = "cidade_codmunicipio")
	private String codigoMunicipio; 
	
	@Column(name = "cidade_codpais")
	private String codigoPais;	
	
	@Column(name = "cidade_pais")
	private String nomePais; 		

	public Cidade() {

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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	
	
}
