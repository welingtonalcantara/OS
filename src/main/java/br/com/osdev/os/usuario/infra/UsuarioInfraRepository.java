package br.com.osdev.os.usuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.osdev.os.usuario.application.service.UsuarioRepository;
import br.com.osdev.os.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
	private final UsuarioMogoSpringRepository usuarioMogoSpringRepository;

	@Override
	public Usuario salvaUsuario(Usuario usuario) {
		log.info("[start] UsuarioInfraRepository - salvaUsuario");
		usuarioMogoSpringRepository.save(usuario);
		log.info("[finish] UsuarioInfraRepository - salvaUsuario");
		return usuario;
	}

	@Override
	public List<Usuario> buscaUsuariosDoSetorComID(UUID idSetor) {
		log.info("[start] UsuarioInfraRepository - buscaUsuariosDoSetorComID");
		log.info("[finish] UsuarioInfraRepository - buscaUsuariosDoSetorComID");
		return null;
	}

}
