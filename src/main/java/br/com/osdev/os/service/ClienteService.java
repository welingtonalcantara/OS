package br.com.osdev.os.service;

import org.springframework.stereotype.Service;

import br.com.osdev.os.domain.Cliente;
import br.com.osdev.os.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
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

}
