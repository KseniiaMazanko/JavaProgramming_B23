package day25_ForEach;

public class UniqueElements2 {

    public static void main(String[] args) {

        char [] chars = {'A', 'B', 'C', 'D', 'D', 'A'};


        for (char each : chars) {//outer loop is used to find the frequency of each character in the string

            int count = 0;
            for( char element : chars){//inner loop is used to find a frequency of one character
                if(element == each){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }
        }



    }


}
