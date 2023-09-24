package br.com.osdev.os.repository;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.os.controller.SetorRequest;
import br.com.osdev.os.domain.Setor;

public interface SetorRepository {
	Setor salva(Setor setor);
	List<Setor> buscaTodosSetores();
	Setor buscaSetorAtravesId(UUID idSetor);
	void deletaSetor(Setor setor);	
}
