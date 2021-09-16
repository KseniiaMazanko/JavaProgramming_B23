package day53_Polymorphism.WebDriverTask;

public class ChromeDriver implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("Chrome Driver is navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome Driver is finding elements by " + locator + "locator");
    }

    @Override
    public void getTitle() {
        System.out.println("Chrome is getting the title of the  current web page");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Chrome browser");
    }

    /*
    WebDriver task:

	1. Create an interface named WebDriver
			abstract methods:
				get(String url);
				findElement(String locator);
				getTitle();
				quit();

	2. Create the following classes that implements the WebDriver
				1. ChromeDriver
				2. FireFoxDriver
				3. EdgeDriver

		Implement all the methods that are required

     */



}
