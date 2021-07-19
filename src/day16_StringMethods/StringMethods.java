package day16_StringMethods;

public class StringMethods {

    public static void main(String[] args) {

        String sentence = "C# is cool, c# is fun";
        sentence = sentence.replaceFirst("C#", "Java");
       // sentence = sentence.replace("C#", "Java");

        System.out.println(sentence);


        String s = "Cat Dog Cat Cat";
        s= s.replaceFirst("Cat", "Dog");

        System.out.println(s);

        System.out.println("___________________");
        String sentence2 = "Java 4 is a cool language";
        //int indexOfFirstA = sentence2.indexOf('a');
        int indexOfFirstA = sentence2.indexOf("4");
        System.out.println("indexOfFirst = " + indexOfFirstA);

        int indexOfSecondA = sentence2.indexOf("a ");
        System.out.println(indexOfSecondA);

        int indexOfThirdA = sentence2.indexOf("a c");
        System.out.println(indexOfThirdA);

        //int indexOfFourthA = sentence2.indexOf("an"); // or sentence2.indexOf("la")+1
        int indexOfFourthA = sentence2.indexOf("la")+1;
        System.out.println(indexOfFourthA);

        //int indexOfFifthA = sentence2.indexOf("ag");
       // System.out.println(indexOfFifthA);


        System.out.println("______________________");
        int indexOfFifthA= sentence2.lastIndexOf("a");
        System.out.println(indexOfFifthA);



        System.out.println("_______________________");

        boolean isEmpty= sentence2.isEmpty();
        System.out.println();

        String s3 = "    ";
        s3 = s3.trim();
        boolean r3 = s3.isEmpty();
        System.out.println("isEmpty = " + r3);


        System.out.println("__________________________");
        //equals() or

        String str1 = "Cat";//string pool
        String str2 = "Cat"; //vip Java heap
        String str3 = "Cat";
        System.out.println(str1==str2);//false
        System.out.println(str2==str3);//false

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));


        System.out.println("____________________");
        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1==word2);//false
        System.out.println(word1.equals(word2));//false case sensitivity

        System.out.println(word1.equalsIgnoreCase(word2)); //true, ignores the case sensitivity





    }

}
