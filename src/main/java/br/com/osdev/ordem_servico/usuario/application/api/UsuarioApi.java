package br.com.osdev.ordem_servico.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.ordem_servico.usuario.application.service.UsuarioSetorListResponse;

@RestController
@RequestMapping("/v1/usuario")
public interface UsuarioApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioResponse postUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);
	
	@GetMapping(value = "/setor/{idSetor}")
	@ResponseStatus(code = HttpStatus.OK) 
	List<UsuarioSetorListResponse> getUsuariosDoSetorComId(@PathVariable UUID idSetor);	
	
	@GetMapping(value = "/{idUsuario}")	 
	@ResponseStatus(code = HttpStatus.OK) 
	UsuarioResponse buscaUsuarioAtravesId(@PathVariable UUID idUsuario);
	
	@DeleteMapping(value = "/{idUsuario}")	 
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaUsuarioAtravesId(@PathVariable UUID idUsuario);	

	@PatchMapping(value = "/{idUsuario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaUsuarioComID(@PathVariable UUID idUsuario,
			@Valid @RequestBody UsuarioRequest usuarioRequest);
	
	@PatchMapping(value = "/adm/{idUsuario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaPerfilUsuario(@PathVariable UUID idUsuario,
			@Valid @RequestBody UsuarioAtualizaPerfilRequest usuarioRequest);
}
