package day56_Collections;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Daniel", "Mustafa", "Mohammed"
        ));

        //remove all the names "ahmed" without using lambda

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println("names = " + names);

        System.out.println("____________________________");

        List<String> names2 = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Daniel", "Mustafa", "Mohammed"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        Set<Integer>set = new HashSet<>();
        set.addAll(Arrays.asList(10,9,1,2,3,4,5,6,7,8,12,14,15,16,17,25,20));

        for(Iterator<Integer> i = set.iterator(); i.hasNext(); ){
            if(i.next()<17){
                i.remove();
            }
        }

        System.out.println("set = " + set);


    }


}
