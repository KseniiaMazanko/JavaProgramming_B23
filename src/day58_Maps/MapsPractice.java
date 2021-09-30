package day58_Maps;

import java.time.LocalDate;
import java.util.*;

public class MapsPractice {

    /*
    1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80
     */

    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ibrahim",95);
        students.put("Merve",90);
        students.put("John",72);
        students.put("Daniela",70);
        students.put("Akbar",89);
        students.put("Nazli",81);
        students.put("Yasin",850);
        students.put("Halil",95);
        students.put("Nemo",85);
        students.put("Yuliaa",80);
        students.put("Stranger",45);
        students.put("Marina",100);
        students.put("Joe",70);
        students.put("Smith",80);
        students.put("Sabir",95);


        System.out.println(students);

        System.out.println("_______________________________");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            int eachScore = entry.getValue();
            String eachName = entry.getKey();
            if(eachScore<80){
                System.out.println(eachName);
            }
        }

        System.out.println("_______________________________");

        List<String> earlyBirds = new ArrayList<>();
        List<String> angryBirds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if(entry.getValue()>=85){
                earlyBirds.add(entry.getKey());
            }
            else{
                angryBirds.add(entry.getKey());
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);


        /*
     2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and their date of birth
            print out the names of the students who were born before 1980 January 1st
     */

        System.out.println("____________________________________");

        Map<String, LocalDate> classmates = new LinkedHashMap<>();
        classmates.put("Ahmad",LocalDate.of(1987,10,10));
        classmates.put("Gulistan",LocalDate.of(1986,9,1));
        classmates.put("Kristina",LocalDate.of(1979,4,5));
        classmates.put("Somebody",LocalDate.of(1977,12,16));
        classmates.put("Nazli",LocalDate.of(1990,7,9));
        classmates.put("Aykut",LocalDate.of(1994,5,19));
        classmates.put("Abbos", LocalDate.of(1979,4,10));
        classmates.put("Yuliang", LocalDate.of(1973,2,12));
        classmates.put("Ibrahim", LocalDate.of(1970,3,25));
        classmates.put("Feruza", LocalDate.of(1993,1,28));
        classmates.put("Ahmet", LocalDate.of(1974,4,23));
        classmates.put("Ismail", LocalDate.of(1975,6,14));
        classmates.put("Zorana", LocalDate.of(1992,8,20));
        classmates.put("Mehmet", LocalDate.of(1993,9,13));
        classmates.put("Yuliia", LocalDate.of(1994,3,22));
        classmates.put("Yasin", LocalDate.of(1976,5,15));
        classmates.put("Meltem", LocalDate.of(1996,6,14));
        classmates.put("Dilem", LocalDate.of(1997,2,17));
        classmates.put("Davut", LocalDate.of(1998,4,16));
        classmates.put("Ekaterina", LocalDate.of(1993,7,15));
        classmates.put("Mehmut", LocalDate.of(1979,8,14));
        classmates.put("Merve", LocalDate.of(1995,12,11));
        classmates.put("Tamara", LocalDate.of(1996,6,10));

        for (Map.Entry<String, LocalDate> entry : classmates.entrySet()) {
            if(entry.getValue().isBefore(LocalDate.of(1980,01,1)) ){
                //System.out.println(entry.getKey());
                classmates.remove(entry.getKey());
            }
        }

        /*
         3. create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
         */

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Canada", "Ottowa");
        countries.put("Russia", "Moscow");
        countries.put("The Czech Republic", "Prague");
        countries.put("España", "Madrid");
        countries.put("Germany", "Berlin");
        countries.put("Turkey", "Ankara");

        System.out.println(countries);

        for (String capitals : countries.values()) {
            System.out.println(capitals);
        }

        System.out.println("---------------------------------------------");

        for (String country : countries.keySet()) {
            System.out.println(country);
        }

    }


}
