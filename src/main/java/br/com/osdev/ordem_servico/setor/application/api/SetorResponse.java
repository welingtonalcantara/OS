package br.com.osdev.ordem_servico.setor.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SetorResponse {
	
	private UUID idsetor;
	private String nomeSetor;
	private String endereço;
	
//	public SetorResponse(Setor setor) {
//		this.idsetor = setor.getIdSetor();
//		this.nomeSetor = setor.getNomeSetor();
//		this.endereço = setor.getEndereço();
//	}

}
