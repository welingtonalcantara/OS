package br.com.osdev.ordem_servico.os.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.os.domain.Status;

public class OrdemServicoDetalhadaResponse {	
	private UUID idOrdemServico;	
	private String nomeSetor;
	private String endereco;	
	private String nomeSolicitante;
	private Status status;
	private LocalDate dataDaAbertura;
	private LocalDate dataDoEncerramento;
	private String DescricaDoProblema;
	private String ServicoExecutado;
	
	public OrdemServicoDetalhadaResponse(OrdemServico ordemServico) {
		this.idOrdemServico = ordemServico.getIdOrdemServico();		
		this.nomeSetor = ordemServico.getNomeSetor();
		this.endereco = ordemServico.getEndereco();		
		this.nomeSolicitante = ordemServico.getNomeSolicitante();
		this.status = ordemServico.getStatus();
		this.dataDaAbertura = ordemServico.getDataDaAbertura();
		this.dataDoEncerramento = ordemServico.getDataDoEncerramento();
		DescricaDoProblema = ordemServico.getDescricaDoProblema();
		ServicoExecutado = ordemServico.getServicoExecutado();
	}
}
