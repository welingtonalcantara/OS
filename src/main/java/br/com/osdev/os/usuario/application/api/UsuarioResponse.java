package br.com.osdev.os.usuario.application.api;

import java.util.UUID;

import br.com.osdev.os.usuario.domain.Usuario;
import lombok.Value;

@Value
public class UsuarioResponse {	
	private UUID idUsuario;	
	private String nome;
	private String celular;	
	
	public UsuarioResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.nome = usuario.getNome();
		this.celular = usuario.getCelular();
	}

}
