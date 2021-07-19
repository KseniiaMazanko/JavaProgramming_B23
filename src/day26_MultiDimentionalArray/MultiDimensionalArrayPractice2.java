package day26_MultiDimentionalArray;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {

        String [] [] cybertekGroups = {
                {"Ahmed", "Igor", "Andrei", "Mykyta", "Ahmet"},
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve"},
                {"Ahmad","Nazli","Gulistan","Feruza","Jonathan","Aykut","Ateequllah","Saron", "Ahmed"},
                {"Selda", "Ibrahim", "Tamerlan",  "Mehmut", "Sina", "Ahmed"},
                {"Mucahit","memet","tugba","Bobubek","Aliya","Shirin","farid","Zaur","Margi","Laraib","Venera"}
                         } ;
        
        int count =0;
        for (String[] eachGroup : cybertekGroups) {
            for (String eachName : eachGroup) {
                if(eachName.equals("Ahmed")){
                    count++;
                }
            }
        }
        System.out.println(count);


        System.out.println("------------------------");


        String[][][][][] names = { {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} }, {{"Komiljon", "Yasin"}}}   , 
                { {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };

        for (String[][][][] each4D : names) {
            for (String[][][] each3D : each4D) {
                for (String[][] each2D : each3D) {
                    for (String[] each : each2D) {
                        for (String element : each) {
                            System.out.println(element);
                        }
                    }
                    
                }
            }
            
        }

        

    }

}
