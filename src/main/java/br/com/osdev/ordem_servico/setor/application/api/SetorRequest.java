package br.com.osdev.ordem_servico.setor.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class SetorRequest {
	@NotEmpty(message = "Campo não pode ser vazio")
	@Size(max = 100, min = 3)
	private String nomeSetor;
	private String endereco;
}
