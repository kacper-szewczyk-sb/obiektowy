package watki;

public class Worker implements Runnable {
    private String name;
    private Boolean active;
    private long sleepTime;

    public Worker(String name) {
        this.name = name;
        this.active = true;
        this.sleepTime = 1000;
    }

    public Worker(String name, long sleepTime) {
        this.name = name;
        this.active = true;
        this.sleepTime = sleepTime;
    }

    public void turnOff() {
        this.active = false;
        System.out.println("Koniec pracy " + name);
    }

    public void setName(String name) {
        System.out.println();
        System.out.println(this.name + " -> " + name);
        System.out.println();
        this.name = name;
    }

    @Override
    public void run() {
        while (this.active) {
            System.out.println(name + " - pracuje");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
