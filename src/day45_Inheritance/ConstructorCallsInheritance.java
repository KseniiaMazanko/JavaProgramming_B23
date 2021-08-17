package day45_Inheritance;


class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        //super();//gets executed implisivly
        System.out.println("B");
    }
}

public class ConstructorCallsInheritance {

    public static void main(String[] args) {

        new B();

    }


}
