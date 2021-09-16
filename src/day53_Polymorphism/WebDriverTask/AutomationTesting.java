package day53_Polymorphism.WebDriverTask;

public class AutomationTesting {

    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        chromeDriver.findElement("xpath");
        chromeDriver.getTitle();
        chromeDriver.quit();

        System.out.println("___________________________");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("www.google.com");
        firefoxDriver.findElement("xpath");
        firefoxDriver.getTitle();
        firefoxDriver.quit();

        WebDriver opera = new OperaDriver();//WebDriver is the reference in this case
        opera.get("www.amazon.com");


        //the other way of creating a new driver
        WebDriver driver = getDriver("opera");


    }

    public static WebDriver getDriver(String name) {

        switch (name) {
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FirefoxDriver();

            case "opera":
                return new OperaDriver();

            default:
                throw new RuntimeException("Invalid Browser name");
        }


    }

}
