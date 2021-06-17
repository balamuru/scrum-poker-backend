package org.vgb.scrumpoker.data;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"person_id", "issue_id"})})
public class IssueRatingData {

    @EmbeddedId
    IssueRatingKey issueRatingKey;

    @ManyToOne (cascade = CascadeType.ALL )
    @MapsId("personId")
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne (cascade = CascadeType.ALL)
    @MapsId("issueId")
    @JoinColumn(name = "issue_id")
    private Issue issue;

    private float rating;

    public IssueRatingData() {
    }

    public IssueRatingData(Person person, Issue issue, float rating) {

        this(new IssueRatingKey(person.getId(), issue.getId()), person, issue, rating);
    }

    private IssueRatingData(IssueRatingKey issueRatingKey, Person person, Issue issue, float rating) {
        this.issueRatingKey = issueRatingKey;
        this.person = person;
        this.issue = issue;
        this.rating = rating;
    }

    public IssueRatingKey getIssueRatingKey() {
        return issueRatingKey;
    }

    public void setIssueRatingKey(IssueRatingKey issueRatingKey) {
        this.issueRatingKey = issueRatingKey;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "IssueRatingData{" +
                "issueRatingKey=" + issueRatingKey +
                ", person=" + person +
                ", issue=" + issue +
                ", rating=" + rating +
                '}';
    }
}
