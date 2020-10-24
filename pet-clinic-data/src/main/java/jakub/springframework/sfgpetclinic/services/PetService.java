package jakub.springframework.sfgpetclinic.services;

import jakub.springframework.sfgpetclinic.model.Owner;
import jakub.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
