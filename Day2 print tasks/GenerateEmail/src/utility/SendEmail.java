package utility;

import utility.GmailUtility;

public class SendEmail {


    /*
In order to use your own gmail account:
    first Step:
        go to:
            https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web

                Make sure that your google account allows third party app
*/

        public static void main(String[] args) {

            // your google account credentials:
            String userName = "ksmazanko@gmail.com";
            String passWord = "7VGldi7GE8";

            // email info:
            String[] receivers = {
                    "lilimiller094@gmail.com"


            };

            String subject ="Kseniia";
            String MSG ="Hi mom! I am testing an auto-generated email sending system! If it's coming from my personal email let me know. " +
                    "This email should be sent 3 times! I love you!";

            // method call:
            int count = 3;
            for(int i = 1; i<= count; i++) {
                for (String receiver : receivers) {
                    GmailUtility.sendEmails(userName, passWord, receiver, subject, MSG);
                    System.out.println("Send "+i+" email to "+receiver);
                }

            }

            System.out.println("Completed");


        }

    }




