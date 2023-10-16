package br.com.osdev.ordem_servico.os.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import br.com.osdev.ordem_servico.os.domain.Status;

public class OrdemServicoAltercaopRequest {	
	@NotBlank	
	private Status status;
	@NotBlank
	@NotEmpty(message = "Campo não pode ser vazio")	
	private String ServicoExecutado;	
	@NotBlank
	@NotEmpty(message = "Campo não pode ser vazio")	
	private String tecnico;
}
