package fr.neosoft.agirc.process.delegate;

import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.neosoft.agirc.dto.PersonDto;
import fr.neosoft.agirc.service.IPersonService;

@Service("listPersonAdapter")
public class ListPersonDelegate implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(ListPersonDelegate.class);
	
	@Autowired
	private IPersonService service;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		final List<PersonDto> list = service.listerPersonnes();
		log.info("Liste complète des personnes : " + list);
	}

}
