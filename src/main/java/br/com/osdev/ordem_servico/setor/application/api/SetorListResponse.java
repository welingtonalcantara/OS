package br.com.osdev.ordem_servico.setor.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.osdev.ordem_servico.setor.domain.Setor;
import lombok.Value;

@Value
public class SetorListResponse {
	private UUID idSetor;
	private String nomeSetor;
	
	public static List<SetorListResponse> converte(List<Setor> setores) {
		return setores.stream()
				.map(SetorListResponse::new)
				.collect(Collectors.toList());
	}

	public SetorListResponse(Setor setor) {
		this.idSetor = setor.getIdSetor();
		this.nomeSetor = setor.getNomeSetor();
	}
}
