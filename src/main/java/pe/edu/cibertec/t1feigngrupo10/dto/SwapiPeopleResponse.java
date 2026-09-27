package pe.edu.cibertec.t1feigngrupo10.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapiPeopleResponse {

    private Integer count;
    private String next;
    private String previous;
    private List<StarWarsCharacter> results;
}
