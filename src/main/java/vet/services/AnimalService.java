package vet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vet.entities.Animal;
import vet.repositories.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal insert(Animal animal){
        return animalRepository.save(animal);
    }

    public void delete(Long id){
        animalRepository.deleteById(id);
    }

    public Animal update(Long id, Animal animal){
        Animal entity = animalRepository.getReferenceById(id);
        updateData(entity, animal);
        return animalRepository.save(entity);
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public Animal findById(Long id){
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.get();
    }

    private void updateData(Animal entity, Animal animal) {
        entity.setNome(animal.getNome());
        entity.setRaca(animal.getRaca());
        entity.setDataNascimento(animal.getDataNascimento());
        entity.setEspecie(animal.getEspecie());
        entity.setDono(animal.getDono());
    }
}
