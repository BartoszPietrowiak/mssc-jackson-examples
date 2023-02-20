package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":1213213213,\"price\":\"12.99\",\"createdDate\":\"2023-02-20T12:57:42.765957276+01:00\",\"lastUpdatedDate\":\"2023-02-20T12:57:42.767645012+01:00\",\"myLocalDate\":\"20230220\",\"beerId\":\"64956a6b-18e5-49b2-a666-5d2e06f616b8\"}\n";
        BeerDto beer = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beer);
    }

}