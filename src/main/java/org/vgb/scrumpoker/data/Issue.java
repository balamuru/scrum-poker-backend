package org.vgb.scrumpoker.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity public class Issue implements Serializable
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(unique = true) private String name;

    public Issue()
    {

    }

    public Issue(final Long id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

}
