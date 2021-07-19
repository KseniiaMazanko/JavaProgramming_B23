package day18_Recap;

public class StringMethodPractice {

    public static void main(String[] args) {

        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println("indexOfK = " + indexOfK);

        if(indexOfK>=0){
            System.out.println("The string has character k");
        }
        else{
            System.out.println("It does not contain");
        }

        String sentence = "I like to learn C#, C# is cool";

        if (sentence.indexOf("Java")>=0){
            System.out.println("Sentence has Java");
        }
        else {
            System.out.println("sentence does not have Java");
        }


        String sentence2 = "I love J Java, Java is cool";
        String sentence3 = "I love Java, C# is cool";

        boolean isUnique = sentence3.indexOf("Java") == sentence3.lastIndexOf("Java");

        System.out.println("isUnique = " + isUnique);


        String schoolName = "Cybertek School";
        String name  = schoolName.substring(0,schoolName.indexOf(" "));
        System.out.println(name);
        
        
        String sentence4 = "I live in Virginia, I go to Cybertek school";
        String name2 = sentence4.substring(sentence4.indexOf("C"), sentence4.lastIndexOf(" "));
        System.out.println("name2 = " + name2);



        String sentence5 = "Java Java Java";
        sentence5 = sentence5.replace("Java ", "C# Python "); //the last Java was not replaced because it does not have a space in the end
        System.out.println(sentence5);










    }

}
