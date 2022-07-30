package instruments;

public class Piano extends Instrument{

    private String type;
    private int noOfKeys;

    public Piano(double buyPrice, double sellPrice, InstrumentCategoryType section, String brand, String type, int noOfKeys) {
        super(buyPrice, sellPrice, section, brand);
        this.type = type;
        this.noOfKeys = noOfKeys;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    @Override
    public String play() {
        return "play me a song pianoman";
    }

    @Override
    public double calculateMarkup() {
        return (this.getSellPrice() - this.getBuyPrice()) / this.getBuyPrice();
    }
}
