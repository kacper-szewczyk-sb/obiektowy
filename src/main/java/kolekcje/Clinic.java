package kolekcje;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Clinic {
    private Queue<String> patientQueue;
    private Doctor doctor;

    public Clinic() {
        this.patientQueue = new LinkedList<>();
        this.doctor = new Doctor("Henryk");
    }

    public void registerPatient(String name) {
        this.patientQueue.add(name);
        System.out.println("Zapisano " + name);
    }

    public String handlePatient() {
        String patient = this.patientQueue.remove();
        this.doctor.addVisit(patient);
        return patient;
    }

    public List<String> getDoctorVisits() {
        return this.doctor.getVisits();
    }
}
