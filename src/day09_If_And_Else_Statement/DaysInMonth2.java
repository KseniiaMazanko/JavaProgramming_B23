package day09_If_And_Else_Statement;

import com.sun.deploy.security.SelectableSecurityManager;

public class DaysInMonth2 {


    public static void main(String[] args) {

        int month = 3;
        if (month ==2 ) {
            System.out.println("28 days");
        }
        else if (month == 4 || month ==6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else {
            System.out.println("31 days");
        }

    }



}
