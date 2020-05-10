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

        ExecutorService executorService = startTimeThread();

        addWorkerToWork(companyWorkerList);
        goHomeRunner(companyWorkerList);

        executorService.shutdownNow();

    }

    private static void goHomeRunner(List<CompanyWorker> companyWorkerList)
            throws ExecutionException, InterruptedException {
        ExecutorService goHomeExecutorService = Executors.newSingleThreadExecutor();

        Future<String> endOfWork = goHomeExecutorService.submit(() -> {
            try {
                do {
                    Thread.sleep(3000);
                    companyWorkerList.get(0).goHome();
                    companyWorkerList.remove(0);
                    for (CompanyWorker companyWorker : companyWorkerList) {
                        companyWorker.reduceDelayTime();
                    }
                } while(!companyWorkerList.isEmpty());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Koniec pracy";
        });
        System.out.println(endOfWork.get());
        goHomeExecutorService.shutdown();
    }

    private static void addWorkerToWork(List<CompanyWorker> companyWorkerList) throws InterruptedException, ExecutionException {
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        addNewWorker(companyWorkerList, executorService2, "Jan", 100);
        addNewWorker(companyWorkerList, executorService2, "Paweł", 300);
        addNewWorker(companyWorkerList, executorService2, "Anna", 500);
        addNewWorker(companyWorkerList, executorService2, "Karol", 500);
        executorService2.shutdown();
    }

    private static void addNewWorker(List<CompanyWorker> companyWorkerList,
                                     ExecutorService executorService2,
                                     String name, long delay)
            throws InterruptedException, ExecutionException {
        Future<CompanyWorker> companyWorkerFuture;
        companyWorkerFuture =
                executorService2.submit(() -> {
                    Thread.sleep(delay);
                    return new CompanyWorker(name, time);
                });
        companyWorkerList.add(companyWorkerFuture.get());
        new Thread(companyWorkerList.get(companyWorkerList.size() - 1)).start();
    }

    private static ExecutorService startTimeThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
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
        return executorService;
    }
}
