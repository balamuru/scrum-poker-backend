package org.vgb.scrumpoker.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.vgb.scrumpoker.data.Person;

@CrossOrigin @Repository public interface PersonRepository extends PagingAndSortingRepository<Person, Long>
{
}
