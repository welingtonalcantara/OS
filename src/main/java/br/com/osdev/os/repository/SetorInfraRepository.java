package br.com.osdev.os.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.osdev.os.domain.Setor;
import br.com.osdev.os.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class SetorInfraRepository implements SetorRepository {
	private final SetorMongoSpringRepository setorMongoSpringRepository;

	@Override
	public Setor salva(Setor setor) {
		log.info("[inicia] SetorInfraRepository - salva");
		setorMongoSpringRepository.save(setor);
		log.info("[finaliza] SetorInfraRepository - salva");
		return setor;
	}

	@Override
	public List<Setor> buscaTodosSetores() {
		log.info("[inicia] SetorInfraRepository - buscaTodosSetores");
		List<Setor> todosSetores = setorMongoSpringRepository.findAll();
		log.info("[finish] SetorInfraRepository - buscaTodosSetores");
		return todosSetores;
	}

	@Override
	public Setor buscaSetorAtravesId(UUID idSetor) {
		log.info("[inicia] SetorInfraRepository - buscaSetorAtravesId");
		Setor setor = setorMongoSpringRepository.findById(idSetor)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Setor não encontrado!"));
		log.info("[finaliza] SetorInfraRepository - buscaSetorAtravesId");
		return setor;
	}

	@Override
	public void deletaSetor(Setor setor) {
		log.info("[inicia] SetorInfraRepository - deletaSetor");
		setorMongoSpringRepository.delete(setor);
		log.info("[inicia] SetorInfraRepository - deletaSetor");
	}

}
