package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {

        Dog dog1 = new Dog(); //this is how we create the object
        dog1.name = "CutiePie";
        dog1.breed = "Kangal";
        dog1.gender = "Female";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "yellowish brown";


        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.gender);


        Dog dog2 = new Dog();
        dog2.setInfo("Bobby", "French Buldog", "male",
                "Large", "Black", 2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Husky", "male",
                "large", "white", 1);

        dog1.bark();//Kangal
        dog2.bark();//Bobby
        dog3.bark();//Jack


        System.out.println("_____________________________________");
        dog2.eat("pizza");
        dog3.drink("milk");
        dog1.play();
        System.out.println("_____________________________________");

        dog2.getIngo();

        System.out.println("______________________________________");
        dog3.getIngo();

        System.out.println("_______________________________________");

        Dog [] dogs = {dog1, dog2, dog3};
        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1, dog2, dog3));





    }


}
