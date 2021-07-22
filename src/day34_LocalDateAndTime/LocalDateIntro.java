package day34_LocalDateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

       LocalDate eid  = LocalDate.of(2021, 12, 20);//thats how we declare date variable
        System.out.println(eid);

        LocalDate today = LocalDate.now();//now method returns the current date
        System.out.println(today);

        System.out.println("______________________________");

        //create array of String to store 5 of your classmates names
        String [] names = {"Abbos", "Sabir", "Vitaliy", "Edison", "Ahmet"};
        LocalDate [] DoB = {LocalDate.of(1990, 6, 30),
                LocalDate.of(1994, 8, 9), LocalDate.of(1991, 10, 03),
        LocalDate.of(1998, 4,12), LocalDate.of(1992, 11, 17)};


        for(int i=0; i< names.length; i++){
            System.out.println(names[i] + "'s birthday is " + DoB[i]);
        }

        System.out.println("----------------------------");

        LocalDate person1 = LocalDate.of(1980, 12, 11);
        LocalDate person2 = LocalDate.of(1980, 12, 25);

        if(person1.isBefore(person2)){
            System.out.println("person1 is older");
        }
        else{
            System.out.println("person2 is older");
        }

        if(person1.isAfter(person2)){
            System.out.println("person1 is younger");
        }
        else{
            System.out.println("person2 is younger");
        }


        System.out.println("----------------------------");

        boolean r1 = person1.isLeapYear();
        System.out.println(r1);

        boolean r2 = LocalDate.of(2023, 1,1).isLeapYear();
        System.out.println(r2);

        System.out.println("-------------------------");

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate unitAssesment3 = currentDate.plusDays(14);
        System.out.println(unitAssesment3);

        LocalDate unitAssesment4 = currentDate.plusMonths(1);
        System.out.println(unitAssesment4);

        LocalDate graduation = currentDate.plusMonths(4);
        System.out.println(graduation);

        LocalDate exam = currentDate.plusWeeks(2);
        System.out.println(exam);



    }

}
