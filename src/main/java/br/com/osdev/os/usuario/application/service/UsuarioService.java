package br.com.osdev.os.usuario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.osdev.os.usuario.application.api.UsuarioListResponse;
import br.com.osdev.os.usuario.application.api.UsuarioRequest;
import br.com.osdev.os.usuario.application.api.UsuarioResponse;

public interface UsuarioService {
	UsuarioResponse criaUsuario(UUID idSetor, UsuarioRequest usuarioRequest);
	List<UsuarioListResponse> buscaUsuariosDoSetorComID(UUID idSetor);}
