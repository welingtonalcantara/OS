package br.com.osdev.os.usuario.application.api;

import java.util.UUID;

import br.com.osdev.os.usuario.domain.TipoUsuario;
import lombok.Value;

@Value
public class UsuarioAtualizaPerfilRequest {	
	private UUID idUsuario;
	private TipoUsuario tipoUsuario; 
}