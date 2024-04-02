package org.example.projetoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.projetoecommerce.model.Endereco;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
