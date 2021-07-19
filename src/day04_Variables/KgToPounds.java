package day04_Variables;

public class KgToPounds {

    /*create a class called KgToPounds, and write a program that can convert the given Kg to pound and print the result
            Ex:
            if kg = 10;
    output:
            22.0462
    Hint: 1 kg = 2.2 pounds*/
    public static void main(String[] args) {

        double oneKg = 2.2;
        int amountOfKg = 10;
        double totalPounds = amountOfKg*oneKg;
        System.out.println("totalPounds = " + totalPounds);


    }

}
