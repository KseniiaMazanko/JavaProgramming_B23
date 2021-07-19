package day15_String;

public class StringMethods2 {


    public static void main(String[] args) {


        String s2 = "Cybertek school";
        String name  = s2.substring(0,7); //excludes 7 need to do last index+1
        System.out.println(name);

        //String name3 = s2.substring(9,15);//line 13 and 14 equal
        String name3 = s2.substring(9);


        System.out.println("____________________________");
        String sentence2 = "Java is a programming language";

        String name4 = sentence2.substring(10);//programming language
        System.out.println(name4);


        String name5 = sentence2.substring(10, 21);//programming
        System.out.println(name5);


        System.out.println("______________________________");
        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python", "Java");
        System.out.println(sentence3);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replace("C#", "Java");
        System.out.println(sentence4);

        String sentence5 = "Dog is my favorite pet, Dog is the best";
        sentence5 = sentence5.replace("Dog", "Cat");

        System.out.println(sentence5);


        System.out.println("_____________________");
        String str = "Batch 23";

        char ind = str.charAt(5);//anything> than 7 would give an error out of range

        String str2 = "Cybertek is a great school";
        String s4 = str2.substring(14,19);
        System.out.println(s4);


    }


}
