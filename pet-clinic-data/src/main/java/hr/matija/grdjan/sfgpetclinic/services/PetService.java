package hr.matija.grdjan.sfgpetclinic.services;

import hr.matija.grdjan.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
