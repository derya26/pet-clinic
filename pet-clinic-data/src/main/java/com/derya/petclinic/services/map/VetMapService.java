package com.derya.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.derya.petclinic.model.Speciality;
import com.derya.petclinic.model.Vet;
import com.derya.petclinic.services.SpecialitiesService;
import com.derya.petclinic.services.VetService;

@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet, Long>implements VetService{

	private final SpecialitiesService specialitiesService;
	
	
	public VetMapService(SpecialitiesService specialitiesService) {
		this.specialitiesService = specialitiesService;
	}


	@Override
	public Vet save(Vet object) {
		if(object.getSpecialities().size()>0) {
			object.getSpecialities().forEach(speciality->{
				if(speciality.getId()==null) {
					Speciality savedSpeciality = specialitiesService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save( object);
	}

}
