package br.com.osdev.os.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.osdev.os.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
	Cliente findByNomeCompleto(String nomeCompleto);
	Cliente findByCpf(String cpf);
}
