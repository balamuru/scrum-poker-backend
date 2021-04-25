package org.vgb.scrumpoker.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity @IdClass(IssueRatingKey.class) public class IssueRating implements Serializable
{

    @Id private Long personId;

    @Id private Long issueId;

    private int rating;

    public IssueRating()
    {
    }

    public IssueRating(final Long personId, final Long issueId, final int rating)
    {
        this.personId = personId;
        this.issueId = issueId;
        this.rating = rating;
    }

    public Long getPersonId()
    {
        return personId;
    }

    public void setPersonId(final Long nameId)
    {
        this.personId = nameId;
    }

    public Long getIssueId()
    {
        return issueId;
    }

    public void setIssueId(final Long issueId)
    {
        this.issueId = issueId;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(final int rating)
    {
        this.rating = rating;
    }

    @Override public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof IssueRating))
        {
            return false;
        }

        final IssueRating that = (IssueRating) o;

        if (getRating() != that.getRating())
        {
            return false;
        }
        if (getPersonId() != null ? !getPersonId().equals(that.getPersonId()) : that.getPersonId() != null)
        {
            return false;
        }
        return getIssueId() != null ? getIssueId().equals(that.getIssueId()) : that.getIssueId() == null;
    }

    @Override public int hashCode()
    {
        int result = getPersonId() != null ? getPersonId().hashCode() : 0;
        result = 31 * result + (getIssueId() != null ? getIssueId().hashCode() : 0);
        result = 31 * result + getRating();
        return result;
    }

    @Override public String toString()
    {
        return "IssueRating{" + "personId=" + personId + ", issueId=" + issueId + ", rating=" + rating + '}';
    }
}
