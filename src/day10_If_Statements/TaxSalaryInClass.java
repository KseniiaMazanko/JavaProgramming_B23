package day10_If_Statements;

public class TaxSalaryInClass {

    public static void main(String[] args) {

        double salary = 100_000;
        double taxRate = 0;

        if (salary >=130_000) {
            taxRate = 0.35;
        }
        else if (salary >= 100_000) {
            taxRate = 0.30;
        }
        else if (salary >=80_000) {
            taxRate = 0.25;
        }
        else {
            taxRate= 0.20;
        }

        boolean isMarried = false;

        if (isMarried) {
            taxRate -=0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println(salaryAfterTax);
    }

}
