package org.example.projetoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.projetoecommerce.model.Contato;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
