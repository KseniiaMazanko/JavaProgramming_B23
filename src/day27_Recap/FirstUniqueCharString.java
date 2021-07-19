package day27_Recap;

public class FirstUniqueCharString {

    public static void main(String[] args) {

        //find the first unique character

        String str = "aaaabccccceffg";


        //option 1
        /*for(int i=0; i<str.length(); i++){
            char each = str.charAt(i);
        }
         */

        //option 2
        for (char each : str.replace(" ", "").toCharArray()) {//each represents eaxh characyter of str
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                System.out.println(each);
                break;
            }
        }
    }
}
