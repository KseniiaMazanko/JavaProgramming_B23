package day38_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple_Inc {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Karina", 'F', 11, "SDET", 100000);
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setInfo("Abbos", 'M', 12, "QA", 110000);

        Employee employee3 = new Employee();
        employee3.setInfo("Giovanni", 'M', 13, "Junior Developer", 100000);

        Employee employee4 = new Employee();
        employee4.setInfo("Sabir", 'M', 14, "Scrum Master", 95000);

        Employee employee5 = new Employee();
        employee5.setInfo("Hende", 'F', 15, "Junior QA", 90000);

        Employee employee6 = new Employee();
        employee6.setInfo("Viktoria", 'F', 16, "Administrator", 80000);


        Employee [] arr = {employee1,employee2,employee3, employee4,employee5, employee6};
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(arr));
        //employees.addAll(Arrays.asList(arr));
        double budget = 0;
        for( Employee each    :   employees  ){
            //System.out.println(each.employeeName + ":" + each.salary);
            System.out.println(each);
            budget+=each.salary;

        }

        System.out.println(budget);

        System.out.println("__________________________________________");
        ArrayList<Employee> list1 = new ArrayList<>(employees);
        list1.removeIf(employee -> employee.salary>90000);

        for (Employee each : list1) {
            System.out.println(each);
        }

        System.out.println("________________________________");

        //remove the empl tha are not SDET

        ArrayList <Employee> list2 = new ArrayList<>();

        for (Employee each : employees) {
            if(each.jobTitle.equals("SDET")){
                list2.add(each);
            }
        }

        for (Employee each : list2) {
            System.out.println(each);
        }




    }


}
