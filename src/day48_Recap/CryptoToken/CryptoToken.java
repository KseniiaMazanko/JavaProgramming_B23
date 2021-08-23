package day48_Recap.CryptoToken;

public class CryptoToken {

    /*
    1. create a class called CryptoToken
			private variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

				Encapsulate all the fields

				Add a constructor that can set all the fileds

			methods:toString()
				    totalPrice(): returns the total price of the crypto token ( price * quantity)

     */

    private double price;
    private double quantity;
    private double marketCap;
    private double volume;
    private double circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price*quantity;
    }


    @Override
    public String toString() {
        return
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable ;
    }
}
