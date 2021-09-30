package day57_CollectionsRecap;

import utilities.StringUtility;

import java.util.*;

public class RemovePalindrome {

    /*
    1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions
     */

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList(
                "Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"
        ));


        Iterator<String> it = list.iterator();//in order to remove from Collection we must apply iterator
        while(it.hasNext()){//hasNext() checks if there is an element
            String each = it.next();//getting access to each object
            String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse+=each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){//if the string is palindrome
                    it.remove();
            }
        }

        System.out.println(list);

        System.out.println("______________________________");

        List<String> list2 = new LinkedList<>(Arrays.asList(
                "Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"
        ));

        list2.removeIf(p -> StringUtility.isPalindrome(p));

        System.out.println(list2);




    }





}
