package org.vgb.scrumpoker.data;

import javax.persistence.*;

@Entity
public class IssueRatingData {

    @EmbeddedId
    IssueRatingKey issueRatingKey;

    @ManyToOne
    @MapsId("personId")
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @MapsId("issueId")
    @JoinColumn(name = "issue_id")

    private Issue issue;

    private int rating;

    public IssueRatingData() {
    }

    public IssueRatingData(Person person, Issue issue, int rating) {

        this(new IssueRatingKey(person.getId(), issue.getId()), person, issue, rating);
    }

    private IssueRatingData(IssueRatingKey issueRatingKey, Person person, Issue issue, int rating) {
        this.issueRatingKey = issueRatingKey;
        this.person = person;
        this.issue = issue;
        this.rating = rating;
    }

    public IssueRatingKey getIssueRatingKey() {
        return issueRatingKey;
    }

    public Person getPerson() {
        return person;
    }

    public Issue getIssue() {
        return issue;
    }

    public int getRating() {
        return rating;
    }

    public void setIssueRatingKey(IssueRatingKey issueRatingKey) {
        this.issueRatingKey = issueRatingKey;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
