package com.correia.personapi.mapper;

import com.correia.personapi.dto.request.PersonDTO;
import com.correia.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface PersonMapper {
    //PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    //@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
