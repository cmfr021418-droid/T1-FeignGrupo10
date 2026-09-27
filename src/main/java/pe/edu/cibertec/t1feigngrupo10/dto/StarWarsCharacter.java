package pe.edu.cibertec.t1feigngrupo10.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacter {

    private String name;
    private String height;
    private String gender;
}
