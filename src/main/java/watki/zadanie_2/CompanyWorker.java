package watki.zadanie_2;

public class CompanyWorker implements Runnable {
    private String name;
    private Long entryTime;

    public CompanyWorker(String name, Long entryTime) {
        this.name = name;
        this.entryTime = entryTime;
    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "CompanyWorker{" +
                "name='" + name + '\'' +
                ", entryTime=" + entryTime +
                '}';
    }
}
