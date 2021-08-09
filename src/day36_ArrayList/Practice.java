package day36_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,5,5,5,5,6,6,7,7,8,8,9));
        System.out.println(list);

       list.removeIf(p -> p<5);//p represents each element, remove all elements that are less than 5
        System.out.println(list);

        list.removeIf((p -> p%2!=0));

        System.out.println(list);

        System.out.println("_______________________________");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Amanada", "Gil", "Rachel", "Ross", "Chandler", "Joey"));

        names.removeIf(p -> p.toLowerCase().contains("a") && p.toLowerCase().contains("e"));
        System.out.println(names);


        System.out.println("___________________________");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Sabas"));

        words.removeIf(p -> StringUtility.isPalindrome(p));

        System.out.println(words);

        





    }

}
