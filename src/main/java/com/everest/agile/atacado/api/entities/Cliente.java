package com.everest.agile.atacado.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
	
	@Column(name = "cli_codigo")
	private Long codigo;
	
	@Id
	@Column(name = "cli_doc01")
	private String cnpj;
	
	@Column(name = "cli_doc02")
	private String inscricaoEstadual;
	
	@Column(name = "cli_razao")
	private String razaoSocial;
	
	@Column(name = "cli_fantasia")
	private String nomeFantasia;
	
	@Column(name = "cli_logradouro")
	private String logradouro;
	
	@Column(name = "cli_nro")
	private String numero;

	@Column(name = "cli_cep")
	private String cep;		
	
	@Column(name = "cli_ddd")
	private String ddd;
	
	@Column(name = "cli_telefone")
	private String telefone;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cli_cidade")
	private Cidade cidade;	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cli_bairro")	
	private Bairro bairro;
	

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}	
	
	@Transient
	public String getTelefone(){
		return this.ddd + this.telefone;
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
		Cliente other = (Cliente) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	

	
}
