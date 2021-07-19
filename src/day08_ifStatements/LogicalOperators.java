package day08_ifStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println( !true); //false
        System.out.println( !false); //true

        System.out.println("-----------");
        int score = 80;
        boolean passed = score>=60;
        boolean failed = !passed;

        System.out.println(passed);
        System.out.println(failed);
    }
}
