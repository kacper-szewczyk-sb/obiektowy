package kolekcje;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClinicTest {

    @Test
    public void queueTest() {
        Clinic clinic = new Clinic();

        clinic.registerPatient("Paweł");
        clinic.registerPatient("Andrzej");

        Assertions.assertEquals("Paweł", clinic.handlePatient());
        Assertions.assertNotEquals("Paweł", clinic.handlePatient());
    }


    @Test
    public void doctorTest() {
        Clinic clinic = new Clinic();

        clinic.registerPatient("Paweł");
        clinic.registerPatient("Andrzej");

        Assertions.assertEquals("Paweł", clinic.handlePatient());
        Assertions.assertNotEquals("Paweł", clinic.handlePatient());
        Assertions.assertEquals(2, clinic.getDoctorVisits().size());
    }
}
