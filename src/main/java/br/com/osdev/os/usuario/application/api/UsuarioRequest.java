package br.com.osdev.os.usuario.application.api;

import javax.validation.constraints.NotBlank;

import lombok.Value;

@Value
public class UsuarioRequest {
	@NotBlank
	private String nome;
	@NotBlank
	private String celular;
	
}