package lambda.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Katarzyna", "Ania", "Zosia", "Bartek");

        List<String> namesShorterThan6 = names.stream().filter((name) -> {
            return name.length() < 6;
        }).collect(Collectors.toList());

        namesShorterThan6.forEach((name) -> {
            System.out.println(name);
        });


        // Bez przypisywania
        names.stream().filter((name) -> {
            return name.length() < 6;
        }).forEach((name) -> {
            System.out.println(name);
        });
    }
}
