package day11_Switch;

public class day11_ConditionalStatements {

    /*
    Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
     */



    public static void main(String[] args) {

        int salary = 60_000;
        int credit_score = 650;

        String result = (salary>=60_00 && credit_score>=650)? "Loan Approved" : "Loan Denied";


        System.out.println(result);
    }

}
