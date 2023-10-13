package br.com.osdev.ordem_servico.os.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.osdev.ordem_servico.os.application.api.OrdemServicoRequest;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoResponse;
import br.com.osdev.ordem_servico.os.domain.OrdemServico;
import br.com.osdev.ordem_servico.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrdemServicoApplicationService implements OrdemServicoService {
	private final UsuarioService usuarioservice;
	private final OrdemServicoRespository OrdemServicoRespository;

	@Override
	public OrdemServicoResponse criaOS(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest) {
		log.info("[start] OrdemServicoApplicationService - criaOS");
		usuarioservice.buscaUsuarioPorId(idUsuario);
		OrdemServico ordemServico = OrdemServicoRespository.salvaOrdemServico(new OrdemServico(idUsuario, ordemServicoRequest));
		log.info("[finish] OrdemServicoApplicationService - criaOS");
		//return new OrdemServicoResponse(ordemServico.getIdOrdemServico());
		return new OrdemServicoResponse(ordemServico);
	}

}
