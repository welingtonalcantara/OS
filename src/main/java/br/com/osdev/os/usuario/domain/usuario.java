package br.com.osdev.os.usuario.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Usuario")
public class usuario {
	@Id
	private UUID idUsuario;
	@NotNull
	private UUID idSetor;
	@NotBlank
	private String nome;
	@NotBlank
	private String celular;
	private TipoUsuario tipoUsuario;	
}
