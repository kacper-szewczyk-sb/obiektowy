package kolekcje;

import java.util.*;

public class ListDuplicates {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        populateList(wordList);
        showList(wordList);
        List<String> withoutDuplicates = removeDuplicates(wordList);
        showList(withoutDuplicates);

    }

    private static void showList(List<String> list) {
        for (String word: list) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("------------------------");
    }

    public static List<String> removeDuplicates(List<String> wordList) {
        Set<String> wordSet = new LinkedHashSet<>(wordList);
        List<String> withoutDuplicates = new ArrayList<>();
        for (String word: wordSet) {
            withoutDuplicates.add(word);
        }
        return withoutDuplicates;
    }
    private static void populateList(List<String> wordList) {
        wordList.add("test");
        wordList.add("test1");
        wordList.add("test");
        wordList.add("test2");
        wordList.add("test");
        wordList.add("test321321");
        wordList.add("test");
        wordList.add("test313");
        wordList.add("test");
        wordList.add("test1221");
        wordList.add("test2");
    }
}
