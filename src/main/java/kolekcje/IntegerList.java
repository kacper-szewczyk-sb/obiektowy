package kolekcje;

import java.util.LinkedList;
import java.util.Random;

public class IntegerList {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        populateList(integerLinkedList);
        
        System.out.println("Przed usunięciem");
        showList(integerLinkedList);
        removeOdd(integerLinkedList);

        System.out.println("Po usunięciu");
        showList(integerLinkedList);

    }

    private static void removeOdd(LinkedList<Integer> integerLinkedList) {
        for (int i = 0; i < integerLinkedList.size();) {
            if (integerLinkedList.get(i) % 2 == 0) {
                integerLinkedList.remove(i);
            }
            else {
                i++;
            }
        }
    }

    private static void showList(LinkedList<Integer> integerLinkedList) {
        for (Integer value: integerLinkedList) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void populateList(LinkedList<Integer> integerLinkedList) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            integerLinkedList.add(rand.nextInt(11));
        }
    }
}
