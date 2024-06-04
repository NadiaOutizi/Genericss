package com.learningHibernateSpringBoot.Generics.Repositories;

import com.learningHibernateSpringBoot.Generics.Entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface Jpa<T extends BaseEntity,ID extends Serializable> extends JpaRepository<T,ID> {
}
