package file7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUse {
    public static House deserializePerson(String json) {
        try {
            return new ObjectMapper().readValue(json, House.class);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }

    public static String serializePerson(House house) {
        try {
            return new ObjectMapper().writeValueAsString(house);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }
}
