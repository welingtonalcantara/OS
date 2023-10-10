package br.com.osdev.ordem_servico.usuario.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class UsuarioRequest {
	@NotNull
	private UUID idMeuSetor;
	@NotBlank
	private String nome;
	@NotBlank
	private String celular;
	
}