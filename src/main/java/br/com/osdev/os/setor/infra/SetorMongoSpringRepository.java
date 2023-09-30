package br.com.osdev.os.setor.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.os.setor.domain.Setor;

public interface SetorMongoSpringRepository extends MongoRepository<Setor, UUID> {

}
