package br.com.osdev.os.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.os.domain.Setor;

public interface SetorMongoSpringRepository extends MongoRepository<Setor, UUID> {

}
