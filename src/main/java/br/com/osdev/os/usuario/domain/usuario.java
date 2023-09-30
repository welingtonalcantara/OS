package br.com.osdev.os.usuario.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Usuario")
public class Usuario {
	@Id
	private UUID idUsuario;
	//@NotNull
	//private UUID idSetor;
	@NotBlank
	private String nome;
	@NotBlank
	private String celular;
	//@Builder.Default
	//private TipoUsuario tipoUsuario = TipoUsuario.CLIENTE;		
}

