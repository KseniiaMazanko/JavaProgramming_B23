package day42_ConstructorContinue.WarmUpTasks;

public class CybertekStudent {

    /*
    create a class named CybertekStudent
            Variables:
                name, gender, age, schoolName, fieldOfStudy, programmingLanguage
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                attendClass():
                replit()
                toString()
     */

    public String name;
    public int age;
    public char gender;

    public static String schoolName, fieldOfStudy, programmingLanguage;

    public CybertekStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName = "Cybertek";
        fieldOfStudy = "IT";
        programmingLanguage = "Java";
    }

    public void attendClass() {
        System.out.println(name + " is attending class at " + schoolName);
    }

    public void replit() {
        System.out.println(name + " is doing ReplIt tasks in " + programmingLanguage + " language");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
