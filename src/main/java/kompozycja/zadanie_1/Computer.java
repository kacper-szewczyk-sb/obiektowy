package kompozycja.zadanie_1;

import kompozycja.zadanie_1.parts.GraphicCard;
import kompozycja.zadanie_1.parts.PowerSupply;
import kompozycja.zadanie_1.parts.Processor;

public class Computer {
    private Processor processor;
    private GraphicCard graphicCard;
    private PowerSupply powerSupply;

    public Computer(Processor processor, GraphicCard graphicCard, PowerSupply powerSupply) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.powerSupply = powerSupply;
    }

    public Computer() {
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String description() {
        return "processor=" + processor.getName() +
                ", graphicCard=" + graphicCard.getName() +
                ", powerSupply=" + powerSupply.getName();
    }
}
