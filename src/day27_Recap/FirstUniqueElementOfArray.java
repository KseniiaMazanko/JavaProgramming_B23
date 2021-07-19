package day27_Recap;

public class FirstUniqueElementOfArray {

    public static void main(String[] args) {

        int [] nums = {1,2,1,3,3,4,5,5,5,6,6,6,7,7,7,8};

        //the output should just be 2

        int firstUniqueElement = 0;

        //option 1

        for (int num : nums) {
            int frequency = 0;

            for (int i=0; i < nums.length; i++){//responsible for finding the frequency of 1 element
                if(nums[i] == num){
                    frequency++;
                }
            }
            if(frequency==1){
                firstUniqueElement=num;
                break;
            }

        }

        //option 2

       /* for(int j=0; j<nums.length; j++){//responsible for finding the frequency of each element of the arrsy
            int frequency = 0;

            for (int i=0; i < nums.length; i++){//responsible for finding the frequency of 1 element
                if(nums[i] == nums[j]){
                    frequency++;
                }
            }
            if(frequency==1){
                firstUniqueElement=nums[j];
                break;
            }
        }

        */

        System.out.println(firstUniqueElement);


    }

}
