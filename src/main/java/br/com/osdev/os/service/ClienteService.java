package br.com.osdev.os.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.osdev.os.controller.ClienteRequest;
import br.com.osdev.os.controller.ClienteResponse;
import br.com.osdev.os.domain.Cliente;
import br.com.osdev.os.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor	
public class ClienteService {
	private final ClienteRepository repository;

	public void criaCliente(@Valid ClienteRequest cliente) {	
		// novoCliente = new Cliente(cliente);
		repository.save(new Cliente(cliente));
	}

	public ClienteResponse buscaClientePorNome(String nomeCompleto) {			
		return new ClienteResponse(repository.findByNomeCompleto(nomeCompleto));
	}

	public Cliente buscaClientePorCpf(String cpf) {
		return repository.findByCpf(cpf);
	}

	public void atualizaCliente(UUID idCliente, Cliente cliente) {
		repository.findById(idCliente);
		log.info("[idCliente] {}", idCliente);
		repository.save(cliente);
	}

	public void deletaCliente(UUID idCliente) {
		repository.findById(idCliente);
		log.info("[idCliente] {}", idCliente);
		repository.deleteById(idCliente);
		
	}

}
