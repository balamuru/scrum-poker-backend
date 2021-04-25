package org.vgb.scrumpoker.data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable public class IssueRatingKey implements Serializable
{
    private Long personId;
    private Long issueId;

    public IssueRatingKey()
    {
    }

 
    public Long getPersonId()
    {
        return personId;
    }

    public void setPersonId(final Long personId)
    {
        this.personId = personId;
    }

    public Long getIssueId()
    {
        return issueId;
    }

    public void setIssueId(final Long issueId)
    {
        this.issueId = issueId;
    }

    @Override public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof IssueRatingKey))
        {
            return false;
        }

        final IssueRatingKey that = (IssueRatingKey) o;

        if (!personId.equals(that.personId))
        {
            return false;
        }
        return issueId.equals(that.issueId);
    }

    @Override public int hashCode()
    {
        int result = personId.hashCode();
        result = 31 * result + issueId.hashCode();
        return result;
    }
}
