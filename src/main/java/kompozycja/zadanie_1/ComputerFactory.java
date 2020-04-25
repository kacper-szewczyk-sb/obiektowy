package kompozycja.zadanie_1;

import kompozycja.zadanie_1.parts.GraphicCard;
import kompozycja.zadanie_1.parts.PowerSupply;
import kompozycja.zadanie_1.parts.Processor;

public class ComputerFactory {

    public Computer createComputer(String processor, String graphicCard, String powerSupply) {
        Computer computer = new Computer();
        computer.setGraphicCard(new GraphicCard(graphicCard));
        computer.setProcessor(new Processor(processor));
        computer.setPowerSupply(new PowerSupply(powerSupply));
        return computer;

    }
}
