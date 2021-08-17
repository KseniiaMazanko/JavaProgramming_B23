package day43_OOP_Encapsulation.CandiesTask;

public class Candy {

    /*
    CandiesTask
     create a custom class named Candy
            private variables:
                brand (String), quantity (int), price (double), hasPeanuts (boolean)

            Encapsulate All the private fidlds
                    (price of candy can not be set to negative)
                    (quantity of candy can not be set to zero or negative)

            Add a constructor that can set the instances when the object is created
                    (avoid any duplicated code fragments)

            Extra methods:
                toString():
                    if the price is zero, print "free" instead of 0
*/

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand(){
        return brand;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public boolean isHasPeanuts(){
        return hasPeanuts;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setQuantity(int quantity){
        if(quantity<=0){
            return;
        }
        this.quantity=quantity;
    }

    public void setPrice(double price) {
        if(price<0){
            return;
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price==0)? "free":price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
