package br.com.osdev.ordem_servico.os.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "OrdemServico")
public class OrdemServico {
	@Id
	private UUID idOrdemServico;
	@NotNull
	private UUID idSetorSolicitante;
	@NotBlank
	private String nomeSetor;
	@NotBlank
	private String endereco;
	@NotNull
	private UUID idSolicitante;	
	@NotBlank
	private String nomeSolicitante;
	@Builder.Default
	private Status status = Status.ABERTO;
	private LocalDate dataDaAbertura;
	private LocalDate dataDoEncerramento;
	@NotBlank
	private String DescricaDoProblema;
	private String ServicoExecutado;	
}
