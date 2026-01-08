package vet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vet.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
