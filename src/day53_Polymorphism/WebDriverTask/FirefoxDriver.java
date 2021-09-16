package day53_Polymorphism.WebDriverTask;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Firefox is navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox Driver is finding elements by " + locator + "locator");
    }

    @Override
    public void getTitle() {
        System.out.println("Firefox is getting the title of the  current web page");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Firefox browser");
    }
}
