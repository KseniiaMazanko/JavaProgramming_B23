package day48_Recap.CybertekTask;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOB, int employeeId, String jobTitle, int salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + " " + getName() + " is attending scrum meetings");
    }

}
