package day40_CustomClassStatic;

public class Address {

    /*
    1. Create a class named Address
    Attributes:
        instance:  street, city, state, zipCode;
        static: country
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
     */


    public String buildingNumber, street, city, state;
    public int zipCode;

    public static String country = "USA";

    //public static void setInfo(){//objects came from class instanse method can call static member, but static can NOT call the instanse variable
    //}

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return buildingNumber + " " + street + "\n" +
                city + " " + state + ", " + zipCode;
    }
}
