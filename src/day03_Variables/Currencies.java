package day03_Variables;

public class Currencies {

    public static void main(String[] args) {

        int amountOfDolars =   100;
        double amountofHrivnias = amountOfDolars *27.43;
        double amntOfRubles = amountOfDolars*73.59;
        double euro = 0.82;
        double amntOfEuros = amountOfDolars*euro;

        System.out.print("100 dollars equals to: ");
        System.out.print(amountofHrivnias);
        System.out.println(" hrivnias");
        System.out.println("amountofHrivnias = " + amountofHrivnias);
        System.out.println("amntOfRubles = " + amntOfRubles);
        System.out.println("amntOfEuros = " + amntOfEuros);
    }
}
