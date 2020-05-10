package watki;

import java.util.concurrent.Callable;

public class WorkerCallable implements Callable<String> {
    private String name;
    private long sleepTime;

    public WorkerCallable(String name) {
        this.name = name;
        this.sleepTime = 1000;
    }

    public WorkerCallable(String name, long sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pracuję - " + name);
            Thread.sleep(sleepTime);
        }
        return "Koniec - " + name;
    }
}
