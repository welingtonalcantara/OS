package br.com.osdev.os.usuario.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.os.usuario.domain.Usuario;

public interface UsuarioMogoSpringRepository extends MongoRepository<Usuario, UUID>{

}
