package br.com.osdev.os.setor.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.osdev.os.setor.application.api.SetorListResponse;
import br.com.osdev.os.setor.application.api.SetorRequest;
import br.com.osdev.os.setor.application.api.SetorResponse;
import br.com.osdev.os.setor.application.repository.SetorRepository;
import br.com.osdev.os.setor.domain.Setor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor	
public class SetorAplicationService implements SetorService {
	private final SetorRepository setorRepository;

	@Override
	public SetorResponse criaSetor(SetorRequest setorRequest) {	
		log.info("[inicia] SetorAplicationService - criaSetor");
		Setor setor = setorRepository.salva(new Setor(setorRequest));
		log.info("[finaliza] SetorAplicationService - criaSetor");
		return SetorResponse.builder()
				.idsetor(setor.getIdSetor())
				.nomeSetor(setor.getNomeSetor())
				.endereço(setor.getEndereco())
				.build();	
	}

	@Override
	public List<SetorListResponse> buscaTodosSetores() {
		log.info("[inicia] SetorAplicationService - buscaTodosSetores");
		List<Setor> setores = setorRepository.buscaTodosSetores();
		log.info("[finaliza] SetorAplicationService - buscaTodosSetores");
		return SetorListResponse.converte(setores);
	}

	@Override
	public SetorResponse buscaSetorAtravesId(UUID idSetor) {
		log.info("[inicia] SetorService - buscaSetorAtravesId");
		Setor setor = setorRepository.buscaSetorAtravesId(idSetor);
		log.info("[finaliza] SetorService - buscaSetorAtravesId");
		return SetorResponse.builder()
				.idsetor(setor.getIdSetor())
				.nomeSetor(setor.getNomeSetor())
				.endereço(setor.getEndereco())
				.build();
	}

	public void deletaSetorAtravesId(UUID idSetor) {
		log.info("[inicia] SetorService - deletaSetorAtravesId");
		Setor setor = setorRepository.buscaSetorAtravesId(idSetor);
		setorRepository.deletaSetor(setor);
		log.info("[finaliza] SetorService - deletaSetorAtravesId");	
	}	

	public void atualizaSetor(UUID idSetor, SetorRequest setorRequest) {
		log.info("[inicia] SetorService - atualizaSetor");
		Setor setor = setorRepository.buscaSetorAtravesId(idSetor);		
		setor.altera(setorRequest);
		setorRepository.salva(setor);
		log.info("[finaliza] SetorService - atualizaSetor");		
	}


}
