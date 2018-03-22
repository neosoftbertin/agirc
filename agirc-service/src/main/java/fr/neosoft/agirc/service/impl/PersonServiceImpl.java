package fr.neosoft.agirc.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.neosoft.agirc.domain.Person;
import fr.neosoft.agirc.dto.PersonDto;
import fr.neosoft.agirc.repository.PersonRepository;
import fr.neosoft.agirc.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService {

	private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Autowired
	private PersonRepository repository;
	
	@Override
	public PersonDto enregistrerPersonne(final PersonDto dto) {
		log.info("Enregistrement de : " + dto);
		Person p = new Person(dto.getLastName(), dto.getFirstName());
		p = repository.save(p);
		dto.setFirstName(p.getFirstName());
		dto.setLastName(p.getLastName());
		return dto;
	}

	@Override
	public List<PersonDto> listerPersonnes() {
		return repository.findAll().stream()
				.map(p -> new PersonDto(p.getFirstName(), p.getFirstName())).collect(Collectors.toList());
	}

}
