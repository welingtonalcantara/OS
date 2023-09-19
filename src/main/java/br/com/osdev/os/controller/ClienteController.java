package br.com.osdev.os.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.os.domain.Cliente;
import br.com.osdev.os.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteApi{
	
	private final ClienteService service;

	public void criaCliente(@Valid @RequestBody ClienteRequest cliente) {
		service.criaCliente(cliente);
	}	

	public ClienteResponse buscaClientePorNome(@PathVariable String nomeCompleto) {
		return service.buscaClientePorNome(nomeCompleto);
	}	

	public Cliente buscaClientePorCpf(@PathVariable String cpf) {
		return service.buscaClientePorCpf(cpf);
	}

	public void atualizaCliente(@PathVariable UUID idCliente, @Valid @RequestBody Cliente cliente) {
		service.atualizaCliente(idCliente, cliente);
	}	

	public void deletaCliente(@PathVariable UUID idCliente) {
		service.deletaCliente(idCliente);
	}
}
