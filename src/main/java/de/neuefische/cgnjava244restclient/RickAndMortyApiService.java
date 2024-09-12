package de.neuefische.cgnjava244restclient;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RickAndMortyApiService {

    private final RestClient restClient;

    public RickAndMortyApiService(RestClient.Builder builder){
        this.restClient = builder.baseUrl("https://rickandmortyapi.com/api").build();
    }

    public List<RickAndMortyApiResponseResults> getAllCharacters(){
        RickAndMortyApiResponse response = this.restClient.get().uri("/character").retrieve().body(RickAndMortyApiResponse.class);
        assert response != null;
        return response.results();
    }

    /*public static void main(String[] args) {
        RestClient.Builder restClient1 = RestClient.builder();
        RickAndMortyApiService service = new RickAndMortyApiService(restClient1);

        service.getAllCharacters();
    }*/

}
