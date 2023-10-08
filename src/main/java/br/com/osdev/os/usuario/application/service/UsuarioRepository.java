package br.com.osdev.os.usuario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.osdev.os.usuario.domain.Usuario;

public interface UsuarioRepository {
	Usuario salvaUsuario(Usuario usuario);
	List<Usuario> buscaUsuariosDoSetorComID(UUID idSetor);
	Usuario buscaUsuarioPeloId(UUID idUsuario);
	void deletaUsuario(Usuario usuario);
	
}
