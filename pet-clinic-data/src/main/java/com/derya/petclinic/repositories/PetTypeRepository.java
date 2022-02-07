package com.derya.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.derya.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}
