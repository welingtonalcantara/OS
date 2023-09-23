package br.com.osdev.os.controller;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SetorResponse {
	private UUID idsetor;
	//private String nomeSetor;
	//private String endereço;
	
//	public SetorResponse(Setor setor) {
//		this.idsetor = setor.getIdSetor();
//		this.nomeSetor = setor.getNomeSetor();
//		this.endereço = setor.getEndereço();
//	}

}
