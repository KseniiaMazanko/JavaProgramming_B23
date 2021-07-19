package day10_If_Statements;

public class VehicleYear {

    public static void main(String[] args) {


        int vehicleYear = 1998;


        String result =(vehicleYear >=1995 && vehicleYear <=1998)? "Your vehicle is fine, enjoy!" :(vehicleYear >=2001 && vehicleYear <=2002)? "Your vehicle is fine, enjoy!" :(vehicleYear >=2004 && vehicleYear <= 2006)?
                "Your vehicle is fine, enjoy!" :(vehicleYear >= 2015 && vehicleYear <=2017)? "Your vehicle is fine, enjoy!" : "Your vehicle needs to be recalled!";

        System.out.println(result);


    }
}
