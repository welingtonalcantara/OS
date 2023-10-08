package br.com.osdev.os.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.os.usuario.application.service.UsuarioService;
import br.com.osdev.os.usuario.application.service.UsuarioSetorListResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioApi {
	private final UsuarioService usuarioService;

	@Override
	public UsuarioResponse postUsuario(UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioController - postUsuario");
		log.info("[idSetor] {}", usuarioRequest.getIdMeuSetor());
		UsuarioResponse usuario = usuarioService.criaUsuario(usuarioRequest);
		log.info("[finish] UsuarioController - postUsuario");
		return usuario;
	}

	@Override
	public List<UsuarioSetorListResponse> getUsuariosDoSetorComId(UUID idSetor) {
		log.info("[start] UsuarioController - getUsuariosDoSetorComId");
		log.info("[idSetor] {}", idSetor);
		List<UsuarioSetorListResponse> usuariosDoSetor = 
				usuarioService.buscaUsuariosDoSetorComID(idSetor);
		log.info("[finish] UsuarioController - getUsuariosDoSetorComId");
		return usuariosDoSetor;
	}
	
	@Override
	public UsuarioResponse buscaUsuarioAtravesId(UUID idUsuario) {
		log.info("[start] UsuarioController - buscaUsuarioAtravesId");
		UsuarioResponse usuario = usuarioService.buscaUsuarioPorId(idUsuario);
		log.info("[finish] UsuarioController - buscaUsuarioAtravesId");
		return usuario;
	}

	@Override
	public void deletaUsuarioAtravesId(UUID idUsuario) {
		log.info("[start] UsuarioController - deletaUsuarioAtravesId");
		log.info("[idUsuario] {}", idUsuario);
	    usuarioService.deletaUsuarioPorId(idUsuario);
		log.info("[finish] UsuarioController - deletaUsuarioAtravesId");
	}

	@Override
	public void atualizaUsuarioComID(UUID idUsuario, @Valid UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioController - atualizaUsuarioComID");
		log.info("[idUsuario] {} - [idSetor] {}", idUsuario, usuarioRequest.getIdMeuSetor());
		usuarioService.atualizaUsuario(idUsuario, usuarioRequest);
		log.info("[finish] UsuarioController - atualizaUsuarioComID");		
	}

		
}
