package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        
        //String word = "ababababab";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scan.next();
        String result = "";
        
        for(int i=0; i<=word.length()-1; i++){ //or i<word.length() not included
            
            if(!result.contains("" + word.charAt(i)))
            result +=word.charAt(i);
        }
        System.out.println("result = " + result);

    }
    
    
}
