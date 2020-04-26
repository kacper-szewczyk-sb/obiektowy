package kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<String> visits;

    public Doctor(String name) {
        this.name = name;
        this.visits = new ArrayList<>();
    }

    public void addVisit(String name) {
        this.visits.add(name);
    }

    public List<String> getVisits() {
        return this.visits;
    }
}
