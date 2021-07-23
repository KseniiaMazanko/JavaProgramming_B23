package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        //get() prints the element at the index
        //size() == Length()
        //set()==replace() -> el at index that you wanna replace, new element


        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Vinegar");
        groceryList.add("Bread");

        System.out.println(groceryList);

        groceryList.set(0, "Toilet paper");
        groceryList.set(3, "Soda");
        System.out.println(groceryList);

        System.out.println("____________________");

        groceryList.remove(1);
        System.out.println(groceryList);

        boolean hasToiletPaper = groceryList.contains("Toilet paper");
        boolean hasToiletPaper2 = groceryList.indexOf("Toilet paper")>=0;

        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);
        System.out.println("hasToiletPaper = " + hasToiletPaper);


        System.out.println("_____________________________");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        //Integer a =30;
        //list1.remove(a);

        list1.remove((Integer)30); //removes the element( at index)
        System.out.println(list1);


        list1.clear();//clears all elements in the array
        System.out.println(list1);


        System.out.println("_____________________________");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('B');
        list.add('C');
        list.add('D');

        System.out.println(list);

        //list.indexOf('A');//0
        //list.lastIndexOf('A')//4 if the first index and last index are the same then its unique

        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }
        }

        System.out.println("uniqueChars = " + uniqueChars);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));


        ArrayList<Integer> list3 = new ArrayList<>();
        //list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        list3.addAll(numbers);
        list3.addAll(Arrays.asList(10, 11, 12, 15));

        System.out.println(numbers);
        numbers.removeAll((Arrays.asList(3,4)));
        System.out.println(numbers);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(56,3,56,7,890,32,1,1,2,3,4,5,6,7));
        nums.removeAll(Arrays.asList(1));
        System.out.println(nums);
        
        nums.retainAll(Arrays.asList(2,3));
        System.out.println(nums);

        System.out.println("_______________________________");
        ArrayList<String> groceryList2 = new ArrayList<>();
        groceryList2.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs"));
        //check is Soda, Wine< Beer all of them are contained in groceryList
        
        boolean r = groceryList2.containsAll(Arrays.asList("Soda", "Wine", "Beer", ));

        System.out.println("r = " + r);
        



    }


}
