package day38_CustomClass;

import java.text.DecimalFormat;

public class SalaryRate {
    /*
    SalaryCalculator
    	Attributes:
    		hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

		Actions:
			setInfo(): sets all the fields of SalaryCalculator
			salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
			stateTax(): claculates the totalstateTax
			federalTax(): calculates the total federal tax
			salaryAfterTax(): calculates the salary after tax
			toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
     */

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;


    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }
    public double salary() {
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
       return salary()*stateTaxRate;
    }
    public double getFederalTaxRate(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-getFederalTaxRate();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryRate{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", yearly salary = $" + df.format(salary())+
                ", state tax = $" + df.format(stateTax()) +
                ", federal tax = $" + df.format(getFederalTaxRate())+
                ", salary after tax =$" + df.format(salaryAfterTax()) +
                '}';
    }
}
