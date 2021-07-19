package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "King";
        String fullName = firstName+ " " + lastName;
        String gender = "male";
        int age = 30;
        String companyName = "Apple";
        String jobTitle = "SDET";

        System.out.println("Employee's fullName is " + fullName);
        System.out.println(fullName + " is " + gender);
        System.out.println(fullName + " works at " + companyName);
        System.out.println(fullName + "'s job title is " + jobTitle);



    }


}
