package com.learningHibernateSpringBoot.Generics.Services;

import com.learningHibernateSpringBoot.Generics.Entities.CV;
import com.learningHibernateSpringBoot.Generics.Repositories.CVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CVServiceImpl implements GenericService<CV, Long> {

    private final CVRepository cvRepository;

    @Autowired
    public CVServiceImpl(CVRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    @Override
    public CV save(CV entity) {
        return cvRepository.save(entity);
    }

    @Override
    public List<CV> findAll() {
        return cvRepository.findAll();
    }

    @Override
    public CV findById(Long id) {
        Optional<CV> cv = cvRepository.findById(id);
        return cv.orElse(null);
    }

    @Override
    public void delete(Long id) {
        cvRepository.deleteById(id);
    }
}
