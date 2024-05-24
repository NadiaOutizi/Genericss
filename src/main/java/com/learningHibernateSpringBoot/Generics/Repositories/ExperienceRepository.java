package com.learningHibernateSpringBoot.Generics.Repositories;

import com.learningHibernateSpringBoot.Generics.Entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}
