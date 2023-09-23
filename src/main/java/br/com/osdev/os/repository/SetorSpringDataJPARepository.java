package br.com.osdev.os.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.osdev.os.domain.Setor;

public interface SetorSpringDataJPARepository extends JpaRepository<Setor, UUID> {

}
