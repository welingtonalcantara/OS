package br.com.osdev.os.usuario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class UsuarioController implements usuarioApi {

	@Override
	public UsuarioResponse postUsuario(UUID idSetor, UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - postUsuario");
		log.info("[idSetor] {}", idSetor);
		log.info("[finaliza] UsuarioController - postUsuario");
		return null;
	}

}
