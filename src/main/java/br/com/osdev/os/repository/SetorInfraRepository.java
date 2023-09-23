package br.com.osdev.os.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.osdev.os.domain.Setor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class SetorInfraRepository implements SetorRepository {
	private final SetorSpringDataJPARepository setorSpringDataJPARepository;

	@Override
	public Setor salva(Setor setor) {
		log.info("[inicia] SetorInfraRepository - salva");
		setorSpringDataJPARepository.save(setor);
		log.info("[finaliza] SetorInfraRepository - salva");
		return setor;
	}

	@Override
	public List<Setor> buscaTodosSetores() {
		log.info("[inicia] SetorInfraRepository - buscaTodosSetores");
		List<Setor> todosSetores = setorSpringDataJPARepository.findAll();
		log.info("[finish] SetorInfraRepository - buscaTodosSetores");
		return todosSetores;
	}

}
