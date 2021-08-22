package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate DOB, int employeeId, String jobTitle, int salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " + getName() + " is teaching");
    }
}
