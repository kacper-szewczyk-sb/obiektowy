package dziedziczenie.zadanie_1;

import dziedziczenie.zadanie_1.races.CatRace;
import dziedziczenie.zadanie_1.races.DogRace;

import java.util.ArrayList;
import java.util.List;

public class AnimalPlayground {

    public static void main(String[] args) {
        showCatAndDog();

        System.out.println();

        showAnimalList();

    }

    private static void showAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Zwierz",5));
        animalList.add(new Cat("Tytus", 1, CatRace.DACHOWIEC));
        animalList.add(new Dog("Azor", 5, DogRace.CHART, "karmazynowa"));

        for (Animal animal: animalList) {
            System.out.println(animal.toString());
            animal.voice();
        }
    }

    private static void showCatAndDog() {
        Cat cat = new Cat("Tytus", 1, CatRace.DACHOWIEC);
        Dog dog = new Dog("Azor", 5, DogRace.CHART, "karmazynowa");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
