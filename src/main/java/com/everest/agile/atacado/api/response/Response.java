package com.everest.agile.atacado.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private T dados;
	private List<String> erros;
	
	
	public Response() {

	}

	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public List<String> getErros() {
		if (this.erros == null) {
			this.erros = new ArrayList<String>();
		}
		return this.erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
}
