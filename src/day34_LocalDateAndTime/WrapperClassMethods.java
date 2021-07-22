package day34_LocalDateAndTime;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WrapperClassMethods {

    public static void main(String[] args) {


        //parse method: converting string to primitives
        String str = "123";
        int num = Integer.parseInt(str);



        //valueOf methods: converting String to wrapper class
        int num2 = Integer.valueOf(str);

        System.out.println(num2-1);


        Integer num3 = Integer.parseInt(str);//autoboxing
                    //int primitive

        int num4 = Integer.parseInt(str);
                        //int primitive

        Integer num5 = Integer.valueOf(str);
        //              wrapper class


        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        //                  primitive

        boolean r2 = Boolean.valueOf(str2); //unboxing
        //                  wrapper

        boolean r3 = Boolean.parseBoolean(str2);//autoboxing
        //                  primitive

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        String str3 = "2.5";
        double num6 = Double.parseDouble(str3);
        System.out.println("num6 = " + num6);

        char ch = '4';
        boolean isLetter = Character.isLetter(ch);
        boolean isDigit = Character.isDigit(ch);
        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);


        System.out.println("--------------------------------");

        String s = "a1b2c3";
        int sum =0;

        char [] charArray = s.toCharArray();

        for (char each : charArray) {

            if(Character.isDigit(each)){
               sum+=Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);


        System.out.println("_______________________");

        String s2 = "AAAAABBBBBCCCCC3334444%%%&$$$###";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {

            if(Character.isDigit(each)){
                digits+=each;
            }
            else if(Character.isLetter(each)){
                letters+=each;
            }
            else{
                specialChars+=each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
