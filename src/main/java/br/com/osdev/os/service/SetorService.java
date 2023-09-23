package br.com.osdev.os.service;

import br.com.osdev.os.controller.SetorRequest;
import br.com.osdev.os.controller.SetorResponse;

public interface SetorService {
	SetorResponse criaSetor(SetorRequest setorRequest);
}
