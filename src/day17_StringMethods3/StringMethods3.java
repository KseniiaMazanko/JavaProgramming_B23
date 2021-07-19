package day17_StringMethods3;

public class StringMethods3 {

    public static void main(String[] args) {

        /*contain method    contains(str) checks if given str is contained in the string,
        returns true of false*/

        String sentence = "My favorite programming language is Java, c#, Javascript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");

        //boolean hasJava2 = sentence.toLowerCase().contains("java");//to ignore the case sensitivity

        System.out.println("hasPython = " + hasPython); //true
        System.out.println("hasJava = " + hasJava);
        //System.out.println("hasJava2 = " + hasJava2);

       /* startsWith(str):
       "Cybertek School is the best"
       sentence.startsWith("Cybertek");
       returns true/false
        */

        String sentence2 = "Cybertek School is the best";
        boolean startsWithCybertek = sentence2.startsWith("Cyber");
        boolean startsWithSchool = sentence2.startsWith("School");

        System.out.println("startsWithCybertek = " + startsWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);

        System.out.println("___________________________");

        boolean endsWithBest =sentence2.endsWith("st");

        System.out.println(endsWithBest);




    }

}
