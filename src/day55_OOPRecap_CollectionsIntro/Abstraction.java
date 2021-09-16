package day55_OOPRecap_CollectionsIntro;

public class Abstraction extends Y implements X {
    //once we extend an abstract class we must override the methods!!!

    @Override
    public void m() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}
interface Z{

    void m2();

}

interface C{

    void m4();
}

interface Q{

    void m3();

}

//  ONLY INTERFACE CAN EXTEND MULTIPLE INTERFACES!!!

interface X extends Z,Q, C{//NOW THIS INTERFACE HAS 3 METHODS

    //ONLY PUBLIC ACCESS MODIFIER IS ALLOWED

    //ALL METHODS IN INTERFACE BY DEFAULT ABSTRACT
    //IT CAN NOT HAVE INSTANCE METHODS --- ONLY ABSTRACT, DEFAULT AND STATIC METHODS

    void m();
    int a = 300;

}

abstract class Y{

    public Y(){//can have constructor

    }

    int c = 200;
    static int d = 400;

    protected void method1(){//can have any access modifiers

    }

    public static void method2(){

    }

    public abstract void method3();//plus can have the abstract classes



}
