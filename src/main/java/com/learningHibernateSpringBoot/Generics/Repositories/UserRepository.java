package com.learningHibernateSpringBoot.Generics.Repositories;

import com.learningHibernateSpringBoot.Generics.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
