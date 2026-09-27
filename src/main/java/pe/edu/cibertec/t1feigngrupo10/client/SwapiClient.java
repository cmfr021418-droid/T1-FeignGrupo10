package pe.edu.cibertec.t1feigngrupo10.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo10.dto.SwapiPeopleResponse;

@FeignClient(name = "swapi-client", url = "${swapi.base-url}")
public interface SwapiClient {

    @GetMapping("/people/")
    SwapiPeopleResponse getPeople();
}
