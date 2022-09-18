package file8;

import file6.Human;
import file6.Student;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {
    public static <T> int getClass_(List<T> data) {
        return (int) data.stream().filter(n -> n instanceof Human).count();
    }

    public static <T> List<String> getMethodNames(T obj) {
        return Arrays.stream(obj.getClass().getDeclaredMethods()).map(Method::getName).toList();
    }

    public static <T> List<String> getSuperClasses(T obj) {
        var listClasses = new ArrayList<String>();
        var class_ = obj.getClass();

        while (class_ != null) {
            listClasses.add(class_.getName());
            class_ = class_.getSuperclass();
        }
        return listClasses;
    }
}
