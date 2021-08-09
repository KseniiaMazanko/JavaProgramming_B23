package day40_CustomClassStatic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setInfo("Journey to SDET: Cybertek Batch 23", "USA",
                "Adventure, Comedy", "Kuzzat Altay", LocalDate.of(2021, 5, 17));

        String [] casts = {"Mehmet", "Akbar"};
        movie1.addCast("Asiya");
        movie1.addCast(casts);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Ahmet", "Tugba", "Feruza", "Fabricio"));

        movie1.addCast(students);
        System.out.println(movie1);
    }





}
