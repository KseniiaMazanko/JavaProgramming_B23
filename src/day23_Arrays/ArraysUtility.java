package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};


        //toString() method used to print
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        String[] array2 = new String[5];
        System.out.println(array2);
        System.out.println(Arrays.toString(array2));//if its not primitive the default values will be ==> null

        double [] nums = new double[5];
        System.out.println(Arrays.toString(nums));//if its primitive the default values will be 0.0 double or 0 for int

        System.out.println("------------------------------------------");

        //sort() method: sorts the element of the array in ascending order(from smallest to largest)

        String [] students = {"Bob", "Kim", "Anastasia", "Muhtar"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);//the array is sorted in ascending order a-z

        System.out.println(Arrays.toString(students));

        int[] numbers = {9,10,4,1,3,-1,0,1,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [] num1 = {1,2,3};
        int [] num2 = {1,2,3};

        int [] num3 = {3,2,1};
        int [] num4 = {2,3,1};

        Arrays.sort(num3);
        Arrays.sort(num4);

        boolean r1 = Arrays.equals(num1, num2);
        boolean r2 = Arrays.equals(num3, num4);
        boolean r3 = Arrays.equals(num2,num3);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);




    }

}
