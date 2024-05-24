package com.learningHibernateSpringBoot.Generics.Controllers;

import com.learningHibernateSpringBoot.Generics.Entities.CV;
import com.learningHibernateSpringBoot.Generics.Services.GenericService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/cvs")
public class CVController {

    @Autowired
    private GenericService<CV, Long> cvService;

    @PostMapping("/create")
    public CV createCV(@RequestBody CV cv) {
        return cvService.save(cv);
    }

    @GetMapping("/all")
    public List<CV> getAllCVs() {
        return cvService.findAll();
    }

    @GetMapping("/{id}")
    public CV getCVById(@PathVariable Long id) {
        return cvService.findById(id);
    }

    @PutMapping("/{id}")
    public CV updateCV(@PathVariable Long id, @RequestBody CV cv) {
        cv.setId(id);
        return cvService.save(cv);
    }

    @DeleteMapping("/{id}")
    public void deleteCV(@PathVariable Long id) {
        cvService.delete(id);
    }
}