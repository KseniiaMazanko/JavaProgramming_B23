package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);//autoboxing, 0
        numbers.add(20);//autoboxing, 1
        numbers.add(30);//autoboxing, 2
        numbers.add(40);//autoboxing, 3
        numbers.add(1, 50);//adds 50 at index 1, index has to exist in the arraylist

        System.out.println(numbers);
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());

        System.out.println("__________________________");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer each : numbers) {//same functionality as a for loop
            System.out.println(each);
        }






        }

    }

