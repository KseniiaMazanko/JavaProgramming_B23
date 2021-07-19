package day22_LoopsRecap;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /*
        You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
         */

        //MUHTAR'S METHOD

        String correctUserName = "cybertek";
        String correctPassword = "cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if(u.equals(correctUserName) && p.equals(correctPassword)){
            System.out.println("Logged in");
        }
        else{

            for(int i=1; i<=3; i++) {
                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();

            if(u.equals(correctUserName) && p.equals(correctPassword)){
                System.out.println("Logged in");
                break;
            }

            if(i==3){
                System.out.println("Your account is locked");
                System.exit(0);
            }



            }



        }
        System.out.println("Hello Cybertek");//gets executed only if the user logged in,
        // otherwise the system gets exited
/*  MY METHOD:
        Scanner scan = new Scanner(System.in);


        int count = 0;

        while(count<=3){
            System.out.println("Enter your username:");
            String userName = scan.next();
            System.out.println("Enter your password:");
            String password = scan.next();
            count++;
            if(userName.equals("cybertek") && password.equals("cybertek12345")) {
                System.out.println("Logged in");
                break;
            }
            if(count==3){
                System.out.println("Your account is locked");
                break;
            }

        }*/



    }

}
