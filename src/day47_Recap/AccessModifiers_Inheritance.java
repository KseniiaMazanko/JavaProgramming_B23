package day47_Recap;


import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

       public void method(){

           System.out.println(publicVariable);
           System.out.println(protectedVariable);
           //System.out.println(defaultVariable);//is not visible outside the package
           //System.out.println(privateVariable);//is not visible outside of the class

           publicMethod();
           protectedMethod();
           //defaultMethod()is not visible
           //privateMethod();//is not visible



       }

}
