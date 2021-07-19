package day06_;

public class PracticeIncr_Decr {

    public static void main(String[] args) {

        int a = 50;//50-1=49///49+1=50-1=49+1=50
        a = --a + a++ + a-- + a++;  //197
        //   49    49   50     49

        System.out.println(a);

        int x = 4;//5
        int y = x * 4 - x++;//12
        System.out.println(y);

    }
}
