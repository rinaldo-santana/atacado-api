package com.everest.agile.atacado.api.controllers;

import static com.everest.agile.atacado.api.converters.ConversoresUtils.converteToNotaFiscalDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.everest.agile.atacado.api.dtos.NotaFiscalDTO;
import com.everest.agile.atacado.api.entities.Cliente;
import com.everest.agile.atacado.api.entities.NotaFiscal;
import com.everest.agile.atacado.api.entities.pk.NotaFiscalId;
import com.everest.agile.atacado.api.repositories.NotaFiscalRepository;
import com.everest.agile.atacado.api.response.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@CrossOrigin("*")
public class SearchController {

	@Autowired
	private NotaFiscalRepository notaFiscalRepository;
	
	
	@GetMapping
	public List<NotaFiscal> todas() {
		return notaFiscalRepository.findAll();
	}	
	

	/**
	 * http://localhost:8080/search/notasfiscais/count
	 * 
	 */
	@GetMapping("/notasfiscais/count")
	public ResponseEntity<Response<Long>> quantidadeTotal() {
		Response<Long> response = new Response<Long>();
		Long result = notaFiscalRepository.count();
		
		if (result > 0) {
			response.setDados(result);
		} 
		else
		{
			response.getErros().add("Não há notas fiscais.");
			return ResponseEntity.badRequest().body(response);
		}

		return ResponseEntity.ok(response);
	}
	/**
	 * http://localhost:8080/search/notasfiscais/carga/7238
	 * 
	 */
	@GetMapping("/notasfiscais/carga/{id}")
	public ResponseEntity<Response<List<NotaFiscalDTO>>> buscarPorCarga(
		@PathVariable("id") Integer cargaId){
		
			Response<List<NotaFiscalDTO>> response = new Response<List<NotaFiscalDTO>>();
			
			List<NotaFiscal> notasFiscais = notaFiscalRepository.findByCarga(cargaId);

			if (!(notasFiscais.size() > 0)) {
				response.getErros().add("Não há notas fiscais para a carga " + cargaId.toString());
				return ResponseEntity.badRequest().body(response);
			}
			
			List<NotaFiscalDTO> notasFiscaisDto = new ArrayList<NotaFiscalDTO>(); 
			notasFiscais.forEach( nota -> notasFiscaisDto.add(converteToNotaFiscalDTO(nota)));
			response.setDados(notasFiscaisDto);

			return ResponseEntity.ok(response);		
	}

	/**
	 * Recebe um json que representa a classe NotaFiscalId
	 * http://localhost:8080/search/notasfiscais/id
	 * {"numero":"30326","serie":"1","modelo":"55","empresa": {"codigo":"1"}}
	 * O spring faz o bind atraves do @RequestBody 
	 */
	@PostMapping("/notasfiscais/id") 
	@ResponseBody
	public ResponseEntity<Response<NotaFiscalDTO>> buscarPorId(
		@RequestBody @Valid NotaFiscalId id, BindingResult result) {

			Response<NotaFiscalDTO> response = new Response<NotaFiscalDTO>();

			NotaFiscalDTO notaFiscalDTO =  new NotaFiscalDTO();

			try {
				notaFiscalDTO = converteToNotaFiscalDTO(
					this.notaFiscalRepository.findById(id));				
			} catch (Exception e) {
				result.addError(new ObjectError("notafiscal", e.getMessage()));
			}

			if (notaFiscalDTO == null) {
				result.addError(new ObjectError("notafiscal", "Nota fiscal nao existe."));
			}

			if (result.hasErrors()) {
				result.getAllErrors().forEach(erro -> response.getErros().add(erro.getDefaultMessage()));
				return ResponseEntity.badRequest().body(response);
			}				

			response.setDados(notaFiscalDTO);
			return ResponseEntity.ok(response);
	}

	/**
	 * http://localhost:8080/search/notasfiscais/destinatario/09135797000109
	 * 
	 */
	@GetMapping("/notasfiscais/destinatario/{cnpj}") 
	public ResponseEntity<Response<List<NotaFiscalDTO>>> buscarPorDestinatario(
		@PathVariable("cnpj") String cnpjDestinatario) {

			Response<List<NotaFiscalDTO>> response = new Response<List<NotaFiscalDTO>>();
			
			List<NotaFiscal> notasFiscais = this.notaFiscalRepository
				.findByDestinatario(this.geraCliente(cnpjDestinatario));
			
			if (!(notasFiscais.size() > 0)) {
				response.getErros().add("Não existem notas fiscais para o destinatario " + cnpjDestinatario);
				return ResponseEntity.badRequest().body(response);
			}
			
			List<NotaFiscalDTO> notasFiscaisDtos = new ArrayList<NotaFiscalDTO>();
			notasFiscais.forEach( nota -> { 			
				notasFiscaisDtos.add(converteToNotaFiscalDTO(nota));
			} );

			response.setDados(notasFiscaisDtos);
			return ResponseEntity.ok(response);
	}

	/**
	 * http://localhost:8080/search/notasfiscais/emissao/?inicio=2016/01/26&fim=2016/01/26
	 * 
	 */
	@GetMapping("/notasfiscais/emissao") 
	public ResponseEntity<Response<List<NotaFiscalDTO>>> buscarPorDataEmissaoEntre(
		@RequestParam(value = "inicio") @Valid Date inicio, @RequestParam(value = "fim") @Valid Date fim ) {

			Response<List<NotaFiscalDTO>> response = new Response<List<NotaFiscalDTO>>();
			
			List<NotaFiscal> notasFiscais = this.notaFiscalRepository
				.findByDataEmissaoBetween(inicio, fim);
			

			if (!(notasFiscais.size() > 0)) {
				response.getErros().add("Não existem notas fiscais para data de " 
					+ "emissao entre " + inicio + " e " + fim);
				return ResponseEntity.badRequest().body(response);
			}
			
			List<NotaFiscalDTO> notasFiscaisDtos = new ArrayList<NotaFiscalDTO>();
			notasFiscais.forEach( nota -> { 			
				notasFiscaisDtos.add(converteToNotaFiscalDTO(nota));
			} );

			response.setDados(notasFiscaisDtos);
			return ResponseEntity.ok(response);
	}

	private Cliente geraCliente(String cnpjDestinatario) {
		Cliente cliente = new Cliente();
		cliente.setCnpj(cnpjDestinatario);
		return cliente;
	}		
	
}
