package day49_Exception;

public class ThrowKeyword {

    public static void main(String[] args) {


        //throw new RuntimeException("This is an unexpected event");

        String browser = "Edge";

        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Chrome browser is selected");
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox browser is selected");
        }
        else if(browser.equalsIgnoreCase("opera")){
            System.out.println("Opera browser is selected");
        }
        else if(browser.equalsIgnoreCase("safari")){
            System.out.println("safari browser is selected");
        }
        else{
            throw new RuntimeException("Invalid browser name" + browser);
        }




    }


}
