package instruments;

public class Harp extends Instrument{

    private int height;
    private int noOfStrings;

    public Harp(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand, int height, int noOfStrings) {
        super(buyPrice, sellPrice, section, brand);
        this.height = height;
        this.noOfStrings = noOfStrings;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    @Override
    public String play() {
        return "gentle, dreamy music plays";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice()) / this.getBuyPrice();
    }
}
