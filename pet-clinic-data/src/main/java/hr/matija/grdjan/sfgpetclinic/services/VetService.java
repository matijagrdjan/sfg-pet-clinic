package hr.matija.grdjan.sfgpetclinic.services;

import hr.matija.grdjan.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
