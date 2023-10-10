package br.com.osdev.ordem_servico.usuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.osdev.ordem_servico.usuario.domain.Usuario;

public interface UsuarioMogoSpringRepository extends MongoRepository<Usuario, UUID>{
	List<Usuario> findByIdMeuSetor(UUID idMeuSetor);
}
