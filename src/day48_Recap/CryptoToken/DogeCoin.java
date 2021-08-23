package day48_Recap.CryptoToken;

public class DogeCoin extends CryptoToken {

    public DogeCoin(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

    @Override
    public String toString() {
        return "DogeCoin{" +
                super.toString()+ "}";
    }
}
