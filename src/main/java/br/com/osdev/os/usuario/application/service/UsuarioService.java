package br.com.osdev.os.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.osdev.os.usuario.application.api.UsuarioAtualizaPerfilRequest;
import br.com.osdev.os.usuario.application.api.UsuarioRequest;
import br.com.osdev.os.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
	UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
	List<UsuarioSetorListResponse> buscaUsuariosDoSetorComID(UUID idSetor);
	UsuarioResponse buscaUsuarioPorId(UUID idUsuario);
	void deletaUsuarioPorId(UUID idUsuario);
	
}
