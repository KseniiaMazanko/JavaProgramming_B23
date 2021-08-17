package day42_ConstructorContinue;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sabir");
        Employee employee2 = new Employee("Luis", "QA");
        Employee employee3 = new Employee("Maria", "SDET", 1234);
        Employee employee4 = new Employee("Ahmet", "SDET", 12345, 110000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }



}
