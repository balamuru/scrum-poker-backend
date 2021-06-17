package org.vgb.scrumpoker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.vgb.scrumpoker.data.Issue;

import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.data.Person;

@Configuration public class ExposeEntityIdRestMvcConfiguration implements RepositoryRestConfigurer
{

    @Override public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
    {
        //allow db id's to be returned for these classes
        config.exposeIdsFor(Issue.class, IssueRatingData.class, Person.class);
    }
}