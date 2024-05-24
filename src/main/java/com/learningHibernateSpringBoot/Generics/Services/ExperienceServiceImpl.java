package com.learningHibernateSpringBoot.Generics.Services;

import com.learningHibernateSpringBoot.Generics.Entities.Experience;
import com.learningHibernateSpringBoot.Generics.Repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements GenericService<Experience, Long> {

    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public Experience save(Experience entity) {
        return experienceRepository.save(entity);
    }

    @Override
    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience findById(Long id) {
        Optional<Experience> experience = experienceRepository.findById(id);
        return experience.orElse(null);
    }

    @Override
    public void delete(Long id) {
        experienceRepository.deleteById(id);
    }
}