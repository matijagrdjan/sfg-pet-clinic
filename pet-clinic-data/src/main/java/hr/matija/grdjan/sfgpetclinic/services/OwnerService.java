package hr.matija.grdjan.sfgpetclinic.services;

import hr.matija.grdjan.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudServices<Owner, Long> {
    Owner findByLastName(String lastName);


}
