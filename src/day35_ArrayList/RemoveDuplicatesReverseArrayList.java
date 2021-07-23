package day35_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicatesReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('D');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();

        for (Character each : characters) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);
        }


        System.out.println(result);

        //reverse ArrayList
        System.out.println("____________________");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> reversed = new ArrayList<>();

        for(int i=nums.size()-1; i>=0; i--){
            reversed.add(nums.get(i));
        }
        System.out.println(reversed);






    }



}
