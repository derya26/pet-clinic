package com.derya.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.derya.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
