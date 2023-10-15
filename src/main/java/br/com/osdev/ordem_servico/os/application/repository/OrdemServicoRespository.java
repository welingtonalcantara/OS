package br.com.osdev.ordem_servico.os.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;

public interface OrdemServicoRespository {
	OrdemServico salvaOrdemServico(OrdemServico ordemServico);
	List<OrdemServico> buscaOrdemServicoSetor(UUID idSetor);
	OrdemServico buscaOrdemServicoComId(UUID idUsuario);	
}
