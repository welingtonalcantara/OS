package br.com.osdev.ordem_servico.setor.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.ordem_servico.setor.domain.Setor;

public interface SetorMongoSpringRepository extends MongoRepository<Setor, UUID> {

}
