package com.learningHibernateSpringBoot.Generics.Services;

import com.learningHibernateSpringBoot.Generics.Entities.Competence;
import com.learningHibernateSpringBoot.Generics.Repositories.CompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CompetenceServiceImpl implements GenericService<Competence, Long> {

    private final CompetenceRepository competenceRepository;

    @Autowired
    public CompetenceServiceImpl(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    @Override
    public Competence save(Competence entity) {
        return competenceRepository.save(entity);
    }

    @Override
    public List<Competence> findAll() {
        return competenceRepository.findAll();
    }

    @Override
    public Competence findById(Long id) {
        Optional<Competence> competence = competenceRepository.findById(id);
        return competence.orElse(null);
    }

    @Override
    public void delete(Long id) {
        competenceRepository.deleteById(id);
    }
}