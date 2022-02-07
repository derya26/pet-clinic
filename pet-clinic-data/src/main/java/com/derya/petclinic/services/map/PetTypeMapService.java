package com.derya.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.derya.petclinic.model.PetType;
import com.derya.petclinic.services.PetTypeService;
import com.derya.petclinic.services.map.AbstractMapService;



@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

}
