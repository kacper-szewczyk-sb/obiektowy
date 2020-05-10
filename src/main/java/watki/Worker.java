package watki;

public class Worker implements Runnable {
    private String name;
    private Boolean active;

    public Worker(String name) {
        this.name = name;
        this.active = true;
    }

    public void turnOff() {
        this.active = false;
        System.out.println("Koniec pracy " + name);
    }


    @Override
    public void run() {
        while (this.active) {
            System.out.println(name + " - pracuje");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
