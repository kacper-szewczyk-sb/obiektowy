package kolekcje;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NamesMap {

    public static void main(String[] args) {
        Map<Long, String> namesMap = new HashMap<>();
        populateMap(namesMap);
        printAllNames(namesMap);

        getNamesStartingAt(namesMap, "a");
        getIndexesWithName(namesMap, "Jan");
    }

    private static void getNamesStartingAt(Map<Long,
            String> namesMap, String startingPhrase) {
        for (String name : namesMap.values()) {
            if (name.toLowerCase().startsWith(startingPhrase)) {
                System.out.print(name + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------");
    }

    private static void getIndexesWithName(Map<Long,
            String> namesMap, String name) {
        Iterator<Map.Entry<Long, String>> namesIterator =
                namesMap.entrySet().iterator();
        while (namesIterator.hasNext()) {
            Map.Entry<Long, String> nameEntry = namesIterator.next();
            if (name.equals(nameEntry.getValue())) {
                System.out.print(nameEntry.getKey() + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------");
    }

    private static void populateMap(Map<Long, String> namesMap) {
        namesMap.put(1L, "Andrzej");
        namesMap.put(2L, "Anna");
        namesMap.put(3L, "Antoni");
        namesMap.put(4L, "Henryk");
        namesMap.put(5L, "Elżbieta");
        namesMap.put(6L, "Jan");
        namesMap.put(7L, "Jan");
        namesMap.put(8L, "Jan");
        namesMap.put(9L, "Jan");
        namesMap.put(10L, "Jan");
    }

    private static void printAllNames(Map<Long, String> namesMap) {
        for (String name : namesMap.values()) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("------------------------");
    }
}
