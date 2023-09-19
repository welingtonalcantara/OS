package br.com.osdev.os.controller;

import java.util.UUID;

import br.com.osdev.os.domain.Cliente;
import br.com.osdev.os.domain.Genero;
import lombok.Getter;

@Getter
public class ClienteResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular; 
	private Genero genero;             
	private String cpf;
	
	public ClienteResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.celular = cliente.getCelular();
		this.genero = cliente.getGenero();
		this.cpf = cliente.getCelular();
	}
}
