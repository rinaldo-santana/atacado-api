package com.everest.agile.atacado.api.resources;

import static com.everest.agile.atacado.api.converters.ConversoresUtils.converteToNotaFiscalDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everest.agile.atacado.api.dtos.NotaFiscalDTO;
import com.everest.agile.atacado.api.entities.NotaFiscal;
import com.everest.agile.atacado.api.repositories.NotaFiscalRepository;

@RestController
@RequestMapping("/notasfiscais")
public class NotaFiscalResource {

	
	@Autowired
	private NotaFiscalRepository notaFiscalRepository;
	
	
	@GetMapping
	public List<NotaFiscal> todas() {
		return notaFiscalRepository.findAll();
	}	
	
	@GetMapping("/count")
	public Long quantidadeTotal(){
		return notaFiscalRepository.count();
	}
	
	@GetMapping("/carga/{id}")
	public List<NotaFiscalDTO> todasPorCarga(@PathVariable("id") Integer cargaId){
			
		List<NotaFiscal> notasFiscais = notaFiscalRepository.findByCarga(cargaId);
		
		List<NotaFiscalDTO> notasFiscaisDto = new ArrayList<NotaFiscalDTO>(); 
		
//		notasFiscais.forEach( nota -> notasFiscaisDto.add(converterNotaParaDto(nota)));
		
		notasFiscais.forEach( nota -> notasFiscaisDto.add(converteToNotaFiscalDTO(nota)));		
		
		return notasFiscaisDto; 
	}


	@GetMapping("/carga/{id}/count")
	public Integer totalNotasPorCarga(@PathVariable Integer id){
//		return notaFiscalRepository.findByCarga(id).size();
		return notaFiscalRepository.countByCarga(id);
	}
	
//	private NotaFiscalDto converterNotaParaDto(NotaFiscal nota) {
//
//		NotaFiscalDto notaDto = new NotaFiscalDto();
//		notaDto.setEmpresa(nota.getId().getEmpresa());
//		notaDto.setModelo(nota.getId().getModelo());
//		notaDto.setNumero(nota.getId().getNumero());
//		notaDto.setSerie(nota.getId().getSerie());
//		notaDto.setValorContabil(nota.getValorContabil());
//		notaDto.setValorProdutos(nota.getTotalProdutos());
//		notaDto.setCarga(nota.getCarga());
//		return notaDto;
//	}
}
