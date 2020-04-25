package dziedziczenie.zadanie_1;

import dziedziczenie.zadanie_1.races.CatRace;

public class Cat extends Animal {
    private CatRace race;
    public CatRace getRace() {
        return race;
    }

    public void setRace(CatRace race) {
        this.race = race;
    }

    public Cat(String name, int age, CatRace race) {
        super(name, age);
        this.race = race;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "race=" + race;
    }
}
