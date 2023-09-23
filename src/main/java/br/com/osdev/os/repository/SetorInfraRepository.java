package br.com.osdev.os.repository;

import org.springframework.stereotype.Repository;

import br.com.osdev.os.domain.Setor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class SetorInfraRepository implements SetorRepository {
	private SetorSpringDataJPARepository setorSpringDataJPARepository;

	@Override
	public Setor salva(Setor setor) {
		log.info("[inicia] SetorInfraRepository - salva");
		setorSpringDataJPARepository.save(cliente);
		log.info("[finaliza] SetorInfraRepository - salva");
		return setor;
	}

}
