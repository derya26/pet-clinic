package com.derya.petclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.derya.petclinic.model.Speciality;
import com.derya.petclinic.repositories.SpecialityRepository;
import com.derya.petclinic.services.SpecialitiesService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialitiesService{
	
	private final SpecialityRepository repository;
	

	public SpecialitySDJpaService(SpecialityRepository repository) {
		this.repository = repository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		repository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		
		return repository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		repository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		
		repository.deleteById(id);
	}

}
