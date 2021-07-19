package day06_;

import java.text.DecimalFormat;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //double>float>long>int>short>byte;

        byte a = 10;
        long b = a;  //implicit casting, automatically done

        double d = 10.0;
        int f = (int)(long) d; //explicit casting, done manually

        System.out.println("f = " + f);

        System.out.println("-----------------------------");

        long n = 100;
        short m = (short)n;

        System.out.println("----------------------------");

        float q = 2.5f;
        int u = (int) q;

        long r = (long)q;

        short k = (short)q;

        byte p = (byte) q;

        System.out.println( (double)2.5f);
        System.out.println(    (double) 10L);

        int w = 129;
        byte z = (byte) w;

        System.out.println(z);

        int e = 70000;
        short g = (short)e;

        System.out.println(g);


        System.out.println(   (int)100.7);

        DecimalFormat df =  new DecimalFormat("0.00");

        System.out.println(    df.format(1.56789));




    }

}
