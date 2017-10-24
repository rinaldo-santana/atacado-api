package com.everest.agile.atacado.api.dtos;

import java.util.List;

import com.everest.agile.atacado.api.dtos.notafiscal.Destinatario;
import com.everest.agile.atacado.api.dtos.notafiscal.Detalhe;
import com.everest.agile.atacado.api.dtos.notafiscal.Emitente;
import com.everest.agile.atacado.api.dtos.notafiscal.Identificacao;
import com.everest.agile.atacado.api.dtos.notafiscal.Total;

public class NotaFiscalDTO {

	private Identificacao identificacao;
	private Emitente emitente;
	private Destinatario destinatario;
	private List<Detalhe> detalhes;
	private Total total;
	
	public NotaFiscalDTO() {

	}

	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}

	public Emitente getEmitente() {
		return emitente;
	}

	public void setEmitente(Emitente emitente) {
		this.emitente = emitente;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public List<Detalhe> getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(List<Detalhe> detalhes) {
		this.detalhes = detalhes;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacao == null) ? 0 : identificacao.hashCode());
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
		NotaFiscalDTO other = (NotaFiscalDTO) obj;
		if (identificacao == null) {
			if (other.identificacao != null)
				return false;
		} else if (!identificacao.equals(other.identificacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NotaFiscalDTO [identificacao=" + identificacao + ", emitente=" + emitente + ", destinatario="
				+ destinatario + ", detalhes=" + detalhes + ", total=" + total + "]";
	}
	

}
