package com.learningHibernateSpringBoot.Generics.Entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class CV extends BaseEntity {

    private String title;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "cv_competence",
            joinColumns = @JoinColumn(name = "cv_id"),
            inverseJoinColumns = @JoinColumn(name = "competence_id")
    )
    private List<Competence> competences;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }
}
