package fr.neosoft.agirc.process.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.neosoft.agirc.dto.PersonDto;
import fr.neosoft.agirc.service.IPersonService;

@Service("savePersonAdapter")
public class SavePersonDelegate implements JavaDelegate {

	@Autowired
	private IPersonService service;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		final String prenom = (String) execution.getVariable("firstName");
		final String nom = (String) execution.getVariable("lastName");
		service.enregistrerPersonne(new PersonDto(prenom, nom));
	}

}
