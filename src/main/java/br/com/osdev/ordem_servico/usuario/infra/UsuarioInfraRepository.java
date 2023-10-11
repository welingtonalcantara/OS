package br.com.osdev.ordem_servico.usuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.osdev.ordem_servico.handler.APIException;
import br.com.osdev.ordem_servico.usuario.application.repository.UsuarioRepository;
import br.com.osdev.ordem_servico.usuario.domain.Usuario;
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
		var usuarios = usuarioMogoSpringRepository.findByIdMeuSetor(idSetor);
		log.info("[finish] UsuarioInfraRepository - buscaUsuariosDoSetorComID");
		return usuarios;
	}

	@Override
	public Usuario buscaUsuarioPeloId(UUID idUsuario) {
		log.info("[start] UsuarioInfraRepository - buscaUsuarioPeloId");
		log.info("[idUsuario] {}", idUsuario);
		var usuario = usuarioMogoSpringRepository.findById(idUsuario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Usuário não encontrado!"));		
		log.info("[finish] UsuarioInfraRepository - buscaUsuarioPeloId");
		return usuario;
	}

	@Override
	public void deletaUsuario(Usuario usuario) {
		log.info("[start] UsuarioInfraRepository - deletaUsuario");
		usuarioMogoSpringRepository.delete(usuario);
		log.info("[finish] UsuarioInfraRepository - deletaUsuario");
	}



}
