package day39_CustomClass_Static;

public class StaticExamples {

    public int age, ID;
    public String name, gender;

    public static String schoolName = "Cybertek";
    public static String programmingLanguage = "Java";

    public void printName(){
        System.out.println(name);//method can not use instanse variables
    }

    public void method() {
        System.out.println(schoolName);
    }




}
