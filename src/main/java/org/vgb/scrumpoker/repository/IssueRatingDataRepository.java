package org.vgb.scrumpoker.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.data.IssueRatingKey;

import java.util.List;

@CrossOrigin
@Repository
public interface IssueRatingDataRepository extends PagingAndSortingRepository<IssueRatingData, IssueRatingKey> {
//    @Query("SELECT ir.person, ir.issue, ir.rating FROM IssueRatingData ir WHERE ir.issue.id = :issue_id")
//    List<IssueRatingData> findByIssueId(@Param("issue_id") Long issueId);


//    @Query("SELECT ir.person, ir.issue, ir.rating FROM IssueRatingData ir WHERE ir.issue.id = :issue_id")
//    @EntityGraph(attributePaths = {"person", "issue"}, type = EntityGraph.EntityGraphType.LOAD)
//    List<IssueRatingData> findByIssueId(@Param("issue_id") Long issueId);


    List<IssueRatingData> findByIssueId(Long issueId);
}
