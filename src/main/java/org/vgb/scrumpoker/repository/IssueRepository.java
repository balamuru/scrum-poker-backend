package org.vgb.scrumpoker.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.vgb.scrumpoker.data.Issue;

@CrossOrigin @Repository public interface IssueRepository extends PagingAndSortingRepository<Issue, Long>
{
}
