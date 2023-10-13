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
	public List<OrdemServicoSetorListResponse> getOrdemServicoPorSetorUsuario(UUID idUsuario) {
		log.info("[start] OrdemServicoController - getOrdemServicoPorSetorUsuario");
		log.info("[idUsuario] {}", idUsuario);
		log.info("[finish] OrdemServicoController - getOrdemServicoPorSetorUsuario");
		return null;
	}

}
