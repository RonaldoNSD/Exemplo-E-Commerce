package org.example.projetoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.projetoecommerce.model.Telefone;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
