package org.vgb.scrumpoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vgb.scrumpoker.data.IssueRatingData;
import org.vgb.scrumpoker.service.IssueService;

import java.util.List;

@RestController
public class ApplicationController {
    @Autowired
    private IssueService issueService;


    @GetMapping(value = "/issueratings/{issueId}")
    public List<IssueRatingData> getStuff(@PathVariable("issueId") Long issueId) {
        return issueService.getIssueRatingDataByIssueId(issueId);
    }
}
