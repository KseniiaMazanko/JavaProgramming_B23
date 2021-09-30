package day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {


    public static void main(String[] args) {

        //
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Kseniia", 125_000);
        employeeMap.put("Vitalii", 110_000);
        employeeMap.put("Hande", 95_000);

        System.out.println(employeeMap);

        int kseniiasSalary = employeeMap.get("Kseniia");
        System.out.println("Kseniia's salary = " + kseniiasSalary);

        employeeMap.remove("Hande");

        System.out.println(employeeMap);

        boolean r1 = employeeMap.containsKey("Muhtar");
        boolean r2 = employeeMap.containsKey("John");
        boolean r3 = employeeMap.containsKey("Vitalii");
        boolean r4 = employeeMap.containsKey("hande");

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("__________________________");

        boolean r5 = employeeMap.containsValue(95000);
        boolean r6 = employeeMap.containsValue(130_000);

        System.out.println("___________________________");

        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        employeeMap.put("Vitalii", 120_000);
        System.out.println(employeeMap);

        employeeMap.put("Elif", 90_000);
        System.out.println("Elif = " + employeeMap.get("Elif"));

        employeeMap.replace("Elif", 100000);

        System.out.println(employeeMap);
        System.out.println("______________________________-");
        employeeMap.replace("Elif", employeeMap.get("Elif")+20_000);
        System.out.println(employeeMap);

        employeeMap.put("Abbos", 115000);
        employeeMap.put("Yuliang", 120000);
        employeeMap.put("Feruza", 125000);
        employeeMap.put("Ahmet", 129000);
        employeeMap.put("Ismail", 111000);
        employeeMap.put("Zorana", 125000);
        employeeMap.put("Mehmet", 130000);
        employeeMap.put("Yuliia", 127005);
        employeeMap.put("Yasin,", 130000);
        employeeMap.put("Meltem", 121000);
        employeeMap.put("Dilem", 150000);
        employeeMap.put("Davut", 123000);
        employeeMap.put("Ekaterina", 135000);
        employeeMap.put("Mehmut", 143000);
        employeeMap.put("Merve,", 122000);
        employeeMap.put("Tamara", 133000);

        System.out.println("________________________________");

        for (String eachName : employeeMap.keySet()) {
            //iterate keys
            System.out.println(eachName + " : " + employeeMap.get(eachName));
        }

        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }

        System.out.println("____________________________");
        //iterate the entries (key and value) ONLY:
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
        }
        
        //FIND THE MAXIMUM SALARY

        int max = Integer.MIN_VALUE;
        String name = "";

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String eachName = entry.getKey();
            Integer eachSalary = entry.getValue();
            if(eachSalary>max){
                max = eachSalary;
                name = eachName;
            }
        }

        System.out.println("name = " + name);
        System.out.println("max = " + max);


    }

}
