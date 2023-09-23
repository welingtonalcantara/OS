package br.com.osdev.os.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.osdev.os.controller.SetorRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Setor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idSetor", updatable = false, unique = true, nullable = false)
	private UUID idSetor;
	@NotBlank
	private String nomeSetor;
	private String endereço;

	public Setor(SetorRequest setor) {
		this.nomeSetor = setor.getNomeSetor();
		this.endereço = setor.getEndereço();
	}

	 
}
