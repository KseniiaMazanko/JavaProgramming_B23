package day42_ConstructorContinue;

public class ConstructorCalls {
    /*
    constructor call:
			1. constructor cannot be called by its name (this() need to be used)
			2. only a constructor can call another constructor
			3. Constructor call MUST be at the first step
			4. one constructor cannot call more than one constructor
			5. Constructor cannot call itself or contain itself
     */

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1(); // "Method 1"
        System.out.println("Method 2");
    }

    public static void method4(){
        method1();
        method2();
    }


    public  void method3(){
        // ConstructorCalls();
        //   this();
    }

    public ConstructorCalls(){ //Method 1, Method 1,  Method 2,Default Constructor
        method1(); // Method 1
        method2(); //Method 1, Method 2
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){ //Method 1, Method 1, Method 2, Default Constructor, Constructor with int arg
        this(); // calling no-arg constructor
        System.out.println("Constructor with int arg");

    }


    public ConstructorCalls(String str){
        this();
        // this(10);
        System.out.println("Constructor with string arg");

    }



    public static void main(String[] args) {
        method2();

        System.out.println("--------------------------------");

        new ConstructorCalls();

        System.out.println("---------------------------------");

        new ConstructorCalls(10);

    }




}
