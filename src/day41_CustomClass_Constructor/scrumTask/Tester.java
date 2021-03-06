package day41_CustomClass_Constructor.scrumTask;

public class Tester {

    /*
    create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary
        Actions:
           setInfo(), smokeTesting(),  creatingTicket(), dailyStandUp() toString()

     */

    public String name;
    public char gender;
    public String jobTitle;
    public int id;
    public double salary;

    public static boolean isCybertekStudent;
    public static boolean isEmployed;

    static{
        isCybertekStudent = true;
        isEmployed = true;
    }

    public Tester(String name, char gender, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ " is doing the smoke testing");
    }
}
