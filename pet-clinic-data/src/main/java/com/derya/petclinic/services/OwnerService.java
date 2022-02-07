package com.derya.petclinic.services;

import java.util.List;

import com.derya.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);
	

}
