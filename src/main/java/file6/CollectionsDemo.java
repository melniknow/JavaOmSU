package file6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsDemo {
    public static int getCountStringsStartsWithChar(ArrayList<String> dataSet, Character start) {
        var result = 0;

        for (String s : dataSet) {
            if (s.startsWith(String.valueOf(start))) {
                result += 1;
            }
        }

        return result;
    }

    public static ArrayList<Human> getListPeopleWhoLastNameEqualsWithPerson(ArrayList<Human> dataSet, Human person) {
        var res = new ArrayList<Human>();
        for (Human human : dataSet) {
            if (human.getLastName().equals(person.getLastName())) {
                res.add(human);
            }
        }

        return res;
    }

    public static ArrayList<Human> getListPeopleWithOutPerson(ArrayList<Human> dataSet, Human person) {
        var res = new ArrayList<Human>();
        for (Human human : dataSet) {
            if (!human.equals(person)) {
                res.add(human);
            }
        }

        return res;
    }

    public static ArrayList<HashSet<Integer>> getSetList(ArrayList<HashSet<Integer>> listSet, HashSet<Integer> set) {
        var res = new ArrayList<HashSet<Integer>>();
        for (HashSet<Integer> integers : listSet) {
            integers.retainAll(set); // удаляет элементы, не принадлежащие переданной коллекции
            if (!integers.isEmpty()) {
                res.add(integers);
            }
        }
        return res;
    }

    public static <T extends Human> HashSet<T> getMaxAgeHumans(ArrayList<T> humans) {
        var res = new HashSet<T>();
        var maxAge = -1;

        for (T human : humans) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }
        }

        for (T human : humans) {
            if (human.getAge() == maxAge) {
                res.add(human);
            }
        }

        return res;
    }

    public static <T extends Human> HashSet<T> task7(Map<Integer, T> dataSet, HashSet<Integer> intSet) {
        var result = new HashSet<T>();

        for (Integer integer : dataSet.keySet()) {
            if (intSet.contains(integer)) {
                result.add(dataSet.get(integer));
            }
        }

        return result;
    }

    public static <T extends Human> ArrayList<Integer> task8(Map<Integer, T> dataSet) {
        var result = new ArrayList<Integer>();

        for (Integer integer : dataSet.keySet()) {
            if (dataSet.get(integer).getAge() <= 18) {
                result.add(integer);
            }
        }

        return result;
    }

    public static <T extends Human> Map<Integer, Integer> task9(Map<Integer, T> dataSet) {
        var result = new HashMap<Integer, Integer>();

        for (Integer integer : dataSet.keySet()) {
            result.put(integer, dataSet.get(integer).getAge());
        }

        return result;
    }

    public static <T extends Human> Map<Integer, ArrayList<T>> task10(HashSet<T> dataSet) {
        var result = new HashMap<Integer, ArrayList<T>>();

        // По множеству объектов типа Human постройте отображение,
        // которое целому числу (возраст человека) сопоставляет список всех людей данного возраста из входного множества.

        for (T t : dataSet) {
            if (result.containsKey(t.getAge())) {
                result.get(t.getAge()).add(t);
            } else {
                var temp = new ArrayList<T>();
                temp.add(t);
                result.put(t.getAge(), temp);
            }
        }

        return result;
    }
}
