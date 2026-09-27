package pe.edu.cibertec.t1feigngrupo10.service;

import org.junit.jupiter.api.Test;
import pe.edu.cibertec.t1feigngrupo10.client.SwapiClient;
import pe.edu.cibertec.t1feigngrupo10.dto.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo10.dto.SwapiPeopleResponse;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StarWarsServiceTests {

    @Test
    void shouldReturnOnlyFemaleCharactersTallerThan160() {
        SwapiClient swapiClient = mock(SwapiClient.class);
        SwapiPeopleResponse response = new SwapiPeopleResponse();
        StarWarsCharacter leia = character("Leia Organa", "150", "female");
        StarWarsCharacter beru = character("Beru Whitesun lars", "165", "female");
        StarWarsCharacter luke = character("Luke Skywalker", "172", "male");
        StarWarsCharacter unknownHeight = character("Unknown", "unknown", "female");
        StarWarsCharacter exactly160 = character("Exactly 160", "160", "female");
        response.setResults(List.of(leia, beru, luke, unknownHeight, exactly160));
        when(swapiClient.getPeople()).thenReturn(response);

        StarWarsService service = new StarWarsService(swapiClient);

        assertThat(service.getFemaleCharactersTallerThan160())
                .containsExactly(beru);
    }

    private StarWarsCharacter character(String name, String height, String gender) {
        StarWarsCharacter character = new StarWarsCharacter();
        character.setName(name);
        character.setHeight(height);
        character.setGender(gender);
        return character;
    }
}
