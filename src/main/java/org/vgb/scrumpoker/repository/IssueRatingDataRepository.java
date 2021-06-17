package org.vgb.scrumpoker.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.data.IssueRatingKey;

import java.util.List;

@CrossOrigin
@Repository
public interface IssueRatingDataRepository extends PagingAndSortingRepository<IssueRatingData, IssueRatingKey> {
    List<IssueRatingData> findByIssueId(Long issueId);

    List<IssueRatingData> findAllByOrderByIssueIdAsc();

}
