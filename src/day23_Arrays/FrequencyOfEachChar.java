package day23_Arrays;

public class FrequencyOfEachChar {

    public static void main(String[] args) {

        String str = "aabccc";

        String removeDup = ""; //abc

        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);

            if(removeDup.contains("" + ch)){
                continue;
            }
            removeDup += ch;
        }

        String result = ""; //result has to be a2b1c3
                            //a b c
                            //2 1 3

        for(int j=0; j<=removeDup.length()-1; j++){
            char ch = removeDup.charAt(j); //'a','b','c'
            int frequency = 0; //for the frequen of ch

            for(int i =0; i<=str.length()-1; i++){
                char each = str.charAt(i);

                if(each==ch){
                    frequency++;
                }
            }
            result += ""+ch +frequency;
        }

        System.out.println(result);

//step1 need to know how to remove duplicates
        //step2 //need to know how to find the freq of 1 char
        //step3 use the loop and apply step2 to find other chars




        //System.out.println(removeDup);


    }

}
