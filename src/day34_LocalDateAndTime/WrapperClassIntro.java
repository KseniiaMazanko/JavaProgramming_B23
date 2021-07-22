package day34_LocalDateAndTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class WrapperClassIntro {


    public static void main(String[] args) {

        short s = 10;
        Integer num = 10;
        //Short num2 = s;
        Integer num3 = (int) s; //only if you cast short to int you could assign it Integer
//Autoboxing: converting primitive value to wrapper class value

        char ch = '@';
        Character ch2 = (Character) ch;//casting is done automatacly - Autoboxing

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;
        //all above line 15-20 are known as unboxing

        byte c1=10;

        Byte c2=c1;//Autoboxing, wrapper class only accepts it's own primitive
        //Short c3=c1;//Short only accepts short primitive that's why line 31 through line 35 is compile error
        //Integer c4 = c1;
        //Long c5 = c1;
        //Float c6 = c1;
        //Double c7 = c1;









    }







}
