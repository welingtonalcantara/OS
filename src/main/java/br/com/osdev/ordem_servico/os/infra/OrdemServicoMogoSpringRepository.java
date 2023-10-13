package br.com.osdev.ordem_servico.os.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.ordem_servico.os.domain.OrdemServico;

public interface OrdemServicoMogoSpringRepository extends MongoRepository<OrdemServico, UUID> {

}
