package day25_ForEach;

public class UniqueElements {

    public static void main(String[] args) {

        String [] words = {"java", "java", "python", "c#"};


        for (String each : words) {
            int count = 0;

            for (String element : words) {
                if(element.equals(each)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }
        }




        /*
        write a program that can print the unique elements from array of string
        {java, java, phyt, c#}
        out: phyt, c#
         */

    }

}
