package day10_If_Statements;

public class BrowserName {

    /*
    write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers'
                names, output should be: Invalid Browser Name

             Ex:
                browserName = "chrome";

                output:
                    Chrome Browser is Selected

     */
    public static void main(String[] args) {

        String browserName = "edge";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari") {
            System.out.println(browserName + " browser is selected");
        }
        else {
            System.out.println("Invalid Browser Name");
        }
    }

}
