package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {
    /*
    1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];

    2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

    3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        /*
        1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,5,7,15,18,34));
        list.set(list.size()-1,0 );
        System.out.println(list);

        /*
        2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
         */
        System.out.println("___________________________________");

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list2);
        for(int i=0; i<list2.size(); i++){
            if(list2.get(i)%2!=0){
                list2.set(i, list2.get(i)*2);
            }
        }
        System.out.println(list2);


        /*
         3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        //first option by convering the array into the collection type
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr1));
        //Arrays.asList(arr1) converting into the collection type
        list3.addAll(Arrays.asList(arr2));

        //second option with loops
        /*for (String each : arr1) {
            list3.add(each);
        }

        for (String each : arr2) {
            list3.add(each);
        }
         */

        System.out.println(list3);

        System.out.println("________________________");
        int [] numbers = {1,2,3,4,5,6,7};
        ArrayList<Integer> list4 = new ArrayList<>();
        /*list4.addAll(Arrays.asList(numbers));
        if its int[] it would give a compiler error, it needs to be converted to non-primitive Integer
         */

        for (int each : numbers) {
            list4.add(each);
        }

        System.out.println(list4);



    }


}
