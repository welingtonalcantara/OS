package br.com.osdev.os.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SetorAlteracaoRequest {
	@NotEmpty(message = "Campo não pode ser vazio")
	@Size(max = 100, min = 5)
	private String nomeSetor;
	@Size(max = 100, min = 5)
	private String endereço;
}
