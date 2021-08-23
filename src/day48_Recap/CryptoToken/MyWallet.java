package day48_Recap.CryptoToken;

public class MyWallet {

    public static void main(String[] args) {

        DogeCoin doge = new DogeCoin(0.59, 11_543.56, 41.46_000_000, 2_258_465, 130.98_000_000_000, false );
        System.out.println("Dogecoin total price: " + doge.totalPrice());

        Bitcoin bitcoin = new Bitcoin(49_351, 0.15, 925687000, 25_456_236, 1_000_000, true);
        System.out.println("Bitcoin that you own total price: " + bitcoin.totalPrice());


    }



}
