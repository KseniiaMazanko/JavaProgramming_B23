package day38_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setInfo("Christian", 123);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(999);
        account1.checkBalance();

        account1.withdraw(25);
        account1.checkBalance();

        account1.withdraw(10);


        System.out.println("________________________");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Ahmad", 1234);

        account2.deposit(100000);
        account1.checkBalance();

        account2.withdraw(20.55);
        account2.checkBalance();



    }

}
