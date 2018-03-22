package fr.neosoft.agirc.service;

import java.util.List;

import fr.neosoft.agirc.dto.PersonDto;

public interface IPersonService {

	PersonDto enregistrerPersonne(PersonDto personne);
	
	List<PersonDto> listerPersonnes();
}
