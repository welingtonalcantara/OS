package br.com.osdev.ordem_servico.os.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class OrdemServicoRequest {	
	@NotNull
	private UUID idSetorSolicitante;
	@NotBlank
	private String nomeSetor;
	@NotBlank
	private String endereco;
	@NotBlank
	private String nomeSolicitante;
	@NotBlank
	@NotEmpty(message = "Campo não pode ser vazio")
	private String DescricaDoProblema;
}
