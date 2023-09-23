package br.com.osdev.os.repository;

import java.util.List;

import br.com.osdev.os.domain.Setor;

public interface SetorRepository {
	Setor salva(Setor setor);
	List<Setor> buscaTodosSetores();
}
