package com.derya.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.derya.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
