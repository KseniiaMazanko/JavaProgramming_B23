package day45_Inheritance.employeeTask;

public class AmazonInc {//AmazonInc has a tester
    //AmazonInc has a developer

    public static void main(String[] args) {

        Tester tester = new Tester("Robinson", 'M', 28, 11, "SDET",
                120000);
        tester.eat("steak");
        tester.sleep();
        tester.testing();

        Developer developer = new Developer("Selda", 'F', 27, 12, "Java Developer",
                120000);
        developer.eat("pasta");
        developer.work();
        developer.attendMeeting();
        developer.code();

        Driver driver = new Driver("John", 'M',35, 13, "Driver", 85000);
        driver.eat("fish");





    }


}
