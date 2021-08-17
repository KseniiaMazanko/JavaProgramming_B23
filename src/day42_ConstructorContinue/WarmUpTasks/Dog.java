package day42_ConstructorContinue.WarmUpTasks;

public class Dog {

    /*Create a class called Dog
            Variables:
    breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings
    Add a constructor to initialized all the fields
    Add a static block to initialize all the statics
    Methods:
    toString()
     */

    public String breed;
    public char gender;
    public int age;
    public String color;
    static int numberOfLegs = 4;
    static int numberOfEyes = 2;
    static int numberOfWins = 0;

    static {
        System.out.println("Dog has " + numberOfLegs + "legs");
        System.out.println("Dog has " + numberOfEyes + "eyes");
        System.out.println("Dog has " + numberOfWins + "wings");
    }

    public Dog(String breed, char gender, int age, String color) {
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
