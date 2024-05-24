package com.learningHibernateSpringBoot.Generics.Entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Competence{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skill;
    private int proficiency;
    @ManyToMany(mappedBy = "competences")
    private List<CV> cvs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getProficiency() {
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }
}