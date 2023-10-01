package br.com.osdev.os.usuario.application.service;

import br.com.osdev.os.usuario.domain.Usuario;

public interface UsuarioRepository {
	Usuario salvaUsuario(Usuario usuario);	
}
