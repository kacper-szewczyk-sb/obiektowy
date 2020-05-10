package lambda;

import java.util.Arrays;
import java.util.List;

public class StringConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
        printList(names, str -> System.out.println(str));
        System.out.println("--------Old school-------------");
        printList(names, new StringConsumer() {
            @Override
            public void consumeString(String str) {
                System.out.println(str);
            }
        });
    }

    public static void printList(List<String> list, StringConsumer consumer) {
        for (String str : list) {
            consumer.consumeString(str);
        }
    }
}
