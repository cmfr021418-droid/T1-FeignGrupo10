package pe.edu.cibertec.t1feigngrupo10.brewery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BreweryData {

    private String id;
    private String name;
    private String brewery_type;
    private String state;

}
