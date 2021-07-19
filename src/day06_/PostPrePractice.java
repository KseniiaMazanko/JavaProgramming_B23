package day06_;

public class PostPrePractice {


    public static void main(String[] args) {

        int a=1; //a=1-1=0+1 = 1-1=0-1=-1
        a = -a--   +   a++    /-a-- * --a;
        //  -1 + 0 / -1  * -1




        System.out.println(a);


        int x = 10;//x=10+1=11-1=10+1=11-1=10

        x = ++x  -  x--  +  x++  + --x;

        //   11      11      10      10

        System.out.println(x);

        int y = 50; // y=50+1=51-1=50+1 = 51-1=50
        int z = -y++ + --y - ++y + y--;
        //      -50   + 50  -  51  +  51
        System.out.println(z);


        int r = 100;
        System.out.println(-r-1);


    }

}
