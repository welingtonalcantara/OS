package br.com.osdev.ordem_servico.usuario.application.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.osdev.ordem_servico.usuario.domain.Usuario;
import lombok.Getter;

@Getter
public class UsuarioSetorListResponse {	
	private UUID idUsuario;	
	private String nome;	
	private String celular;	
	
	public static List<UsuarioSetorListResponse> converte(List<Usuario> usuariosDoSetor) {
		return usuariosDoSetor.stream()
				.map(UsuarioSetorListResponse::new)
				.collect(Collectors.toList());
	}
	
	public UsuarioSetorListResponse(Usuario usuario) {	
		this.idUsuario = usuario.getIdUsuario();
		this.nome = usuario.getNome();
		this.celular = usuario.getCelular();
	}

}
