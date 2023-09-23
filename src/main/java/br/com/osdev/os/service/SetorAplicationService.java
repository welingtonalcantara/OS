package br.com.osdev.os.service;

import org.springframework.stereotype.Service;

import br.com.osdev.os.controller.SetorRequest;
import br.com.osdev.os.controller.SetorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor	
public class SetorAplicationService implements SetorService {
	//private final SetorRepository setorRepository;

	@Override
	public SetorResponse criaSetor(SetorRequest setorRequest) {	
		log.info("[inicia] SetorAplicationService - criaSetor");
		// novoSetor = new Setor(Setor);
		//Setor setor = setorRepository.salva(new Setor(setorRequest));
		log.info("[finaliza] SetorAplicationService - criaSetor");
//		return SetorResponse.builder()
//				.idSetor(setor.getIdSetor())
//				.build();
		return null;
	}
	



//	public SetorResponse buscaSetorPorNome(String nomeSetor) {	
//		log.info("[inicia] SetorService - buscaSetorPorNome");
//		return new SetorResponse(setorRepository.findByNomeSetor(nomeSetor));	
//		
//	}
//
//	public static SetorResponse buscaSetorAtravesId(UUID idSetor) {
//		log.info("[inicia] SetorService - buscaSetorAtravesId");
//		Setor setor = setorRepository.buscaSetorAtravesId(idSetor);
//		log.info("[finaliza] SetorService - buscaSetorAtravesId");
//		return new SetorResponse(setor);
//	}
//
//	/*
//	 * public void atualizaSetor(UUID idSetor, SetorAlteracaoRequest
//	 * setorAlteracaoRequest) { log.info("[inicia] SetorService - atualizaSetor");
//	 * Optional<Setor> setor = repository.findById(idSetor);
//	 * log.info("[idSetor] {}", idSetor); setor.altera(setorAlteracaoRequest);
//	 * repository.save(setor);
//	 * 
//	 * log.info("[finaliza] SetorService - atualizaSetor"); }
//	 */
//
//	public void deletaSetor(UUID idSetor) {
//		log.info("[inicia] SetorService - deletaSetor");
//		setorRepository.findById(idSetor);
//		log.info("[idSetor] {}", idSetor);
//		setorRepository.deleteById(idSetor);
//		log.info("[finaliza] SetorService - deletaSetor");	
//	}
//
//	public void atualizaSetor(UUID idSetor, SetorRequest setorRequest) {
//		log.info("[inicia] SetorService - atualizaSetor");
//		//Setor setor = repository.findById(idSetor);
//		log.info("[idSetor] {}", idSetor); 
//		//repository.altera(setorRequest);		
//		log.info("[finaliza] SetorService - atualizaSetor");		
//	}


}
