package br.com.osdev.ordem_servico.os.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.ordem_servico.os.application.api.OrdemServicoDetalhadaResponse;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoRequest;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoResponse;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoSetorListResponse;

public interface OrdemServicoService {
	OrdemServicoResponse criaOS(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest);
	List<OrdemServicoSetorListResponse> buscaOrdemServicoSetor(UUID idUsuario, UUID idSetor);
	OrdemServicoDetalhadaResponse buscaOrdemServicoComId(UUID idUsuario, UUID idOrdemServico, UUID idSetor);	
}
