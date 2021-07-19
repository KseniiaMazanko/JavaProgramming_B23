package day15_String;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Muhtar";
        str.charAt(0);
        
        char ch = str.charAt(0);
        System.out.println("ch = " + ch);

        String word = "Cybertek School";

        char ch2 = word.charAt(9);
        System.out.println("ch2 = " + ch2);
        
        String word2 = "Java";
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);


        String sentence = "Hello everyone, how are you all doing?";
        int totalNumberOfCahrs = sentence.length();

        System.out.println("total number of chars" + totalNumberOfCahrs);

        String s1 = "Cybertek";
        char lastChar = s1.charAt(s1.length() -1);
        System.out.println("lastChar = " + lastChar);


        System.out.println("_________________________");
        String s = "cybertek";
        s = s.toUpperCase();//needs to be reassigned, cause the variable is immutable

        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s2.toLowerCase();

        System.out.println(s2);


        System.out.println("___________________________");
        String schoolName = "            Cybertek School   ";
        schoolName = schoolName.trim(); //"Cybertek School"

        System.out.println("schoolName = " + schoolName);


    }

}
