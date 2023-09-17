package br.com.osdev.os.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idcliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular; 
	@Enumerated(EnumType.STRING)
	private Sexo sexo;               
	@CPF
	@Column(unique = true)
	private String cpf;

}
