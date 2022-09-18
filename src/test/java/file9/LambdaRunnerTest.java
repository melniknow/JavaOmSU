package file9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LambdaRunnerTest {

    @Test
    void LambdaDemoLambdas() {
        Assertions.assertEquals(2, LambdaRunner.run(LambdaDemo.getLength, "aa"));
        Assertions.assertEquals(0, LambdaRunner.run(LambdaDemo.getLength, ""));

        Assertions.assertEquals('A', LambdaRunner.run(LambdaDemo.getFirstSymbol, "Abc"));
        Assertions.assertEquals('b', LambdaRunner.run(LambdaDemo.getFirstSymbol, "bca"));

        Assertions.assertEquals(true, LambdaRunner.run(LambdaDemo.notContainsSpace, "bca"));
        Assertions.assertEquals(false, LambdaRunner.run(LambdaDemo.notContainsSpace, "bc a"));
        Assertions.assertEquals(true, LambdaRunner.run(LambdaDemo.notContainsSpace, ""));

        Assertions.assertEquals(3, LambdaRunner.run(LambdaDemo.replaceCount, "a,b,c"));
        Assertions.assertEquals(1, LambdaRunner.run(LambdaDemo.replaceCount, "a"));

        Assertions.assertEquals(10, LambdaRunner.run(LambdaDemo.getAge,
                new Human("", "", "", 10, Gender.MALE)));

        assertTrue(LambdaRunner.run(LambdaDemo.equalsLastName,
                new Human("f", "aaa", "a", 1, Gender.FEMALE),
                new Human("g", "aaa", "g", 10, Gender.MALE)));

        Assertions.assertEquals("aaa bbb ccc", LambdaRunner.run(LambdaDemo.getFullName,
                new Human("aaa", "bbb", "ccc", 10, Gender.MALE)));

        var human = new Human("", "", "", 10, Gender.MALE);
        Assertions.assertEquals(11, LambdaRunner.run(LambdaDemo.makeOldest, human).getAge());

        var listPerson = new ArrayList<Human>() {{
            add(new Human("f", "aaa", "a", 1, Gender.FEMALE));
            add(new Human("f", "aaa", "a", 10, Gender.FEMALE));
            add(new Human("f", "aaa", "a", 18, Gender.FEMALE));
        }};

        assertTrue(LambdaRunner.run(LambdaDemo.isYoungerMaxAge, listPerson, 19));
    }
}