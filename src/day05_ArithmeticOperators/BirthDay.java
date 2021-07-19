package day05_ArithmeticOperators;

public class BirthDay {

    public static void main(String[] args) {

        /*
        Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;
			 	output:
			 		John was born on April/25/1995.
         */

        String name = "John",
                birthMonth = "April";
        int birthday = 25,
                birthYear = 1992;

        System.out.println(name + " was born on " + birthMonth + "/" + birthday + "/" + birthYear +".");

int age = 2021-birthYear;
        System.out.println(name + " is " + age + " years old.");
    }

}
