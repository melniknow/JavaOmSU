package file6;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {
    public static <T extends Human> Set<T> getMaxAgeHumans(List<T> humans) {
        var res = new HashSet<T>();
        var maxAge = -1;

        for (T human : humans) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
                res.clear();
            }
            if (human.getAge() == maxAge) res.add(human);
        }

        return res;
    }

    public static <T extends Human> Set<T> getSetHumanWhoIdContainsInIntSet(Map<Integer, T> dataSet, Set<Integer> intSet) {
        return dataSet.keySet().stream().filter(intSet::contains).map(dataSet::get).collect(Collectors.toSet());
    }

    public static <T extends Human> List<Integer> getListIdPeopleWhoAgeLess18(Map<Integer, T> dataSet) {
        var result = new ArrayList<Integer>();

        for (Integer integer : dataSet.keySet())
            if (dataSet.get(integer).getAge() <= 18) result.add(integer);

        return result;
    }

    public static <T extends Human> Map<Integer, Integer> getMapFromIdToAge(Map<Integer, T> dataSet) {
        var result = new HashMap<Integer, Integer>();

        for (Integer integer : dataSet.keySet())
            result.put(integer, dataSet.get(integer).getAge());


        return result;
    }

    public static <T extends Human> Map<Integer, ArrayList<T>> getMapFromAgeToListHuman(Set<T> dataSet) {
        var hashMap = new HashMap<Integer, ArrayList<T>>();

        for (T human : dataSet) {
            if (hashMap.containsKey(human.getAge())) hashMap.get(human.getAge()).add(human);
            else hashMap.put(human.getAge(),
                    new ArrayList<>() {{
                        add(human);
                    }});
        }

        return hashMap;
    }
}
