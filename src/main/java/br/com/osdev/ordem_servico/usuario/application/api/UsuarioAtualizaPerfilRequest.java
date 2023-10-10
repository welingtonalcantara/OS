package br.com.osdev.ordem_servico.usuario.application.api;

import java.util.UUID;

import br.com.osdev.ordem_servico.usuario.domain.TipoUsuario;
import lombok.Value;

@Value
public class UsuarioAtualizaPerfilRequest {	
	private UUID idUsuario;
	private TipoUsuario tipoUsuario; 
}