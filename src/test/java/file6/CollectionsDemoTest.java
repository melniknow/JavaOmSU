package file6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class CollectionsDemoTest {

    @Test
    void getCountStringsStartsWithChar() {
        var data = new ArrayList<String>() {{
            add("aaa");
            add("aab");
            add("bab");
            add("dbb");
        }};

        Assertions.assertEquals(2, CollectionsDemo.getCountStringsStartsWithChar(data, 'a'));
        Assertions.assertEquals(1, CollectionsDemo.getCountStringsStartsWithChar(data, 'b'));
        Assertions.assertEquals(0, CollectionsDemo.getCountStringsStartsWithChar(data, 'c'));
    }

    @Test
    void getListPeopleWhoLastNameEqualsWithPerson() {
        var human1 = new Human("name", "surname", "ppp", 10);
        var human2 = new Human("name", "surname2", "ppp", 10);
        var human3 = new Human("name", "surname3", "ppp", 10);

        var data = new ArrayList<Human>() {{
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname2", "ppp", 10));
        }};

        Assertions.assertEquals(3, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human1).size());
        Assertions.assertEquals(1, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human2).size());
        Assertions.assertEquals(0, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human3).size());
    }

    @Test
    void getListPeopleWithOutPerson() {
        var human = new Human("name", "surname", "ppp", 10);

        var data = new ArrayList<Human>() {{
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname2", "ppp", 10));
        }};

        var dataWithoutHuman = new ArrayList<Human>() {{
            add(new Human("name", "surname2", "ppp", 10));
        }};

        Assertions.assertEquals(dataWithoutHuman, CollectionsDemo.getListPeopleWithOutPerson(data, human));
    }

    @Test
    void getSetList() {
        var setList = new ArrayList<Set<Integer>>() {{
            add(new HashSet<>() {{
                add(1);
                add(2);
                add(3);
            }});
            add(new HashSet<>() {{
                add(3);
                add(4);
                add(5);
            }});
            add(new HashSet<>() {{
                add(7);
            }});
        }};

        var set = new HashSet<Integer>() {{
            add(3);
        }};

        var res = CollectionsDemo.getSetList(setList, set);

        Assertions.assertEquals(2, res.size());
        Assertions.assertEquals(3, res.get(0).size());
        Assertions.assertEquals(3, res.get(1).size());
    }

    @Test
    void getIntersection() {
        var set1 = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        var set2 = new HashSet<Integer>() {{
            add(5);
            add(6);
            add(3);
            add(4);
        }};

        var intersection = new HashSet<Integer>() {{
            add(3);
            add(4);
        }};

        Assertions.assertEquals(intersection, CollectionsDemo.getIntersection(set1, set2));
    }
}