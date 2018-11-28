package hr.matija.grdjan.sfgpetclinic.repositories;

import hr.matija.grdjan.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
