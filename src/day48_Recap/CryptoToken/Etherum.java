package day48_Recap.CryptoToken;

public class Etherum extends CryptoToken{

    public Etherum(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

    @Override
    public String toString() {
        return "Etherum{" +
                super.toString()+
                "}";
    }
}
