package day22_LoopsRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SumOfTwo {
    /*
    write a program that will ask user to enter two numbers and
    calculates the sum of those two numbers.
    then it asks the user if he/she wants to continue
    if the answer is yes, repeat the whole process again

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer = "";

        do{
            System.out.println("Enter 2 numbers:");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition: " + (n1+n2));
            //System.out.println("Do you want to continue?");


            //option number 1
            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }

            /* option number 2
            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer, Please re-enter!");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
             }*/


        } while(answer.equalsIgnoreCase("yes"));


scan.close();
    }



}
