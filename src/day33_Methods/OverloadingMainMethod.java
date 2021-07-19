package day33_Methods;

public class OverloadingMainMethod {


    //you can overload the main method but only the valid one will get executed
    //the one with the String as a parameter
    //there is np point

    //but any method in java could be overloaded

    public static void main(String[] args) {

        System.out.println("String");
    }

    public static void main(char[] args) {

        System.out.println("char");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }



}
