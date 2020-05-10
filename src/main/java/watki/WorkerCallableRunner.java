package watki;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "Koniec";
        });

        while (!future.isDone()) {
            System.out.println("Pracuję");
            Thread.sleep(1000);
        }

        String result = future.get();
        System.out.println("Result1 " + result);
        System.out.println();

        future = executorService.submit(new WorkerCallable("Jan", 500));
        result = future.get();
        System.out.println("Result2 " + result);
        executorService.shutdown();

    }
}
