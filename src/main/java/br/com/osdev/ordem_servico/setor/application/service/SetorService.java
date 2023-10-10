package br.com.osdev.ordem_servico.setor.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.ordem_servico.setor.application.api.SetorListResponse;
import br.com.osdev.ordem_servico.setor.application.api.SetorRequest;
import br.com.osdev.ordem_servico.setor.application.api.SetorResponse;

public interface SetorService {
	SetorResponse criaSetor(SetorRequest setorRequest);
	List<SetorListResponse> buscaTodosSetores();
	SetorResponse buscaSetorAtravesId(UUID idSetor);
	void deletaSetorAtravesId(UUID idSetor);
	void atualizaSetor(UUID idSetor, @Valid SetorRequest setorRequest);
}
