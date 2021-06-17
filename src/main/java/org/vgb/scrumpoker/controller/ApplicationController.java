package org.vgb.scrumpoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.repository.IssueRatingDataRepository;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApplicationController {


    @Autowired
    private IssueRatingDataRepository issueRatingDataRepository;

    @CrossOrigin
    @GetMapping(value = "/issueratings/issue/{issueId}")
    public List<IssueRatingData> getIssueRatings(@PathVariable("issueId") Long issueId) {
        return issueRatingDataRepository.findByIssueId(issueId);
    }
    @CrossOrigin
    @GetMapping(value = "/issueratings")
    public List<IssueRatingData> getIssueRatings() {
        return issueRatingDataRepository.findAllByOrderByIssueIdAsc();
    }

}
