package hr.matija.grdjan.sfgpetclinic.services;

import hr.matija.grdjan.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
