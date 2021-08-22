package day48_Recap.CybertekTask;

import java.time.LocalDate;

public class Person {
    /*
    1. create a class named Person
        variables: name, gender, age, dateOfBirth
        methods: eat(), sleep(), drink()
     */

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;

    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        this.gender = gender;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - this.DOB.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void eat(String food){
        System.out.println(name+" is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", DOB=" + DOB;

    }
}
