package day51_Abstraction;

public class Test {

    int pages;
    static String author;

    public void set(int pages){
        this.pages=pages;
    }

    public static void main(String[] args) {


        Test test1 = new Test();
        test1.set(0);
        Test test2 = new Test();

        Integer a = 130;
        Integer b = 130;

        System.out.println(a.equals(b));

        System.out.println(test1.pages == test2.pages);
    }

}
