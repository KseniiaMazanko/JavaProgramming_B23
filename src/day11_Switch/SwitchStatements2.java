package day11_Switch;

public class SwitchStatements2 {

    public static void main(String[] args) {


        String name = "NGBF";
        String result = "";

        switch (name) {

            case "chrome":
                result="Chrome browser is selected";
                break;

            case "firefox":
                result = "Firefox browser is selected";
                break;

            case "edge":
                result = "Edge browser is selected";
                break;

            default:
                System.err.println("Invalid browser name");
        }

        System.out.println(result);
    }





}
