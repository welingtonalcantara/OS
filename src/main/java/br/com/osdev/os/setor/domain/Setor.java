package br.com.osdev.os.setor.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.osdev.os.setor.application.api.SetorRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Setor")
public class Setor {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(columnDefinition = "uuid", name = "idSetor", updatable = false, unique = true, nullable = false)
	private UUID idSetor;
	@NotBlank
	private String nomeSetor;
	private String endereco;

	public Setor(SetorRequest setor) {
		this.idSetor = UUID.randomUUID();
		this.nomeSetor = setor.getNomeSetor();
		this.endereco = setor.getEndereco();
	}

	public void altera(SetorRequest setorRequest) {
		this.nomeSetor = setorRequest.getNomeSetor();
		this.endereco = setorRequest.getEndereco();		
	}

	 
}
