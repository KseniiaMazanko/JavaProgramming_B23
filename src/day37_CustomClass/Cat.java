package day37_CustomClass;

public class Cat {
    //class for cat
    //Attribute: name, color, age, breed, size...
    //Actions: scratch, breakThings, jump, eat, drink
            //setInfo, getInfo


    //atributes

    public String name;
    public String color;
    public int age;
    public String breed;
    public String size;

    //action

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void scratch(boolean isScratching){
        System.out.println(name + " is scratching " + isScratching);
    }

    public void breakThings (String thingToBreak){
        System.out.println(name + " is breaking " + thingToBreak);
    }

    public void drink (String drink){
        System.out.println(name+ " is drinking " + drink);
    }


    public void setInfo (String catName, String catColor, int catsAge, String catsBreed,
                         String catsSize){
        name = catName;
        color=catColor;
        age = catsAge;
        breed = catsBreed;
        size = catsSize;
    }

    public void getInfo (){
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("age = " + age);
        System.out.println("breed = " + breed);
        System.out.println("size = " + size);
    }




    //class for cars
    //make, model, color, price, year
    //driver() ...
    //getInfo(): 2010 Toyota Corolla, White in the proper format

    //class for students
    //name, gender, age, studentId
    //eat(), sleep(), code(), drink()
    //setInfo() to set the attributes,
    // getInfo() to print the attributes


}
