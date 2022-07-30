package instruments;

public class Guitar extends Instrument{

    private GuitarType guitarType;
    private String material;
    private int noOfStrings;

    public Guitar(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand, GuitarType guitarType, String material, int noOfStrings) {
        super(buyPrice, sellPrice, section, brand);
        this.guitarType = guitarType;
        this.material = material;
        this.noOfStrings = noOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }


    @Override
    public String play() {
        return "strum them strings";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice()) / this.getBuyPrice();

    }
}
