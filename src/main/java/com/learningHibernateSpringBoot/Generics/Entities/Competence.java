package com.learningHibernateSpringBoot.Generics.Entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Competence extends BaseEntity {

    private String skill;
    private int proficiency;
    @ManyToMany(mappedBy = "competences")
    private List<CV> cvs;

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

    public List<CV> getCvs() {
        return cvs;
    }

    public void setCvs(List<CV> cvs) {
        this.cvs = cvs;
    }
}
