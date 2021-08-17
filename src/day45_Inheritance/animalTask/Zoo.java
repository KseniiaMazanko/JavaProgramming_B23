package day45_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", 'F',
                "Small", 2, "White");
        dog.bark();

        //these methods were inhereted from Dog class
        dog.eat("dog food");
        dog.drink("water");
        dog.sleep();
        System.out.println(dog);


        System.out.println("_________________________________");

        Cat cat1 = new Cat("Fate", "Van", 'M',
                "Big", 1, "Black");
        cat1.eat("cat food");
        cat1.meow();
        cat1.sleep();
        cat1.drink("milk");
        System.out.println(cat1);

        System.out.println("_________________________________");

        Tiger tiger1 = new Tiger("Leo", "Bengal",'M',
                "small", 5, "white");
        tiger1.eat("meat");
        tiger1.drink("water");
        tiger1.roar();

        System.out.println(tiger1.breath);


    }



}
