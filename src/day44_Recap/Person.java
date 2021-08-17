package day44_Recap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    /*
    PersonTask:
    private variables:
        name (String)
        gender (char and constant)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
        isHuman (static boolean & constant)
        planet (static boolean & constant)

    Encapsulate all the fields (instances)
        (age cannot be set to negative)

        */

    private String name;
    private char gender;
    private final int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;

    public static final boolean isHuman;
    public static final String planet;

    static {
        isHuman=true;
        planet="Earth";
    }

    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
        setName(name);//this.name = name;
        setGender(gender);//this.gender = gender;
        if(dateOfBirth.isBefore(LocalDate.now())){
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth=null;
        }//age cannot be negative
        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

   public String getName (){
        return name;
   }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;

    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drinks){
        System.out.println(name+" is drinking " + drinks);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "PersonTask{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth.format(df) +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    /*
    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)

     Extra methods:
         eat(), sleep(), drink(), toString()


     */



}
