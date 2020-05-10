package watki;

import java.util.ArrayList;
import java.util.List;

public class WorkerRunner {
    public static void main(String[] args) {
        List<Worker> workersList = new ArrayList<>();
        workersList.add(new Worker("Jan", 500));
        workersList.add(new Worker("Paweł", 1000));
        workersList.add(new Worker("Elżbieta", 2500));

        for (Worker worker: workersList) {
            new Thread(worker).start();
        }

        sleep(3000);
        workersList.get(1).setName("Anna");
        sleep(3000);
        for (Worker worker: workersList) {
            worker.turnOff();
        }
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
