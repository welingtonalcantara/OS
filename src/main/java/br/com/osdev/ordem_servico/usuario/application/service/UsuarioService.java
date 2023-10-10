package br.com.osdev.ordem_servico.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.ordem_servico.usuario.application.api.UsuarioAtualizaPerfilRequest;
import br.com.osdev.ordem_servico.usuario.application.api.UsuarioRequest;
import br.com.osdev.ordem_servico.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
	UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
	List<UsuarioSetorListResponse> buscaUsuariosDoSetorComID(UUID idSetor);
	UsuarioResponse buscaUsuarioPorId(UUID idUsuario);
	void deletaUsuarioPorId(UUID idUsuario);
	void atualizaUsuario(UUID idUsuario, @Valid UsuarioRequest usuarioRequest);
	void atualizaPerfilUsuario(UUID idUsuario, @Valid UsuarioAtualizaPerfilRequest usuarioRequest);	
}
