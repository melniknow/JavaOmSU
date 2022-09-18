package file6;

import java.util.*;

public class CollectionsDemo {
    public static int getCountStringsStartsWithChar(List<String> dataSet, Character start) {
        return (int) dataSet.stream().filter(n -> n.startsWith(String.valueOf(start))).count();
    }

    public static List<Human> getListPeopleWhoLastNameEqualsWithPerson(List<Human> dataSet, Human person) {
        return dataSet.stream().filter(n -> n.getLastName().equals(person.getLastName())).toList();
    }

    public static List<Human> getListPeopleWithOutPerson(List<Human> dataSet, Human person) {
        return dataSet.stream().filter(n -> !n.equals(person)).toList();
    }

    public static List<Set<Integer>> getSetList(List<Set<Integer>> listSet, Set<Integer> set) {
        return listSet.stream().filter(n -> !getIntersection(n, set).isEmpty()).toList();
    }

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        var temp = new HashSet<>(set1);
        temp.retainAll(set2);
        return temp;
    }
}
