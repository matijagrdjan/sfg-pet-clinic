package hr.matija.grdjan.sfgpetclinic.repositories;

import hr.matija.grdjan.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
