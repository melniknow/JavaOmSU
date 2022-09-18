package file6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class ListDemoTest {

    @Test
    void getMaxAgeHumans() {
        var data = new ArrayList<Human>() {{
            add(new Human("", "", "", 10));
            add(new Human("", "", "", 11));
            add(new Human("", "", "", 12));
            add(new Human("other", "", "", 12));
            add(new Human("", "", "", 8));
        }};

        var res = new ArrayList<>(ListDemo.getMaxAgeHumans(data));
        Assertions.assertEquals(2, res.size());
        Assertions.assertEquals(12, res.get(0).getAge());
        Assertions.assertEquals(12, res.get(1).getAge());
    }

    @Test
    void getSetHumanWhoIdContainsInIntSet() {
        var map = new HashMap<Integer, Human>() {{
            put(1, new Human("", "", "", 11));
            put(2, new Human("", "", "", 12));
            put(3, new Human("", "", "", 13));
        }};

        var set = new HashSet<Integer>() {{
            add(3);
            add(0);
        }};

        var res = new ArrayList<>(ListDemo.getSetHumanWhoIdContainsInIntSet(map, set));

        Assertions.assertEquals(1, res.size());
        Assertions.assertEquals(13, res.get(0).getAge());
    }

    @Test
    void getListIdPeopleWhoAgeLess18() {
        var map = new HashMap<Integer, Human>() {{
            put(1, new Human("", "", "", 11));
            put(2, new Human("", "", "", 12));
            put(3, new Human("", "", "", 13));
            put(4, new Human("", "", "", 19));
            put(5, new Human("", "", "", 23));
            put(6, new Human("", "", "", 93));
        }};

        var list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};

        Assertions.assertEquals(list, ListDemo.getListIdPeopleWhoAgeLess18(map));
    }

    @Test
    void getMapFromIdToAge() {
        var map = new HashMap<Integer, Human>() {{
            put(1, new Human("", "", "", 11));
            put(2, new Human("", "", "", 12));
            put(3, new Human("", "", "", 13));
            put(4, new Human("", "", "", 19));
            put(5, new Human("", "", "", 23));
            put(6, new Human("", "", "", 93));
        }};

        var resMap = new HashMap<Integer, Integer>() {{
            put(1, 11);
            put(2, 12);
            put(3, 13);
            put(4, 19);
            put(5, 23);
            put(6, 93);
        }};

        Assertions.assertEquals(resMap, ListDemo.getMapFromIdToAge(map)); //{1=11, 2=12, 3=13, 4=19, 5=23, 6=93}
    }

    @Test
    void getMapFromAgeToListHuman() {
        var set = new HashSet<Human>() {{
            add(new Human("", "", "", 11));
            add(new Human("", "", "", 12));
            add(new Human("a", "", "", 12));
            add(new Human("b", "", "", 12));
            add(new Human("", "", "", 13));
            add(new Human("", "", "", 19));
            add(new Human("", "", "", 23));
            add(new Human("", "", "", 93));
        }};

        var res = ListDemo.getMapFromAgeToListHuman(set);

        Assertions.assertEquals(6, res.size());
        Assertions.assertEquals(3, res.get(12).size());
        Assertions.assertEquals(1, res.get(11).size());
    }
}