package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Employee extends Person {

    /*
     2. Employee
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
     */


    private int employeeId;
    private String jobTitle;
    private int salary;

    public Employee(String name, char gender, LocalDate DOB, int employeeId, String jobTitle, int salary) {
        super(name, gender, DOB);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        if(salary<0){
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public void attendMeeting(){
        System.out.println(getName() + " is attending meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
