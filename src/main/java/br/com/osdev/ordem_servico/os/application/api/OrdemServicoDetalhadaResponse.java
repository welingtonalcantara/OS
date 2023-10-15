package br.com.osdev.ordem_servico.os.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.osdev.ordem_servico.os.domain.Status;

public class OrdemServicoDetalhadaResponse {
	private UUID idOrdemServico;
	private UUID idSetorSolicitante;
	private String nomeSetor;
	private String endereco;
	private UUID idSolicitante;	
	private String nomeSolicitante;
	private Status status;
	private LocalDate dataDaAbertura;
	private LocalDate dataDoEncerramento;
	private String DescricaDoProblema;
	private String ServicoExecutado;
}
