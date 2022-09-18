package file7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HouseServiceTest {
    @Test
    void serializeAndDeserializeHouse() {
        var filename = "house.data";
        var house = new House("1", "some_adr", new Person("name", "l_name", "p", new Date()), new ArrayList<>());

        HouseService.serializeHouse(house, filename);
        assertEquals(house, HouseService.deserializeHouse(filename));
    }
}