package br.com.osdev.ordem_servico.os.application.service;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;

public interface OrdemServicoRespository {
	OrdemServico salvaOrdemServico(OrdemServico ordemServico);	
}
