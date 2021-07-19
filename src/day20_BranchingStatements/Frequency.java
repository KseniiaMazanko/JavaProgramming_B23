package day20_BranchingStatements;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

       /* write a program that can return the frequency of the a word
       Java from the sentence

        Ex:
        sentence = "Java Java";

        output:
        2
        */

        String sentence = "Java Java Java Java Java";
        int count = 0;

        //"Java"
        /*
        String str = sentence.substring(0,4);//"Java"
        String str2 = sentence.substring(1,5);//"ava "
        String str3 = sentence.substring(2,6);//"va J"
        String str4 = sentence.substring(3,7);//"a Ja"
         */

        for(int i = 0; i <= sentence.length()-4; i++ ){// includes indexes i = 0,1,2,3,4,5,6,7,8
           String each =  sentence.substring(i, i+4);//representing each four characters in sentence
            System.out.println(each);
            if(each.equals("Java")){
                count++;
            }
        }

        System.out.println("count = " + count);











    }
}
