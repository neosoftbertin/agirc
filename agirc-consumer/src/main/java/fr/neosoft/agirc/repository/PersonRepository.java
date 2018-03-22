package fr.neosoft.agirc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.neosoft.agirc.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
