package br.com.osdev.os.service;

import java.util.List;

import br.com.osdev.os.controller.SetorListResponse;
import br.com.osdev.os.controller.SetorRequest;
import br.com.osdev.os.controller.SetorResponse;

public interface SetorService {
	SetorResponse criaSetor(SetorRequest setorRequest);
	List<SetorListResponse> buscaTodosSetores();
}
