package com.learningHibernateSpringBoot.Generics.Services;

import com.learningHibernateSpringBoot.Generics.Entities.BaseEntity;
import com.learningHibernateSpringBoot.Generics.Repositories.Jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class GenericServiceImpl<T extends BaseEntity, ID extends Serializable> implements GenericService<T,ID> {
    private final Jpa<T, ID> repository;

    @Autowired
    public GenericServiceImpl(Jpa<T, ID> repository) {
        this.repository = repository;
    }


    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(ID id) {
     repository.deleteById(id);
    }
}
