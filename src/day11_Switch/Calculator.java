package day11_Switch;

public class Calculator {

    public static void main(String[] args) {
        
        char mathOperators = '+';
        String result = "";
        double n1 = 100;
        double n2 = 6.5;
        
        switch (mathOperators) {
            case '+':
                result = "Addition of numbers " + n1 + " and " + n2 + " is " + (n1+n2);
                break;
            case '-':
                result = "Subtraction of numbers " + n1 + " and " + n2 + " is " + (n1-n2);
                break;
            case '*':
                result = "Multiplication of numbers " + n1 + " and " + n2 + " is " + (n1*n2);
                break;
            case '/':
                result = "Division of numbers " + n1 + " and " + n2 + " is " + (n1/n2);
                break;
            default: 
                result = "Invalid operator";
        }
        System.out.println("result = " + result);
        
        
        
    }
}
