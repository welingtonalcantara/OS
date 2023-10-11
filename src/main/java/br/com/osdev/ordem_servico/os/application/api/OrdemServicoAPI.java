package br.com.osdev.ordem_servico.os.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/usuario/{idUsuario}/ordemservico")
public interface OrdemServicoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	OrdemServicoResponse criaOrdemServico(@PathVariable UUID idUsuario,
			@Valid @RequestBody OrdemServicoRequest ordemServicoRequest);
}
