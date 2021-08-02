package day38_CustomClass;

public class Employee {

    public String employeeName;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo (String employeeName, char gender, int ID, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    /*
    Employees:
    Attributes:
        employeeName, gender, employeeID, JobTitle, Salary

    Actions:
        attendMeeting, Working, toString, SetInfo

    ArrayList of employees:
        1. remove all the employees who are making lass than 100K
        2. remove all the QAs
     */


}
