package de.neuefische.cgnjava244restclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class RickAndMortyController {

    private final RickAndMortyApiService rickAndMortyApiService;

    public RickAndMortyController(RickAndMortyApiService rickAndMortyApiService) {
        this.rickAndMortyApiService = rickAndMortyApiService;
    }

    @GetMapping
    public List<RickAndMortyApiResponseResults> getAllCharacters() {
        return rickAndMortyApiService.getAllCharacters();
    }

}
