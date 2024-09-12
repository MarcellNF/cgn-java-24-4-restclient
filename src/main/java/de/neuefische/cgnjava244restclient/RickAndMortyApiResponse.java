package de.neuefische.cgnjava244restclient;

import java.util.List;

public record RickAndMortyApiResponse(
        List<RickAndMortyApiResponseResults> results
) {
}
