package day53_Polymorphism.WebDriverTask;

public interface WebDriver {

    /*
    1. Create an interface named WebDriver
			abstract methods:
				get(String url);
				findElement(String locator);
				getTitle();
				quit();
     */

    public abstract void get(String url);//public and abstract are keywords that given by default

    public void findElement(String locator);

    public void getTitle();

    public void quit();

}
