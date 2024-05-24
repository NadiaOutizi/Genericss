package com.learningHibernateSpringBoot.Generics.Controllers;
import com.learningHibernateSpringBoot.Generics.Entities.Experience;
import com.learningHibernateSpringBoot.Generics.Services.GenericService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    @Autowired
    private GenericService<Experience, Long> experienceService;

    @PostMapping("/create")
    public Experience createExperience(@RequestBody Experience experience) {
        return experienceService.save(experience);
    }

    @GetMapping("/all")
    public List<Experience> getAllExperiences() {
        return experienceService.findAll();
    }

    @GetMapping("/{id}")
    public Experience getExperienceById(@PathVariable Long id) {
        return experienceService.findById(id);
    }

    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        experience.setId(id);
        return experienceService.save(experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.delete(id);
    }
}
