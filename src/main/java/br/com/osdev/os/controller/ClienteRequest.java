package br.com.osdev.os.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.osdev.os.domain.Genero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {
	@NotEmpty(message = "Campo não pode ser vazio")
	@Size(max = 100, min = 3)
	private String nomeCompleto;
	@NotEmpty(message = "Campo não pode ser vazio")
	@Size(max = 20, min = 11)
	private String celular; 
	private Genero genero; 	
	private String cpf;
}
