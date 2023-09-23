package br.com.osdev.os.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/setor")
public interface SetorApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	SetorResponse criaSetor(@Valid @RequestBody SetorRequest setorRequest);
	
//	@GetMapping(value = "/buscanomesetor/{nomeSetor}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public SetorResponse buscaSetorPorNome(@PathVariable String nomeSetor);	
//	
//	 @GetMapping(value = "{idSetor}")	 
//	 @ResponseStatus(code = HttpStatus.OK) 
//	 public SetorResponse buscaSetorAtravesId(@PathVariable UUID idSetor);	 
//	
//	@DeleteMapping(value = "/{idSetor}")
//	@ResponseStatus(code = HttpStatus.ACCEPTED)
//	public void deletaSetor(@PathVariable UUID idSetor);	
//	
//	@PatchMapping(value = "/{idSetor}")
//	@ResponseStatus(code = HttpStatus.NO_CONTENT)
//	public void atualizaSetor(@PathVariable UUID idSetor,
//			@Valid @RequestBody SetorRequest setorRequest);	
}