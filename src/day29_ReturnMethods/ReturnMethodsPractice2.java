package day29_ReturnMethods;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

        System.out.println(grade(95));

        //or 2nd option

        String r = grade(110);
        System.out.println(r);

    }

    /*public static void grade (int score){ //method that does not return any value

        if(score>100 || score<0){
            System.out.println("Invalid");
            return;//exits the method
        }


        if(score>=90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else if(score>=60){
            System.out.println("D");
        }
        else
            System.out.println("F");
    }

     */

    public static String grade (int score){
        String result = "Invalid";

        if(score>=0 && score<=100) {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }

        return result;

        }
    }



