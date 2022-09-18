package file8;

import file6.Human;
import file6.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ReflectionDemoTest {

    @Test
    void getClass_() {
        var data = new ArrayList<>() {{
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(666);
            add("some_text");
            add(new Student("", "", "", 1, ""));
        }};
        Assertions.assertEquals(5, ReflectionDemo.getClass_(data));

        data.clear();
        Assertions.assertEquals(0, ReflectionDemo.getClass_(data));
    }

    @Test
    void getMethodNames() {
        Assertions.assertEquals(10, ReflectionDemo.getMethodNames(new Human("", "", "", 0)).size());
        Assertions.assertEquals(4, ReflectionDemo.getMethodNames(new Student("", "", "", 1, "")).size());
        Assertions.assertEquals(141, ReflectionDemo.getMethodNames("").size());
        Assertions.assertEquals(59, ReflectionDemo.getMethodNames(1).size());
    }

    @Test
    void getSuperClasses() {
        var classesForHuman = new ArrayList<String>() {{
            add("file6.Human");
            add("java.lang.Object");
        }};

        var classesForStudent = new ArrayList<String>() {{
            add("file6.Student");
            add("file6.Human");
            add("java.lang.Object");
        }};

        Assertions.assertEquals(classesForHuman, ReflectionDemo.getSuperClasses(new Human("", "", "", 0)));
        Assertions.assertEquals(classesForStudent, ReflectionDemo.getSuperClasses(new Student("", "", "", 1, "")));
    }
}