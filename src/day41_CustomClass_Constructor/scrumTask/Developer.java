package day41_CustomClass_Constructor.scrumTask;

public class Developer {

    /*create a class called Developer
            Attributes:
    name, employeeID, JobTitle, Salary
    Actions:
    setInfo(), coding(), unitTesting(), fixingBug(), toString()

     */

    public String name;
    public char gender;
    public String jobTitle;
    public int id;
    public double salary;

    public static boolean isEmployed;
    public static boolean hatesTesters;

    static {
        isEmployed = true;
        hatesTesters = true;
    }

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
