package day37_CustomClass;

public class Dog {

    //atributes
    public String name;//instance variable
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;


    //actions of the Dog object
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public void setInfo(String dogName, String dogBreed, String dogGender,
                        String dogSize, String dogColor,  int dogAge){
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
        age = dogAge;



    }


    public void getIngo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }

}
