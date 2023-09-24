package br.com.osdev.os.service;

import java.util.List;
import java.util.UUID;

import br.com.osdev.os.controller.SetorListResponse;
import br.com.osdev.os.controller.SetorRequest;
import br.com.osdev.os.controller.SetorResponse;

public interface SetorService {
	SetorResponse criaSetor(SetorRequest setorRequest);
	List<SetorListResponse> buscaTodosSetores();
	SetorResponse buscaSetorAtravesId(UUID idSetor);	
}
