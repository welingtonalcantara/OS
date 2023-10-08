package br.com.osdev.os.usuario.application.api;

import java.util.UUID;

import br.com.osdev.os.usuario.domain.TipoUsuario;
import br.com.osdev.os.usuario.domain.Usuario;
import lombok.Value;

@Value
public class UsuarioResponse {	
	private UUID idUsuario;	
	private UUID idSetor;	
	private String nome;
	private String celular;	
	private TipoUsuario tipoUsuario;
	
	public UsuarioResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.idSetor = usuario.getIdMeuSetor();
		this.nome = usuario.getNome();
		this.celular = usuario.getCelular();
		this.tipoUsuario = usuario.getTipoUsuario();				
	}

}
