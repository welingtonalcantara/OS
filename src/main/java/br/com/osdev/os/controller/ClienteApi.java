package br.com.osdev.os.controller;

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

import br.com.osdev.os.domain.Cliente;

@RequestMapping("/v1/cliente")
public interface ClienteApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void criaCliente(@Valid @RequestBody ClienteRequest cliente);
	
	@GetMapping(value = "/buscanome/{nomeCompleto}")
	@ResponseStatus(code = HttpStatus.OK)
	public ClienteResponse buscaClientePorNome(@PathVariable String nomeCompleto);
	
	@GetMapping(value = "/buscacpf/{cpf}")
	@ResponseStatus(code = HttpStatus.OK)
	public Cliente buscaClientePorCpf(@PathVariable String cpf);
	
	@PatchMapping(value = "/{idCliente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void atualizaCliente(@PathVariable UUID idCliente, @Valid @RequestBody Cliente cliente);	
	
	@DeleteMapping(value = "/{idCliente}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void deletaCliente(@PathVariable UUID idCliente);
}
