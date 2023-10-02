package br.com.osdev.os.usuario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UsuarioResponse {	
	private UUID idUsuario;	
	private String nome;
	private String celular;	

}
