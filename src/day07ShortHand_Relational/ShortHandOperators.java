package day07ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        String name = "Muhtar";
        String name2 = "Mehmet";
        String name3 = name2;
        name2=name;
        name=name3;

        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);

        System.out.println("______________________");

        int a = 200;
        a= 100+300;


        System.out.println("_______________________");
        int balance = 300;
        balance += 200;
        System.out.println("balance = " + balance);
        balance +=1000;

        String School = "Cybertek";
        School += "School";
        System.out.println("School = " + School);

        String name1 = "John";
        String lastName = "Daniel";
        name1 += " " + lastName;
        System.out.println("name1 = " + name1);

        System.out.println("--------------------");
        //withdraw
        balance -= 300;
        System.out.println("balance = " + balance);


        int salary = 100000;
        salary *=2;
        double slices = 10;
        slices /=3;

        System.out.println("slices = " + slices);
        System.out.println("salary = " + salary);



        int cents = 105;
        int quarters = cents/25;
        cents %=25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

    }

}
