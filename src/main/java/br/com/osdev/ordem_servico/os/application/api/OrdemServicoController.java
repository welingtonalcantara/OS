package br.com.osdev.ordem_servico.os.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.ordem_servico.os.application.service.OrdemServicoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OrdemServicoController implements OrdemServicoAPI {
	private final OrdemServicoService ordemServicoService;

	@Override
	public OrdemServicoResponse criaOrdemServico(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest) {
		log.info("[start] OrdemServicoController - criaOrdemServico");
		log.info("[idUsuario] {}", idUsuario);
		//OrdemServico ordemServico = ordemServicoService.criaOS(idUsuario, ordemServicoRequest);
		OrdemServicoResponse ordemServico = ordemServicoService.criaOS(idUsuario, ordemServicoRequest);
		log.info("[finish] OrdemServicoController - criaOrdemServico");
		//return new OrdemServicoResponse(ordemServico.getIdOrdemServico());
		return ordemServico;
	}

	@Override
	public List<OrdemServicoSetorListResponse> getOrdemServicoPorSetorUsuario(UUID idUsuario, UUID idSetor) {
		log.info("[start] OrdemServicoController - getOrdemServicoPorSetorUsuario");
		log.info("[idUsuario] {}", idUsuario);
		List<OrdemServicoSetorListResponse> OrdemServicoSetor = ordemServicoService.buscaOrdemServicoSetor(idUsuario, idSetor);
		log.info("[finish] OrdemServicoController - getOrdemServicoPorSetorUsuario");
		return OrdemServicoSetor;
	}

	@Override
	public OrdemServicoResponse getOrdemServicoComId(UUID idUsuario, UUID idSetor, UUID idOrdemServico) {
		log.info("[start] OrdemServicoController - getOrdemServicoComId");
		log.info("[idUsuario] {} - [idordemServico] {}", idUsuario, idOrdemServico);
		OrdemServicoResponse ordemSevico = ordemServicoService.buscaOrdemServicoComId(idUsuario, idOrdemServico, idSetor);
		log.info("[finish] OrdemServicoController - getOrdemServicoComId");
		return ordemSevico;
	}

	@Override
	public void atualizarOrdemServico(UUID idUsuario, UUID idOrdemServico,
			@Valid OrdemServicoAltercaopRequest ordemServicoAlteracaoRequest) {
		log.info("[start] OrdemServicoController - atualizarOrdemServico");
		log.info("[idUsuario] {} - [idordemServico] {}", idUsuario, idOrdemServico);
		ordemServicoService.alteraOrdemservico(idUsuario, idOrdemServico);
		log.info("[finish] OrdemServicoController - atualizarOrdemServico");
	}

	

}
