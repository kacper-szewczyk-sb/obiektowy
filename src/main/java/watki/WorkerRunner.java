package watki;

import java.util.ArrayList;
import java.util.List;

public class WorkerRunner {
    public static void main(String[] args) {
        List<Worker> workersList = new ArrayList<>();
        workersList.add(new Worker("Jan"));
        workersList.add(new Worker("Paweł"));
        workersList.add(new Worker("Elżbieta"));

        for (Worker worker: workersList) {
            new Thread(worker).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Worker worker: workersList) {
            worker.turnOff();
        }
    }
}
