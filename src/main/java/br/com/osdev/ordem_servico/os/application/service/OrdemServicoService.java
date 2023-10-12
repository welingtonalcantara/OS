package br.com.osdev.ordem_servico.os.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.ordem_servico.os.application.api.OrdemServicoRequest;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoResponse;

public interface OrdemServicoService {
	OrdemServicoResponse criaOS(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest);
}
