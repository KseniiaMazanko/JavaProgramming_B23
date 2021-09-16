package day49_Exception;

import java.io.FileInputStream;

public class ExceptionIntro {

    /*
    Exception: unexpected or unwanted events

		unchecked exception (unexpected event): occures during the runtime

					RuntimeException class is the parent of all the unchecked exception

					All the runtime exceptions are unchecked exception


		checked exception (unwanted event): occures during the compile time

					All the exceptions that are not runtime execptions are checked exception


Exception Handlings:

		1. try & catch blocks: used for handling both chekced and unchecked exceptions

				try{
					exception code
				}catch(ExceptionClass e){
					statements
				}

				multi-catch block: parent exception type CAN NOT be placed before child exception type


				finally block: always gets executed regardless of the exception


		2. throws keyword: used for handling checked exceptions ONLY


						caller of the method will be responsible for handling the exception


     */


    public static void main(String[] args) {

        int [] arr = {1,2,3};

        //unchecked exceptions

        //System.out.println(arr[100]);
        //System.out.println(100/0);
        String str = null;
        //System.out.println(str.toUpperCase());

        System.out.println("_______________________________");

        //checked exception (the one that occurred during the compile time, we can not run the code)

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        //FileInputStream file = new FileInputStream("");
        System.out.println("Hello Robinson");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




}
