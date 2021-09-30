package day56_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Queue<Integer> q3 = new LinkedList<>();
        q3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        System.out.println(((LinkedList) q3).get(2));



    }


}
