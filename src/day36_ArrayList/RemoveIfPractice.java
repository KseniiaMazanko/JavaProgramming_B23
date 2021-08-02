package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractice {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,55,63,60,68,45,73,95));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p -> p<90);
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p -> p>=90 || p<80);
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p -> p>=80 || p<70);
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>=60 && p<70));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);


    }

}
