package br.com.osdev.os.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.os.usuario.application.service.UsuarioSetorListResponse;

@RestController
@RequestMapping("/v1")
public interface UsuarioApi {
	@PostMapping("/setor/{idSetor}/usuario")
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioResponse postUsuario(@PathVariable UUID idSetor,
			@Valid @RequestBody UsuarioRequest usuarioRequest);
	
	@GetMapping("/setor/{idSetor}/usuario")
	@ResponseStatus(code = HttpStatus.OK) 
	List<UsuarioSetorListResponse> getUsuariosDoSetorComId(@PathVariable UUID idSetor);	
	
	@GetMapping(value = "/usuario/{idUsuario}")	 
	@ResponseStatus(code = HttpStatus.OK) 
	UsuarioResponse buscaUsuarioAtravesId(@PathVariable UUID idUsuario);
	
//	@DeleteMapping(value = "/usuario/{idUsuarior}")
//	@ResponseStatus(code = HttpStatus.NO_CONTENT)
//	void deletaUsuarioAtravesId(@PathVariable UUID idUsuario);	

}
