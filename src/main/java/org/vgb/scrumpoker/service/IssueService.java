package org.vgb.scrumpoker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.repository.IssueRatingDataRepository;

import java.util.List;

@Service
public class IssueService {
    @Autowired
    IssueRatingDataRepository issueRatingDataRepository;


    public List<IssueRatingData> getIssueRatingDataByIssueId(Long issueId) {
        return issueRatingDataRepository.findByIssueId(issueId);
    }

}
