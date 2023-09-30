package br.com.osdev.os.usuario.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.osdev.os.usuario.application.api.UsuarioRequest;
import br.com.osdev.os.usuario.application.api.UsuarioResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UsuarioApplicationService implements UsuarioService {

	@Override
	public UsuarioResponse criaUsuario(UUID idSetor, UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioApplicationService - criaUsuario");
		log.info("[finish] UsuarioApplicationService - criaUsuario");
		return null;
	}

}
