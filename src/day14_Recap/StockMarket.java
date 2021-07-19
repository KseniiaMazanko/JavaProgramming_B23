package day14_Recap;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

/*
Stock market
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest
            condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in
        (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares.
            Apple INC is your company holdings"
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of shares that you have:");
        int numberOfShares = scan.nextInt();
        String nameOfTheCompany = "";
        double totalValue = 0;

        if (numberOfShares<=0) {
            System.out.println("Invalid number of shares");
        }
        else {

            System.out.println("Enter the total value if shares:");
            totalValue = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company you have the most shares of:");
            nameOfTheCompany = scan.nextLine();
        }


        //"Your total stock market holding is $25000 which is made up of 100 shares.
        //Apple INC is your company holdings"
        System.out.println("Your total stock market holding is $" + totalValue +
                " which is made up of " + numberOfShares + ". " + nameOfTheCompany + " is your company holdings");



    }

}
