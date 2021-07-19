package day10_If_Statements;

public class FieldTrip {
    /*
    Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your
    field trip. Print the information at the end.
                Data based on grade:
     */
    public static void main(String[] args) {

        int grade = 12;
        String tripName = "";//temporary value
        String teacher = "";//temporary value
        int numberOfGroups = 0;//temporary value

        if (grade > 0 && grade <= 6) {
            if (grade == 1) {
                tripName = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms.Smith";
            } else if (grade == 2) {
                tripName = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                tripName = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms.Wilson";
            } else if (grade == 4) {
                tripName = "Movie theater";
                numberOfGroups = 2;
                teacher = "Ms.Reyes";
            } else if (grade == 5) {
                tripName = "Museum";
                numberOfGroups = 5;
                teacher = "Ms.Lela";
            } else {
                tripName = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. Watt";
            }
        } else {
            tripName = "Unfortunately you're not going on a trip this year";
        }
        System.out.println("Hooray! You're going to " + tripName + " in group number " + numberOfGroups + " groups" + " with " + teacher);

    }

}
