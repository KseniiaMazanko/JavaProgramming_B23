package day05_ArithmeticOperators;

public class Address {

    public static void main(String[] args) {

        /*
        create a class named Address and declare the following variables:
        name, buildingNumber, streetName, city, state, zipCode
        use string concatenation to display the full address of the person
        Ex:
            Daniel Owens
            7925 Jones Branch Dr
            McLean VA 22102

         */
        String name = "Daniel Owens",
                buildingNumber = "7925",
                streetName = "Jones Branch Dr",
                city ="McLean",
                state = "VA",
                zipCode = "22102";

        System.out.println("\t" + name + "\n\t" + buildingNumber + " " + streetName + "\n\t" + city + " "
        + state + " " + zipCode);





    }

}
