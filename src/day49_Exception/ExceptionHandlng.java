package day49_Exception;

import day46_Inheritance.shapeTask.Circle;
import org.relaxng.datatype.DatatypeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlng {


    public static void main(String[] args) {


        String str = "Cybertek";
        try{
            System.out.println(str.charAt(200));
        } catch (StringIndexOutOfBoundsException e){//if we are not sure what kind of exeption this is we could just use Runtime Exception
            //catch (Runtime Exception e){
            System.out.println("Catch block: String index out of bound occurred");
        }

        str+="School";

        System.out.println(str);

        System.out.println("__________________________________");


//child classes have to be first (IllegalArg, IndexOutOfB, Arithmetic) and then the parent class last (Runtime)
        try{
            System.out.println(9/0);
        } catch(IllegalArgumentException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(IndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(ArithmeticException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(RuntimeException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

    try {
        System.out.println(new Scanner(System.in).nextInt());
    }catch(ArithmeticException e){
        e.printStackTrace();
    }catch(NumberFormatException e){
        e.printStackTrace();
    }catch(IllegalArgumentException e){
        e.printStackTrace();
    }catch(InputMismatchException e){
        e.printStackTrace();
    }catch(RuntimeException e){
        e.printStackTrace();
    }

        System.out.println("____________________________________");

        Circle circle1 = null;

        try{
            circle1.getRadius();
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test completed");









    }



}
