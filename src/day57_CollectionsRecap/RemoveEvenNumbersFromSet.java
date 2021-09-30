package day57_CollectionsRecap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveEvenNumbersFromSet {

    /*
    write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
     */

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,9,11,8,12,7,14,2,3,4,5,5));

        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }

        System.out.println("set = " + set);


    }


}
