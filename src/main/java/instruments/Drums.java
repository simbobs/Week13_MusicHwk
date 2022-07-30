package instruments;

public class Drums extends Instrument {

    private int noOfDrums;
    private int noOfCymbals;

    public Drums(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand, int noOfDrums, int noOfCymbals) {
        super(buyPrice, sellPrice, section, brand);
        this.noOfDrums = noOfDrums;
        this.noOfCymbals = noOfCymbals;
    }

    @Override
    public String play() {
        return "bang bang";

    }

    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice()) / this.getBuyPrice();
    }


}
