package org.example.projetoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.projetoecommerce.model.PessoaJuridica;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Integer> {
}
