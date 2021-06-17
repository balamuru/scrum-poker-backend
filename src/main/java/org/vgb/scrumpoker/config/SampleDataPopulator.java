package org.vgb.scrumpoker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.vgb.scrumpoker.data.Issue;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.data.Person;
import org.vgb.scrumpoker.repository.IssueRatingDataRepository;
import org.vgb.scrumpoker.repository.IssueRepository;
import org.vgb.scrumpoker.repository.PersonRepository;

import java.util.Random;

@Profile("dev")
@Component
public class SampleDataPopulator implements ApplicationRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private IssueRatingDataRepository issueRatingDataRepository;


    @Override
    public void run(final ApplicationArguments args)  {
        //populate sample data

        final Random random = new Random(System.currentTimeMillis());
        final Issue issue1 = issueRepository.save(new Issue(null, "chickens"));
        final Issue issue2 = issueRepository.save(new Issue(null, "meaning of life"));

        final Person person1 = personRepository.save(new Person(null, "John"));
        final Person person2 = personRepository.save(new Person(null, "Chad"));
        final Person person3 = personRepository.save(new Person(null, "David"));

        issueRatingDataRepository.save(new IssueRatingData(person1, issue1, (random.nextFloat() + 1)));
        issueRatingDataRepository.save(new IssueRatingData(person1, issue2, (random.nextFloat() + 1)));

        issueRatingDataRepository.save(new IssueRatingData(person2, issue1, (random.nextFloat() + 1)));
        issueRatingDataRepository.save(new IssueRatingData(person2, issue2, (random.nextFloat() + 1)));

        issueRatingDataRepository.save(new IssueRatingData(person3, issue1, (random.nextFloat() + 1)));
        issueRatingDataRepository.save(new IssueRatingData(person3, issue2, (random.nextFloat() + 1)));

        issueRatingDataRepository.findAll(Sort.by("issueId", "personId")).forEach(issueRating -> System.err.println(">>> " + issueRating));
    }
}
