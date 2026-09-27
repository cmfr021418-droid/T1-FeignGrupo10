package pe.edu.cibertec.t1feigngrupo10.brewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@SpringBootApplication
public class BreweryService {

    private final BreweryClient breweryClient;

    public BreweryService(BreweryClient breweryClient) {
        this.breweryClient = breweryClient;
    }

    public List<BreweryData> getMicroBreweriesInCalifornia() {
        return breweryClient.getAllBreweries().stream()
                .filter(b -> "micro".equalsIgnoreCase(b.getBrewery_type()))
                .filter(b -> "California".equalsIgnoreCase(b.getState()))
                .collect(Collectors.toList());
    }

}
