package fr.neosoft.agirc.batch.person;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import fr.neosoft.agirc.dto.PersonDto;

public class PersonItemWriter implements ItemWriter<PersonDto> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemWriter.class);
	
	@Override
	public void write(List<? extends PersonDto> persons) throws Exception {
		log.info(" Personnes enregistrées : " + persons);
	}

}
