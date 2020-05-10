package watki.zadanie_2;

public class CompanyWorker implements Runnable {
    private String name;
    private Long entryTime;
    private Boolean isAtWork;

    public CompanyWorker(String name, Long entryTime) {
        this.name = name;
        this.entryTime = entryTime;
        this.isAtWork = true;
        System.out.println(this.toString());
    }

    public void goHome() {
        this.isAtWork = false;
    }

    @Override
    public void run() {
        while (this.isAtWork) {
            try {
                Thread.sleep(1000);
                System.out.println("Jestem w pracy - " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String toString() {
        return name + ", entryTime = " + entryTime;
    }
}
