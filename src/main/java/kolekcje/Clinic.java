package kolekcje;

import java.util.LinkedList;
import java.util.Queue;

public class Clinic {
    private Queue<String> patientQueue;

    public Clinic() {
        this.patientQueue = new LinkedList<>();
    }
}
