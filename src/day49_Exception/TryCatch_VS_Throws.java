package day49_Exception;

import day48_Recap.CybertekTask.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch_VS_Throws {

    public static void main(String[] args) {


        Employee employee1 = null;

        try{
            System.out.println(employee1.getSalary());
        } catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Step 1");


    }

    //throws is not handling the exception permanently
    public static void method1() throws FileNotFoundException {

        new FileInputStream("");

    }

    public static void method2(){
        try{
            new FileInputStream("");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public static void test() {
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





}
