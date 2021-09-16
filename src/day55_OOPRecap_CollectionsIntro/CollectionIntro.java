package day55_OOPRecap_CollectionsIntro;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        Queue<Integer> queue1 = new PriorityQueue<>() ;
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new LinkedList<>() ;


        System.out.println("--------------------------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7, 5, 1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.remove(Integer.valueOf(10));//if we take out valueOf then it will be taken as index

        System.out.println("list = " + list);
        System.out.println(list.get(4));

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        set.remove(10);//taken as an object cause it does not have index

        System.out.println("set = " + set);
        //   System.out.println(set.get(4));

        Queue<Integer> queue = new PriorityQueue<>() ;
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7, 11,8,9,10));
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11));

        queue.remove(10);

        System.out.println("queue = " + queue);
        //System.out.println(queue.get(4));


    }




}
