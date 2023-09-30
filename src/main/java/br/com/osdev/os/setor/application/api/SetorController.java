package br.com.osdev.os.setor.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.osdev.os.setor.application.service.SetorAplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SetorController implements SetorApi{	
	private final SetorAplicationService setorService;
	
	@Override
	public SetorResponse criaSetor(SetorRequest setorRequest) {
		log.info("[inicia] SetorController - criaSetor");
		SetorResponse setorCriado = setorService.criaSetor(setorRequest);
		log.info("[finaliza] SetorController - criaSetor");
		return setorCriado;
	}

	@Override
	public List<SetorListResponse> getTodosSetores() {
		log.info("[inicia] SetorController - getTodosSetores");
		List<SetorListResponse> setores = setorService.buscaTodosSetores();
		log.info("[finaliza] SetorController - getTodosSetores");
		return setores;
	}	

	@Override
	public SetorResponse buscaSetorAtravesId(UUID idSetor) {
		log.info("[inicia] SetorController - buscaSetorAtravesId");
		log.info("[idCliente] {}", idSetor);
		SetorResponse setorResponse = 
				setorService.buscaSetorAtravesId(idSetor);
		log.info("[finaliza] SetorController - buscaSetorAtravesId");
		return setorResponse;
	}
	
	@Override
	public void deletaSetorAtravesId(@PathVariable UUID idSetor) {
		log.info("[inicia] SetorController - deletaSetorAtravesId");
		setorService.deletaSetorAtravesId(idSetor);
		log.info("[finaliza] SetorController - deletaSetorAtravesId");
	}	

	@Override
	public void atualizaSetor(@PathVariable UUID idSetor, @Valid SetorRequest setorRequest) {
		log.info("[inicia] SetorController - atualizaSetor");
		log.info("[idCliente] {}", idSetor);
		setorService.atualizaSetor(idSetor, setorRequest);
		log.info("[finaliza] SetorController - atualizaSetor");
	}


}
