package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 60;
        int weeklyHours = 40;
        int weeklySalary = hourlyRate*weeklyHours;
        int yearlySalary = weeklySalary*52;
        System.out.println(yearlySalary);
    }
}
