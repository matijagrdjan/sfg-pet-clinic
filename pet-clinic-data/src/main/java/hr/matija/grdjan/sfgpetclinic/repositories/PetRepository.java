package hr.matija.grdjan.sfgpetclinic.repositories;

import hr.matija.grdjan.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
