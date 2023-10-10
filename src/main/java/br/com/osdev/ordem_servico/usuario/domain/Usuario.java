package br.com.osdev.ordem_servico.usuario.domain;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.osdev.ordem_servico.usuario.application.api.UsuarioRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Usuario")
public class Usuario {
	@Id
	private UUID idUsuario;
	@NotNull
	private UUID idMeuSetor;
	@NotBlank
	private String nome;
	@NotBlank
	private String celular;
	@Builder.Default
	private TipoUsuario tipoUsuario = TipoUsuario.CLIENTE;	
	
	public Usuario(UsuarioRequest usuarioRequest) {
		this.idUsuario = UUID.randomUUID();
		this.idMeuSetor = usuarioRequest.getIdMeuSetor();
		this.nome = usuarioRequest.getNome();
		this.celular = usuarioRequest.getCelular();
		this.tipoUsuario = TipoUsuario.CLIENTE;
	}

	public void altera(@Valid UsuarioRequest usuarioRequest) {
		this.idMeuSetor = usuarioRequest.getIdMeuSetor();
		this.nome = usuarioRequest.getNome();
		this.celular = usuarioRequest.getCelular();
	}
	
	public void alteraPerfil(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;	
	}
	
}

