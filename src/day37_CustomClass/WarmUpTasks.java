package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    /*
  1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
     */

    //1. write a program that can swap the first and last elements of an ArrayList

    public static void main(String[] args) {

       String [] names = {"Ezra", "Sabir", "Raphael", "Mousa"};

       ArrayList<String> students = new ArrayList<>(Arrays.asList(names));
       //or students.addAll(Arrays.asList(names));

        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);


        //2. write a program that can return the first unique elements of an ArrayList
        System.out.println("__________________________");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,4,5,6,6,6,7,7,7,8,8,9));

        int firstUnique = 0;

        for (Integer each : list) {
            if(Collections.frequency(list,each) == 1){
                firstUnique = each;
                break;
            }
        }
        System.out.println("firstUnique = " + firstUnique);

        System.out.println("___________________________");
        //if we need to find all unique elements:


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,2,3,3,4,4,4,5,6,6,6,7,7,7,8,8,9));

        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf(p -> Collections.frequency(uniques, p) !=1);
        System.out.println(uniques);


        /*
        write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

         */

        System.out.println("_____________________________________-");
        String str = "AABBCCDDEE";
        String result = "";
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(str.split("")));
        //we split the string into the array and convert it to the collection type

        for (String each : StringUtility.removeDuplicates(str).split("")) {
            int frequency = Collections.frequency(list3, each);//
            result+=each+frequency;
        }
        
        System.out.println(list3);
        System.out.println(result);


        // 4. Write a program that can return the nth largest number from an
        // ArrayList of integers

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,8,8,9,10));

        //not an option because of the duplicates
        //Collections.sort(numbers);//ascending
        //Collections.reverse(numbers);//descending

        //5th maximum number:
        int n = 5;
        for(int i=1; i<n; i++){
            numbers.removeIf(p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);
        System.out.println("fifthMaxNumber = " + fifthMaxNumber);






    }


}
