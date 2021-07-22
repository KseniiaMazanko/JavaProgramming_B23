package day34_LocalDateAndTime;

import sun.jvm.hotspot.utilities.CStringUtilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LunchTask {

    /*
    create string array to have 5 of your classmates names
    create an array that contains their DOB
    find out who is the youngest person
    find out who was born on leap year
     */
    public static void main(String[] args) {

        String [] arr = {"Elina", "Sergey", "Dina"};
        LocalDate [] dateOfBirth = {LocalDate.of(1975, 11,9),
                LocalDate.of(1988, 9, 3),
                LocalDate.of(1997, 10, 30)};

        LocalDate youngest =dateOfBirth[0];
        int index = 0;


        for(int i=0; i<dateOfBirth.length; i++){
            if(dateOfBirth[i].isAfter(youngest)){
                youngest=dateOfBirth[i];
                index = i;
            }
            if(dateOfBirth[i].isLeapYear()){
                System.out.println(arr[i] + " was born in the leap year");
            }
        }


        System.out.println("The youngest person is "  + arr[index] + " " + youngest);


        System.out.println("_________________________________________");
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " was born on " + dateOfBirth[i].format(DF));
        }


    }



}
