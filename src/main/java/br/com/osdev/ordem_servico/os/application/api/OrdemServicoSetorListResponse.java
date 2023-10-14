package br.com.osdev.ordem_servico.os.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.os.domain.Status;
import lombok.Value;

@Value
public class OrdemServicoSetorListResponse {

	private UUID idOrdemServico;
	private String nomeSetor;
	private String endereco;
	private String nomeSolicitante;
	private Status status;
	private LocalDate dataDaAbertura;
	private String DescricaDoProblema;

	public static List<OrdemServicoSetorListResponse> converte(List<OrdemServico> ordemServicoSetor) {
		return ordemServicoSetor.stream()
				.map(OrdemServicoSetorListResponse::new)
				.collect(Collectors.toList());
	}

	public OrdemServicoSetorListResponse(OrdemServico ordemServico) {	
		this.idOrdemServico = ordemServico.getIdOrdemServico();
		this.nomeSetor = ordemServico.getNomeSetor();
		this.endereco = ordemServico.getEndereco();
		this.nomeSolicitante = ordemServico.getNomeSolicitante();
		this.status = ordemServico.getStatus();
		this.dataDaAbertura = ordemServico.getDataDaAbertura();
		DescricaDoProblema = ordemServico.getDescricaDoProblema();
	}

	
}
