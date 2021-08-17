package utilities;

import day43_OOP_Encapsulation.AccessModifiers;
import day43_OOP_Encapsulation.EncapsulationIntro;

public class Data {

    public String str1, str2;

    public void method1(){}

    public void method2(){}

    public static String str3, str4;

    public static void method3(){}

    public static void method4(){}


    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);

        EncapsulationIntro obj = new EncapsulationIntro();
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setUsername("CybertekSchool");
        obj.setPassword("Cybertek321");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());



    }






}
