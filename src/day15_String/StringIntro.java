package day15_String;

public class StringIntro {

    public static void main(String[] args) {

        String s1 = "cat";
        String s2 = "CAt";
        String s3 = "cat";

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true

        System.out.println("___________________________________");

        String s4 = "Dog";
        String s5 = "Dog";
        String s6 = "Dog";
        String s7 = s4;

        System.out.println(s4 == s5);//false
        System.out.println(s5 == s6);//false
        System.out.println((s7 == s4));//true



    }
}
