package day16_StringMethods;

public class EmailDomaine {

    public static void main(String[] args) {


        String email = "cyber.tek@gmail.com";

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".")); //lastindex in case email contains other dots

        System.out.println("domain = " + domain);
    }

}
