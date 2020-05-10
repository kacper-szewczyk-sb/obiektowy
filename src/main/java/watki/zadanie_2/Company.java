package watki.zadanie_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Company {
    public static Long time = 0L;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<CompanyWorker> companyWorkerList = new ArrayList<>();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        executorService.submit(() -> {
            try {
                while (true) {
                    Thread.sleep(100);
                    time = time + 1L;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Future<CompanyWorker> companyWorkerFuture =
            executorService2.submit(() -> {
               Thread.sleep(500);
               return new CompanyWorker("Jan", time);
            });
        companyWorkerList.add(companyWorkerFuture.get());

        for (CompanyWorker companyWorker: companyWorkerList) {
            System.out.println(companyWorker.toString());
        }

        executorService.shutdown();
        executorService2.shutdown();
    }
}
