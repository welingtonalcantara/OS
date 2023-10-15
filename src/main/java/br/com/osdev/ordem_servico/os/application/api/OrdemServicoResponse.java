package br.com.osdev.ordem_servico.os.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.os.domain.Status;
import lombok.Value;

@Value
public class OrdemServicoResponse {	
	private UUID idOS;	
	private String nomeSetor;
	private String endereco;
	private String nomeSolicitante;	
	private Status status;
	private LocalDate dataDaAbertura;	
	private String DescricaDoProblema;
	
	
	public OrdemServicoResponse(OrdemServico ordemServico) {
		this.idOS = ordemServico.getIdOrdemServico();
		this.nomeSetor = ordemServico.getNomeSetor();
		this.endereco = ordemServico.getEndereco();
		this.nomeSolicitante = ordemServico.getNomeSolicitante();
		this.status = ordemServico.getStatus();
		this.dataDaAbertura = ordemServico.getDataDaAbertura();
		this.DescricaDoProblema = ordemServico.getDescricaDoProblema();
	}


}
