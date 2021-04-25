package org.vgb.scrumpoker.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.vgb.scrumpoker.data.IssueRating;

@CrossOrigin @Repository public interface IssueRatingRepository extends PagingAndSortingRepository<IssueRating, Long>
{

}
