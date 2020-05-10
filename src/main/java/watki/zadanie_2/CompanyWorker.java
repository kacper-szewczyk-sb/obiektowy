package watki.zadanie_2;

public class CompanyWorker implements Runnable {
    private String name;
    private Long entryTime;
    private Boolean isAtWork;
    private long delayTime;

    public CompanyWorker(String name, Long entryTime) {
        this.name = name;
        this.entryTime = entryTime;
        this.isAtWork = true;
        this.delayTime = 1000;
        System.out.println(this.toString());
    }

    public void goHome() {
        this.isAtWork = false;
        System.out.println("Koniec pracy - " + name);
    }

    public void reduceDelayTime() {
        this.delayTime = this.delayTime - 200;
    }

    @Override
    public void run() {
        while (this.isAtWork) {
            try {
                System.out.println("Jestem w pracy - " + name);
                Thread.sleep(delayTime);
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
