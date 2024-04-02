package org.example.projetoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.projetoecommerce.model.Pessoa;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
