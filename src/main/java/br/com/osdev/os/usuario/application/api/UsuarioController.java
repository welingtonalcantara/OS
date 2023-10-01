package br.com.osdev.os.usuario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.os.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioApi {
	private final UsuarioService usuarioService;

	@Override
	public UsuarioResponse postUsuario(UUID idSetor, UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioController - postUsuario");
		log.info("[idSetor] {}", idSetor);
		UsuarioResponse usuario = usuarioService.criaUsuario(idSetor, usuarioRequest);
		log.info("[finish] UsuarioController - postUsuario");
		//return new UsuarioResponse(usuario.getIdUsuario());
		return usuario;
	}

	@Override
	public List<UsuarioListResponse> getUsuariosDoSetorComId(UUID idSetor) {
		log.info("[start] UsuarioController - getUsuariosDoSetorComId");
		log.info("[idSetor] {}", idSetor);
		List<UsuarioListResponse> usuariosDoSetor = usuarioService.buscaUsuariosDoSetorComID(idSetor);
		log.info("[finish] UsuarioController - getUsuariosDoSetorComId");
		return usuariosDoSetor;
	}

}
