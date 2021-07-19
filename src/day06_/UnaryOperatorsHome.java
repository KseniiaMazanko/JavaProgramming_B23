package day06_;

public class UnaryOperatorsHome {

    public static void main(String[] args) {

         /*
        1. write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15
    output:
        a = 15
        b = 10
         */
//        byte c = 10;
//        int d = (int) c;
//        int c = 10;
//        byte d = (byte) c;

       // System.out.println(d);


        /*
        manually calculate the following code fragments:
          1. int a = 100;//101//102-1=101-1=100
             int b = -a++ + ++a - a-- * a-- % 2
                      -100  + 102 - 102 *101 %2

                     //2
         */
        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        System.out.println(b);


    }

}
