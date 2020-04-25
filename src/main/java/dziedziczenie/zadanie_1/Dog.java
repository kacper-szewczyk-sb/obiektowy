package dziedziczenie.zadanie_1;

import dziedziczenie.zadanie_1.races.DogRace;

public class Dog extends Animal {

    private DogRace race;

    public Dog(String name, int age, DogRace race) {
        super(name, age);
        this.race = race;
    }

    public DogRace getRace() {
        return race;
    }

    public void setRace(DogRace race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString() +
                "race=" + race;
    }
}
