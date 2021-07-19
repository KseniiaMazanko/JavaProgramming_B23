package day25_ForEach;

public class ReverseElement2 {

    public static void main(String[] args) {


        String [] array = {"Java", "Python", "C#", "Cybertek"};

        for (String each : array) {
            String reverse = "";

            for(int i=each.length()-1; i>=0; i--){
                reverse+=each.charAt(i);
            }

            System.out.println(reverse);
        }


    }

}
