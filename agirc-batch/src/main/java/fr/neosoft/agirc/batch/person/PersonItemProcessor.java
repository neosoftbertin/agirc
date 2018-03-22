package fr.neosoft.agirc.batch.person;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import fr.neosoft.agirc.dto.PersonDto;
import fr.neosoft.agirc.service.IPersonService;

public class PersonItemProcessor implements ItemProcessor<PersonDto, PersonDto> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	@Autowired
	private IPersonService service;
	
    @Override
    public PersonDto process(final PersonDto person) throws Exception {
        log.info("Processing (" + person + ")");
        //TODO Ici on doit appeler le process et pas directement le service
        return service.enregistrerPersonne(person);
    }

}
