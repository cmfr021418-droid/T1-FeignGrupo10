package pe.edu.cibertec.t1feigngrupo10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo10.dto.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo10.service.StarWarsService;

import java.util.List;

@RestController
@RequestMapping("/api/star-wars")
public class StarWarsController {

    private final StarWarsService starWarsService;

    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/characters/female-taller-than-160")
    public List<StarWarsCharacter> getFemaleCharactersTallerThan160() {
        return starWarsService.getFemaleCharactersTallerThan160();
    }
}
