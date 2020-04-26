package kolekcje;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SetTest {

    @Test
    public void removeDuplicatesTest() {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test");

        Assertions.assertEquals(1, ListDuplicates.removeDuplicates(list).size());
    }
}
