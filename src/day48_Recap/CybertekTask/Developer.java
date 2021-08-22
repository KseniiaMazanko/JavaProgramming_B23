package day48_Recap.CybertekTask;

import java.time.LocalDate;

public final class Developer extends Employee{


    public Developer(String name, char gender, LocalDate DOB, int employeeId, String jobTitle, int salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + " " + getName() + " is attending grooming meeting");
    }


}
