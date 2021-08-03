package day38_CustomClass;

public class Offer {

    /*Attributes:
    Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle

    Actions:
    SetInfo, toString

    create a class named MyOffers
            1. create 7 objects Offer Class and store them into an arraylist
            2. write a program that can only keep the offers from your local area
            3. write program that can remove all the offers that are not SDET or QA
            4. write a program that can remove all the offers that are not WFH
            5. write a program that can remove all the offers that do not have benifits
 */

    public String state, city, jobTitle;
    public double salary;
    boolean hasBenefits, WFH, hasPTO, isFullTime;

    public void setInfo(String state, String city, String jobTitle, double salary,
                        boolean hasBenefits, boolean WFH, boolean hasPTO, boolean isFullTime) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime=isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefits=" + hasBenefits +
                ", WFH=" + WFH +
                ", hasPTO=" + hasPTO +
                ", fullTime " + isFullTime+
                '}';
    }
}
