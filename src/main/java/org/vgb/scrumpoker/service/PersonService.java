package org.vgb.scrumpoker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vgb.scrumpoker.data.Person;
import org.vgb.scrumpoker.repository.PersonRepository;

@Service
public class PersonService
{

    @Autowired private PersonRepository personRepository;
    public Person create(Person person) {
        return personRepository.save(person);
    }

}
