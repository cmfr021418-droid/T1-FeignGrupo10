package pe.edu.cibertec.t1feigngrupo10.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo10.client.SwapiClient;
import pe.edu.cibertec.t1feigngrupo10.dto.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo10.dto.SwapiPeopleResponse;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StarWarsService {

    private static final int MINIMUM_HEIGHT_CM = 160;
    private static final String FEMALE_GENDER = "female";

    private final SwapiClient swapiClient;

    public StarWarsService(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    public List<StarWarsCharacter> getFemaleCharactersTallerThan160() {
        return Optional.ofNullable(swapiClient.getPeople())
                .map(SwapiPeopleResponse::getResults)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(this::isFemale)
                .filter(this::isTallerThanMinimumHeight)
                .toList();
    }

    private boolean isFemale(StarWarsCharacter character) {
        return character != null
                && FEMALE_GENDER.equalsIgnoreCase(character.getGender());
    }

    private boolean isTallerThanMinimumHeight(StarWarsCharacter character) {
        return parseHeight(character.getHeight()) > MINIMUM_HEIGHT_CM;
    }

    private int parseHeight(String height) {
        if (height == null || height.isBlank()) {
            return 0;
        }

        try {
            return Integer.parseInt(height.trim());
        } catch (NumberFormatException _) {
            return 0;
        }
    }
}