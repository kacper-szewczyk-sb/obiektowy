package dziedziczenie.zadanie_1;

import dziedziczenie.zadanie_1.races.DogRace;

public class Dog extends Animal {

    private DogRace race;
    private String color;

    public Dog(String name, int age, DogRace race, String color) {
        super(name, age);
        this.race = race;
        this.color = color;
    }


    public DogRace getRace() {
        return race;
    }

    public void setRace(DogRace race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "race=" + race +
                "color=" + color;
    }

    @Override
    public void voice() {
        System.out.println("Hau hau");
    }
}
