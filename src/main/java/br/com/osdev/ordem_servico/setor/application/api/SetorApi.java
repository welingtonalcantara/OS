package br.com.osdev.ordem_servico.setor.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/setor")
public interface SetorApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	SetorResponse criaSetor(@Valid @RequestBody SetorRequest setorRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK) 
	List<SetorListResponse> getTodosSetores();	
	
	@GetMapping(value = "{idSetor}")	 
	@ResponseStatus(code = HttpStatus.OK) 
	SetorResponse buscaSetorAtravesId(@PathVariable UUID idSetor);	 
	
	@DeleteMapping(value = "/{idSetor}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaSetorAtravesId(@PathVariable UUID idSetor);	
	
	@PatchMapping(value = "/{idSetor}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaSetor(@PathVariable UUID idSetor,
			@Valid @RequestBody SetorRequest setorRequest);	
}