package day49_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;

public class ExceptionHandling2 {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("____________________________________");


        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("____________________");

        try{
            System.out.println(100/0);
            System.out.println("Try block");
        } catch(RuntimeException e){
            System.out.println("Catch block");
        } finally {
                System.out.println("Finally block");//always gets executed use if there is a specific statement you MUST execute
        }

        System.out.println("Test completed");

        System.out.println("_________________________________");


        try{
            System.out.println("Cybertek".charAt(-1));
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            System.exit(0);//the only way to avoid the execussion of finally block
        }
        finally {
            System.out.println("Finally block");
        }





    }




}
