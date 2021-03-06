package day53_Polymorphism;

import day45_Inheritance.animalTask.Animal;
import day45_Inheritance.animalTask.Dog;
import day47_Recap.Phone.IPhone;
import day47_Recap.Phone.Phone;
import day47_Recap.Phone.Samsung;
import day53_Polymorphism.WebDriverTask.ChromeDriver;
import day53_Polymorphism.WebDriverTask.WebDriver;

public class PolymorphismRules {

    public static void main(String[] args) {

        Phone phone1 = new IPhone("12", "large", "black", 1000);
        phone1.call(123456);
        phone1.text(123456);
        //   phone1.faceTime(123456);


        Phone phone2 = new Samsung("S16", "Medium", "white", 9000);

        /*
       WebDriver driver = new ChromeDriver();
        driver.get()
       ( (TakeScreenShot)driver).takeScreenShot()
        driver.executeScript()
         */


        System.out.println("--------------------------------------------");

        WebDriver driver =  new ChromeDriver();

        driver.get("www.amazon.com");

        System.out.println("------------------------------------------");

        Animal animal = new Dog("Lucy", "Husky", 'M', "Large", 10, "White");
        animal.drink("Milk");
        animal.eat("Dog Food");
        animal.sleep();
        // animal.bark();



    }


}
