package file8;

import file6.Human;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {
    public static <T> int getClass_(ArrayList<T> data) {
        var res = 0;

        for (T t : data) {
            if (t instanceof Human) {
                res += 1;
            }
        }

        return res;
    }

    public static <T> List<String> getMethodNames(T obj) {
        return Arrays.stream(obj.getClass().getDeclaredMethods()).map(Method::getName).toList();
    }

    public static <T> List<String> getSuperClasses(T obj) {
        var result = new ArrayList<String>();
        var tempClass = obj.getClass().getSuperclass();
        while (tempClass != Object.class) {
            result.add(tempClass.getName());
            tempClass = tempClass.getSuperclass();
        }
        result.add("java.lang.Object");
        return result;
    }
}
