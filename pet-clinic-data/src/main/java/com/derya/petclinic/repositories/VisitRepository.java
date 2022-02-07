package com.derya.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.derya.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
