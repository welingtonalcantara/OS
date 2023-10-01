package br.com.osdev.os.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/setor/{idSetor}/usuario")
public interface UsuarioApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioResponse postUsuario(@PathVariable UUID idSetor,
			@Valid @RequestBody UsuarioRequest usuarioRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK) 
	List<UsuarioListResponse> getUsuariosDoSetorComId(@PathVariable UUID idSetor);	

}
