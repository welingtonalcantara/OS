package br.com.osdev.ordem_servico.os.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.osdev.ordem_servico.handler.APIException;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoDetalhadaResponse;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoRequest;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoResponse;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoSetorListResponse;
import br.com.osdev.ordem_servico.os.application.repository.OrdemServicoRespository;
import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.usuario.application.repository.UsuarioRepository;
import br.com.osdev.ordem_servico.usuario.application.service.UsuarioService;
import br.com.osdev.ordem_servico.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrdemServicoApplicationService implements OrdemServicoService {
	private final UsuarioService usuarioservice;
	private final OrdemServicoRespository OrdemServicoRespository;
	private final UsuarioRepository usuarioRepository;

	@Override
	public OrdemServicoResponse criaOS(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest) {
		log.info("[start] OrdemServicoApplicationService - criaOS");
		usuarioservice.buscaUsuarioPorId(idUsuario);
		OrdemServico ordemServico = OrdemServicoRespository.salvaOrdemServico(new OrdemServico(idUsuario, ordemServicoRequest));
		log.info("[finish] OrdemServicoApplicationService - criaOS");
		//return new OrdemServicoResponse(ordemServico.getIdOrdemServico());
		return new OrdemServicoResponse(ordemServico);
	}

	@Override
	public List<OrdemServicoSetorListResponse> buscaOrdemServicoSetor(UUID idUsuario, UUID idSetor) {
		log.info("[start] OrdemServicoApplicationService - buscaOrdemServicoSetor");
		Usuario usuarioSetor = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		if(!idSetor.equals(usuarioSetor.getIdMeuSetor())) {
			throw APIException.build(HttpStatus.NOT_FOUND, "Este usuário não pertence ao setor da OS!");
		}
		List<OrdemServico> ordemServicoSetor = OrdemServicoRespository.buscaOrdemServicoSetor(idSetor);
		log.info("[start] OrdemServicoApplicationService - buscaOrdemServicoSetor");
		return OrdemServicoSetorListResponse.converte(ordemServicoSetor);
	}

	@Override
	public OrdemServicoDetalhadaResponse buscaOrdemServicoComId(UUID idUsuario, UUID idOrdemServico, UUID idSetor) {
		log.info("[start] OrdemServicoApplicationService - buscaOrdemServicoComId");
		Usuario usuarioSetor = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		if(!idSetor.equals(usuarioSetor.getIdMeuSetor())) {
			throw APIException.build(HttpStatus.NOT_FOUND, "Este usuário não pertence ao setor da OS!");
		}
		log.info("[finish] OrdemServicoApplicationService - buscaOrdemServicoComId");
		return null;
	}

}
