package org.vgb.scrumpoker.data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity public class Person implements Serializable
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column(unique = true) private String name;



    public Person()
    {
    }

    public Person(final Long id, final String name)
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
