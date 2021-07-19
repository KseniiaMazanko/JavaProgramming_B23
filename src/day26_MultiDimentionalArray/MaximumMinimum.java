package day26_MultiDimentionalArray;

public class MaximumMinimum {

    public static void main(String[] args) {

        int [] [] numbers = {{10,20,30}, {40,50,60}};

        int max = numbers[0] [0];
        int min = numbers[0] [0];

        int sum = 0;
        int count = 0;

        for(int [] each1D : numbers) {

            for (int element : each1D) {
                count++;
                sum += element;
                if(element>max){
                    max = element;
                }
                if (element < min) {
                    min = element;
                }
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);







    }
}
