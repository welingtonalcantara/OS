package br.com.osdev.ordem_servico.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.osdev.ordem_servico.handler.APIException;
import br.com.osdev.ordem_servico.setor.application.service.SetorService;
import br.com.osdev.ordem_servico.usuario.application.api.UsuarioAtualizaPerfilRequest;
import br.com.osdev.ordem_servico.usuario.application.api.UsuarioRequest;
import br.com.osdev.ordem_servico.usuario.application.api.UsuarioResponse;
import br.com.osdev.ordem_servico.usuario.domain.TipoUsuario;
import br.com.osdev.ordem_servico.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
	private final SetorService setorService;
	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioApplicationService - criaUsuario");
		setorService.buscaSetorAtravesId(usuarioRequest.getIdMeuSetor());
		Usuario usuario = usuarioRepository.salvaUsuario(new Usuario(usuarioRequest));
		log.info("[finish] UsuarioApplicationService - criaUsuario");
		return new UsuarioResponse(usuario);
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
		return new UsuarioResponse(usuario);
	}

	@Override
	public void deletaUsuarioPorId(UUID idUsuario) {
		log.info("[start] UsuarioApplicationService - deletaUsuarioPorId");
		Usuario usuario = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		usuarioRepository.deletaUsuario(usuario);
		log.info("[finish] UsuarioApplicationService - deletaUsuarioPorId");
	}

	@Override
	public void atualizaUsuario(UUID idUsuario, @Valid UsuarioRequest usuarioRequest) {
		log.info("[start] UsuarioApplicationService - atualizaUsuario");
		setorService.buscaSetorAtravesId(usuarioRequest.getIdMeuSetor());
		Usuario usuario = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		usuario.altera(usuarioRequest);
		usuarioRepository.salvaUsuario(usuario);
		log.info("[finish] UsuarioApplicationService - atualizaUsuario");
	}

	@Override
	public void atualizaPerfilUsuario(UUID idUsuario, @Valid UsuarioAtualizaPerfilRequest usuarioRequest) {
		Usuario usuarioAdm = usuarioRepository.buscaUsuarioPeloId(idUsuario);
		if(!TipoUsuario.ADM.equals(usuarioAdm.getTipoUsuario())) {
			throw APIException.build(HttpStatus.NOT_FOUND, "Usuário não é Administrador!");
		} 
		Usuario usuario = usuarioRepository.buscaUsuarioPeloId(usuarioRequest.getIdUsuario());
		usuario.alteraPerfil(usuarioRequest.getTipoUsuario());
		usuarioRepository.salvaUsuario(usuario);
	}

	


}
