package com.correia.personapi.mapper;

import com.correia.personapi.dto.request.PersonDTO;
import com.correia.personapi.dto.request.PhoneDTO;
import com.correia.personapi.entity.Person;
import com.correia.personapi.entity.Phone;
import com.correia.personapi.util.DataConverte;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonToMapper  implements  PersonMapper{

    @Override
    public Person toModel(PersonDTO personDTO) {
        List<Phone> fones= new ArrayList<>();
        Person retorno = new Person();
        if(personDTO.getId()!=null){
            retorno.setId(personDTO.getId());
        }
        retorno.setFirstName(personDTO.getFirstName());
        retorno.setLastName(personDTO.getLastName());
        retorno.setCpf(personDTO.getCpf());
        for (PhoneDTO tel : personDTO.getPhones()
             ) {
            Phone fone= new Phone();
            if (tel.getId()!=null){
                fone.setId(tel.getId());
            }
            fone.setNumber(tel.getNumber());
            fone.setType(tel.getType());
            fones.add(fone);
        }
        retorno.setPhones(fones);
        retorno.setBirthDate(DataConverte.stringToDate(personDTO.getBirthDate()));
        System.out.println(retorno);
        return retorno;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        List<PhoneDTO> fones= new ArrayList<>();
        PersonDTO retorno = new PersonDTO();
        if(person.getId()!=null){
            retorno.setId(person.getId());
        }
        retorno.setFirstName(person.getFirstName());
        retorno.setLastName(person.getLastName());
        retorno.setCpf(person.getCpf());
        for (Phone tel : person.getPhones()
        ) {
            PhoneDTO fone= new PhoneDTO();
            if (tel.getId()!=null){
                fone.setId(tel.getId());
            }
            fone.setNumber(tel.getNumber());
            fone.setType(tel.getType());
            fones.add(fone);
        }
        retorno.setPhones(fones);
        retorno.setBirthDate(DataConverte.DateToString(person.getBirthDate()));
        System.out.println(retorno);
        return retorno;
    }
}
