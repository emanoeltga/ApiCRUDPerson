package com.correia.personapi;

import com.correia.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PersonapiApplicationTests {

	@Autowired
	PersonRepository dao;

	@Test
	void contextLoads() {
		/*Person dto = new Person();
		dto.setFirstName("Emanoel");
		dto.setLastName("Sol Cruel");
		dto.setCpf("999.999.999-98");
		dto.setBirthDate(LocalDate.now());
		Phone tel= new Phone();
		tel.setNumber("65992653130");
		tel.setType(PhoneType.HOME);
		List<Phone> lista = new ArrayList<>();
		lista.add(tel);
		dto.setPhones(lista);
		System.out.println(dto.getBirthDate());
		dao.save(dto);*/
	}

}
