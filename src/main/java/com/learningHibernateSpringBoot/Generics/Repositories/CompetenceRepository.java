package com.learningHibernateSpringBoot.Generics.Repositories;

import com.learningHibernateSpringBoot.Generics.Entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetenceRepository extends JpaRepository<Competence,Long> {
}
