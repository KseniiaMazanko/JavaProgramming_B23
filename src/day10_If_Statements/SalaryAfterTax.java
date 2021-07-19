package day10_If_Statements;

public class SalaryAfterTax {
    public static void main(String[] args) {
        /*
        Write a program that can calculate the salary after tax based on the
        following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

      in addition,if the person is married, he/she will pay 5% less tax,
      otherwise pays 5% extra tax
         */
        int salary = 90_000;
        boolean isMarried = true;
        if (salary >= 130_000 && isMarried) {
            System.out.println("Your tax rate is 35% + 5% extra, your tax deduction is " + (salary*0.40));
        }
        else if (salary >= 130_000 && !isMarried) {
            System.out.println("Your tax rate is 35% - 5%, your tax deduction is " + (salary*0.30));
        }
        else if (salary >=100_000 && isMarried){
            System.out.println("Your tax rate is 30% + 5% extra, your tax deduction is " + (salary*0.35));
        }
        else if (salary >=100_000 && !isMarried){
            System.out.println("Your tax rate is 30% - 5%, your tax deduction is " + (salary*0.25));
        }
        else if (salary >=80_000 && isMarried){
            System.out.println("Your tax rate is 25% +5% extra, your tax deduction is " + (salary*0.30));
        }
        else if (salary >=80_000 && !isMarried){
            System.out.println("Your tax rate is 25% - 5%, your tax deduction is " + (salary*0.2));
        }
        else if (salary < 79_000 && isMarried){
            System.out.println("Your tax rate is 20% + 5% extra, your tax deduction is " + (salary*0.25));
        }
        else {
            System.out.println("Your tax rate is 20% - 5%, your tax deduction is " + (salary*0.15));
        }



    }


}
