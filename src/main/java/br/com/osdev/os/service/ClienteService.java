package br.com.osdev.os.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.osdev.os.domain.Cliente;
import br.com.osdev.os.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor	
public class ClienteService {
	private final ClienteRepository repository;

	public void criaCliente(Cliente cliente) {		
		repository.save(cliente);
	}

	public Cliente buscaClientePorNome(String nomeCompleto) {	
		return repository.findByNomeCompleto(nomeCompleto);
	}

	public Cliente buscaClientePorCpf(String cpf) {
		return repository.findByCpf(cpf);
	}

	public void atualizaCliente(UUID idCliente, Cliente cliente) {
		repository.findById(idCliente);
		log.info("[idCliente] {}", idCliente);
		repository.save(cliente);
	}

}
