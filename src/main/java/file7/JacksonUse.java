package file7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUse {
    public static House deserializePerson(String json) throws IOException {
        return new ObjectMapper().readValue(json, House.class);
    }

    public static String serializePerson(House house) throws IOException {
        return new ObjectMapper().writeValueAsString(house);
    }
}
