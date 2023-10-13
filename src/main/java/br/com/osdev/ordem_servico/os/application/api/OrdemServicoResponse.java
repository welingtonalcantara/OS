package br.com.osdev.ordem_servico.os.application.api;

import java.util.UUID;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.os.domain.Status;
import lombok.Value;

@Value
public class OrdemServicoResponse {	
	private UUID idOS;
	private Status status;
	
	public OrdemServicoResponse(OrdemServico ordemServico) {
		this.idOS = ordemServico.getIdOrdemServico();
		this.status = ordemServico.getStatus();
	}


}
