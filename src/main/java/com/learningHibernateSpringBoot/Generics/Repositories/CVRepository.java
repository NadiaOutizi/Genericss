package com.learningHibernateSpringBoot.Generics.Repositories;

import com.learningHibernateSpringBoot.Generics.Entities.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepository extends JpaRepository<CV, Long> {
}