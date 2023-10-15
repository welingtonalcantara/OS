package br.com.osdev.ordem_servico.os.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.osdev.ordem_servico.os.application.service.OrdemServicoRespository;
import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class OrdemServicoInfraRepository implements OrdemServicoRespository {
	private final OrdemServicoMogoSpringRepository ordemServicoMogoSpringRepository;

	@Override
	public OrdemServico salvaOrdemServico(OrdemServico ordemServico) {
		log.info("[start] OrdemServicoInfraRepository - salvaOrdemServico");
		ordemServicoMogoSpringRepository.save(ordemServico);
		log.info("[start] OrdemServicoInfraRepository - salvaOrdemServico");
		return ordemServico;
	}

	@Override
	public List<OrdemServico> buscaOrdemServicoSetor(UUID idSetor) {
		log.info("[start] OrdemServicoInfraRepository - buscaOrdemServicoSetor");
		var ordensServico = ordemServicoMogoSpringRepository.findByIdSetorSolicitante(idSetor);
		log.info("[finish] OrdemServicoInfraRepository - buscaOrdemServicoSetor");
		return ordensServico;
		
	}

}
