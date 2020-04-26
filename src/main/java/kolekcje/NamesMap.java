package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class NamesMap {

    public static void main(String[] args) {
        Map<Long, String> namesMap = new HashMap<>();
        populateMap(namesMap);
        printAllNames(namesMap);

        getNamesStartingAt(namesMap, "a");
    }

    private static void getNamesStartingAt(Map<Long, String> namesMap, String startingPhrase) {
        for (String name : namesMap.values()) {
            if (name.toLowerCase().startsWith(startingPhrase)) {
                System.out.print(name + " ");
            }
        }
    }

    private static void populateMap(Map<Long, String> namesMap) {
        namesMap.put(1L, "Andrzej");
        namesMap.put(2L, "Anna");
        namesMap.put(3L, "Antoni");
        namesMap.put(4L, "Henryk");
        namesMap.put(5L, "Elżbieta");
    }

    private static void printAllNames(Map<Long, String> namesMap) {
        for (String name : namesMap.values()) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("------------------------");
    }
}
