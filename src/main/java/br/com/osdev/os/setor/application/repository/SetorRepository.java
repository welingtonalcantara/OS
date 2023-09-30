package br.com.osdev.os.setor.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.osdev.os.setor.domain.Setor;

public interface SetorRepository {
	Setor salva(Setor setor);
	List<Setor> buscaTodosSetores();
	Setor buscaSetorAtravesId(UUID idSetor);
	void deletaSetor(Setor setor);	
}
