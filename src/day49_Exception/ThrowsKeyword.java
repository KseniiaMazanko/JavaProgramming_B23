package day49_Exception;

public class ThrowsKeyword {

    //throws fixes the problem temporary
    //try catch fixes the problem permanently

    public static void main(String[] args) throws InterruptedException {


        System.out.println("test started");
        System.out.println("Step 1");
        sleep(3000);
        System.out.println("Step 2");

        System.out.println("Step 2");
        sleep(3);

        System.out.println("test completed");



    }

    public static void sleep(double seconds) throws InterruptedException {

        long milliSeconds = (long)(seconds*1000);
        Thread.sleep(milliSeconds);
    }


}
