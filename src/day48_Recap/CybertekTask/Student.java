package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Student extends Person {

    /*
    Student
                    variables: name, gender, age, dateOfBirth, schoolName, studentId

                    methods: study(), attendClass()
     */

    public static String schoolName = "Cybertek";
    private int studentId;

    public Student(String name, char gender, LocalDate DOB, int studentId) {
        super(name, gender, DOB);
        setStudentId(studentId);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName() + " is studing");
    }

    public void attendClass(){
        System.out.println(getName() + " is attending class");
    }

}
