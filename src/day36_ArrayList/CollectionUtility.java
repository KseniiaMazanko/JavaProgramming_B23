package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,-5,1,0,-10,7, 20, 20, 20));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.swap(list, 2,4);//the indexes of the elements
        // you want swapped
        System.out.println(list);


        Collections.replaceAll(list, 10, 20);
        System.out.println(list);

         int f = Collections.frequency(list, 20);
        System.out.println(f);

        System.out.println("________________________");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'D'));

        ArrayList<Character>uniques = new ArrayList<>();

        /* option 1
        uniques.removeIf(p -> Collections.frequency(uniques, p) !=1 );
        System.out.println(uniques);
         */


        /*option 2
        for (Character each : uniques) {
            if(Collections.frequency(chars, each) == 1){
                uniques.add(each);
            }
        }


        System.out.println(uniques);

         */

        System.out.println("____________________________");

        //find unique characters in the string

        String str = "ABABABCDEEEE";
        String unique = "";
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        //converts array to a collection type - method asList

        System.out.println(result);
        //option 1
        for(int i=0; i<result.size(); i++){
            if(Collections.frequency(result,result.get(i)) == 1){
                unique+=result.get(i);
            }
        }
        System.out.println(unique);

        /*option 2
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        result.removeIf(p->Collections.frequency(result,p) !=1);
        System.out.println(result);
         */

       int max =  Collections.max(list);
       int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,9,8,7,6,5,4,3,2,1));

        int firstMax = Collections.max(numbers);
        numbers.removeIf(p -> p==Collections.max(numbers));
        int secondMax = Collections.max(numbers);
        numbers.removeIf(p->p==Collections.max(numbers));
        int thirdMax = Collections.max(numbers);

        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);



    }

}
