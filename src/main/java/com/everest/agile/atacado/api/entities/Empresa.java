package com.everest.agile.atacado.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "FILIAIS")
public class Empresa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fil_codigo")
	private Long codigo;
	
	@Column(name = "fil_descricao")
	private String nome;
	
	@Column(name = "fil_doc01")
	private String cnpj;
	
	@Column(name = "fil_doc02")
	private String inscricaoEstadual;
	
	@Column(name = "fil_endereco")
	private String logradouro;
	
	@Column(name = "fil_nro")
	private String numero;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fil_bairro")
	private Bairro bairro;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fil_cidade")
	private Cidade cidade;
	
	@Column(name = "fil_cep")
	private String cep;
	
	@Column(name = "fil_ddd")
	private String ddd;
	
	@Column(name = "fil_fone")
	private String telefone;
	
	@Transient
	public String getTelefone(){
		return this.ddd + this.telefone;
	}
	
	public Empresa() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", nome=" + nome + ", cnpj=" + cnpj + ", inscricaoEstadual="
				+ inscricaoEstadual + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", cep=" + cep + ", ddd=" + ddd + ", telefone=" + telefone + "]";
	}
	


}
