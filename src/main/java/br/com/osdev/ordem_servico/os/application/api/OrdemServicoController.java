package br.com.osdev.ordem_servico.os.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class OrdemServicoController implements OrdemServicoAPI {

	@Override
	public OrdemServicoResponse criaOrdemServico(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest) {
		log.info("[start] OrdemServicoController - criaOrdemServico");
		log.info("[idUsuario] {}", idUsuario);
		log.info("[finish] OrdemServicoController - criaOrdemServico");
		return null;
	}

}
