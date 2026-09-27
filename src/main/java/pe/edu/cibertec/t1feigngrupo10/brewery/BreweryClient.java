package pe.edu.cibertec.t1feigngrupo10.brewery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "breweryClient", url = "https://api.openbrewerydb.org")
public interface BreweryClient {

    @GetMapping("/v1/breweries")
    List<BreweryData> getAllBreweries();
}