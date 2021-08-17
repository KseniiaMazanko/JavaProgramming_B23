package day44_Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {



        Person person1 = new Person("John", 'M', LocalDate.of(1990, 10,8), "USA", "English");
        System.out.println(person1);

        person1.setName("Shay");
        person1.setGender('F');

        System.out.println(person1.getName());
        System.out.println(person1);

    }




}
