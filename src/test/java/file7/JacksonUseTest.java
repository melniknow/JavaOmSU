package file7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class JacksonUseTest {

    @Test
    void serializeAndDeserializePerson() {
        var flatList = new ArrayList<Flat>() {{
            add(new Flat(1, 10, new ArrayList<>() {{
                add(new Person("name", "l_name", "p", new Date()));
            }}));
        }};

        var house = new House("1", "some_adr", new Person("name", "l_name", "p", new Date()), flatList);

        assertEquals(house, JacksonUse.deserializePerson(JacksonUse.serializePerson(house)));
    }
}