package br.com.osdev.os.usuario.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.osdev.os.setor.application.service.SetorService;
import br.com.osdev.os.usuario.application.api.UsuarioRequest;
import br.com.osdev.os.usuario.application.api.UsuarioResponse;
import br.com.osdev.os.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
	private final SetorService setorService;
	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioResponse criaUsuario(UUID idSetor, UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioApplicationService - criaUsuario");
		setorService.buscaSetorAtravesId(idSetor);
		Usuario usuario = usuarioRepository.salvaUsuario(new Usuario(idSetor, usuarioRequest));
		log.info("[finish] UsuarioApplicationService - criaUsuario");
		return UsuarioResponse.builder()
				.idUsuario(usuario.getIdUsuario())			
				.build();

	}

	@Override
	public List<UsuarioSetorListResponse> buscaUsuariosDoSetorComID(UUID idSetor) {
		log.info("[start] UsuarioApplicationService - buscaUsuariosDoSetorComID");
		setorService.buscaSetorAtravesId(idSetor);
		List<Usuario> usuariosDoSetor = usuarioRepository.buscaUsuariosDoSetorComID(idSetor);
		log.info("[finish] UsuarioApplicationService - buscaUsuariosDoSetorComID");
		return UsuarioSetorListResponse.converte(usuariosDoSetor);
	}	

	@Override
	public UsuarioResponse buscaUsuarioPorId(UUID idUsuario) {
		log.info("[start] UsuarioApplicationService - buscaUsuarioPorId");
		log.info("[idUsuario] {}", idUsuario);
		Usuario usuario = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		log.info("[finish] UsuarioApplicationService - buscaUsuarioPorId");
		return UsuarioResponse.builder()
				.idUsuario(usuario.getIdUsuario())				
				.build();
	}

	@Override
	public void deletaUsuario(UUID idUsuario) {
		log.info("[start] UsuarioApplicationService - deletaUsuario");
		log.info("[finish] UsuarioApplicationService - deletaUsuario");
	}


}
