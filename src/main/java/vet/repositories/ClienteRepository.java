package vet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vet.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
