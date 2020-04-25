package kompozycja.zadanie_1;

public class Buyer {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();

        Computer computer = computerFactory.createComputer("i7", "RTX", "700W");
        System.out.println(computer.description());
    }
}
