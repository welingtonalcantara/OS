package br.com.osdev.ordem_servico.os.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.osdev.ordem_servico.os.application.api.OrdemServicoRequest;
import br.com.osdev.ordem_servico.os.application.api.OrdemServicoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrdemServicoApplicationService implements OrdemServicoService {

	@Override
	public OrdemServicoResponse criaOS(UUID idUsuario, @Valid OrdemServicoRequest ordemServicoRequest) {
		log.info("[start] OrdemServicoApplicationService - criaOS");
		log.info("[finish] OrdemServicoApplicationService - criaOS");
		return null;
	}

}
