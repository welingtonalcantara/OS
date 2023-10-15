package br.com.osdev.ordem_servico.os.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/usuario/{idUsuario}/ordemservico")
public interface OrdemServicoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	OrdemServicoResponse criaOrdemServico(@PathVariable UUID idUsuario,
			@Valid @RequestBody OrdemServicoRequest ordemServicoRequest);
	
	@GetMapping(value = "/setor/{idSetor}")
	@ResponseStatus(code = HttpStatus.OK) 
	List<OrdemServicoSetorListResponse> getOrdemServicoPorSetorUsuario(@PathVariable UUID idUsuario, @PathVariable UUID idSetor);	
	
	@GetMapping(value = "/{idOrdemServico}/setor/{idSetor}")
	@ResponseStatus(code = HttpStatus.OK)
	OrdemServicoDetalhadaResponse getOrdemServicoComId (@PathVariable UUID idUsuario, @PathVariable UUID idOrdemServico, @PathVariable UUID idSetor);
	
	
	
}
