package day24_ForEach;

public class GradeStorage {

    public static void main(String[] args) {

        /*given the following arrays:
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        write a program that can store the gardes of the students in the array named grades*/

        String [] names = {"Anna", "Nancy", "Sarah", "Abbos", "Rafael", "Yulia"};
        int [] scores = {90, 75, 80, 69, 93, 91};
        char [] grades = new char[names.length];
        int countA = 0;//counts the amounts of A,B,C,D,F
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        int sum = 0;//to get the average in the end

        for(int i = 0; i< grades.length; i++){


            int score = scores[i];
            sum+=score;

            if(score >= 90){
                grades[i] = 'A';
                countA++;
            }
            else if (score>=80){
                grades[i] = 'B';
                countB++;
            }
            else if (score >=70){
                grades[i] = 'C';
                countC++;
            }
            else if (score >=60){
                grades[i] = 'D';
                countD++;
            }
            else {
                grades[i] = 'F';
                countF++;
            }

            System.out.println(names[i] + "`s score is " + scores[i] + ", she made : " + grades[i]);


        }

        double average =  sum/(double)grades.length;
        System.out.println(average);
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);






    }

}
