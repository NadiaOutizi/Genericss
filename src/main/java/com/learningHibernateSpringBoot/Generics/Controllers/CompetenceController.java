package com.learningHibernateSpringBoot.Generics.Controllers;
import com.learningHibernateSpringBoot.Generics.Entities.Competence;
import com.learningHibernateSpringBoot.Generics.Services.GenericService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@Controller
@RestController
@RequestMapping("/competences")
public class CompetenceController {

    @Autowired
    private GenericService<Competence, Long> competenceService;

    @PostMapping("/create")
    public Competence createCompetence(@RequestBody Competence competence) {
        return competenceService.save(competence);
    }

    @GetMapping("/all")
    public List<Competence> getAllCompetences() {
        return competenceService.findAll();
    }

    @GetMapping("/{id}")
    public Competence getCompetenceById(@PathVariable Long id) {
        return competenceService.findById(id);
    }

    @PutMapping("/{id}")
    public Competence updateCompetence(@PathVariable Long id, @RequestBody Competence competence) {
        competence.setId(id);
        return competenceService.save(competence);
    }

    @DeleteMapping("/{id}")
    public void deleteCompetence(@PathVariable Long id) {
        competenceService.delete(id);
    }
}