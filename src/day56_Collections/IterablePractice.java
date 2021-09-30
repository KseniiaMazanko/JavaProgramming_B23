package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println("list = " + list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,2));

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){ //hasNext checks if there is an object
            if(it.next()<4){//next() retrieves the object while the condition is true
                it.remove();//remove() to remove the object
            }
        }
        System.out.println("list2 = " + list2);

        System.out.println("___________________________");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list3.removeIf(p -> p<4);
        System.out.println("list3 = " + list3);




    }
}









