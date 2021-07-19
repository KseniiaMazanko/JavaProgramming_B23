package day06_;

public class UnaryOperators {

    public static void main(String[] args) {

        //int a = 100;
        //++a;
        //System.out.println(a);

        int b = 100;
        --b;
        System.out.println(b);

        System.out.println("-------------------");

        int x =10;

        //System.out.println(   ++x);//changes the value immediately
        System.out.println(   x++   );//first passes the current value (which is 10 in this case, and then changes)
        System.out.println(x);



        int l = 50;
        int l2 = l++;
        System.out.println("l = " + l);
        System.out.println("l2 = " + l2);
        System.out.println("l = " + l);




        int y = 100;
        int result = y++ +1;

        System.out.println("y = " + y);
        System.out.println("result = " + result);
        System.out.println("result = " + result);

        int z = 100;
        int result2 = ++z +1;

        System.out.println("result2 = " + result2);
        System.out.println("z = " + z);











    }





}
