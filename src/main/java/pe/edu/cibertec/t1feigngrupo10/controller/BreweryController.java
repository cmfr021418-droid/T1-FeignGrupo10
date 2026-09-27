package pe.edu.cibertec.t1feigngrupo10.controller;

import pe.edu.cibertec.t1feigngrupo10.brewery.BreweryData;
import pe.edu.cibertec.t1feigngrupo10.brewery.BreweryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreweryController {

    private final BreweryService breweryService;

    public BreweryController(BreweryService breweryService) {
        this.breweryService = breweryService;
    }

    @GetMapping("/api/breweries/micro-california")
    public List<BreweryData> getMicroBreweriesCalifornia() {
        return breweryService.getMicroBreweriesInCalifornia();
    }
}
