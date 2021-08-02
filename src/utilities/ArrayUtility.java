package utilities;

import java.util.Arrays;

public class ArrayUtility {
    

    //merge 2 arrays int
    public static int[] mergeTwoArrays (int [] arr1, int[] arr2){
        int [] resultArr = new int [arr1.length+arr2.length];

        int j=0;
        for(int i=0; i<arr1.length; i++){
            resultArr[j++] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            resultArr[j++] = arr2[i];
        }

        return resultArr;

    }

    //merge 2 arrays double
    public static double[] mergeTwoArrays (double [] arr1, double[] arr2){
        double [] resultArr = new double [arr1.length+arr2.length];

        int j=0;
        for(int i=0; i<arr1.length; i++){
            resultArr[j++] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            resultArr[j++] = arr2[i];
        }
        return resultArr;
    }

    //merge 2 arrays String
    public static String[] mergeTwoArrays (String [] arr1, String[] arr2){
        String [] resultArr = new String [arr1.length+arr2.length];

        int j=0;
        for (String each : arr1) {
            resultArr[j++] = each;
        }
        for (String each : arr2) {
            resultArr[j++] = each;
        }

        return resultArr;

    }

    //merge 2 arrays char
    public static char[] mergeTwoArrays (char [] arr1, char[] arr2){
        char [] resultArr = new char [arr1.length+arr2.length];

        int j=0;
        for (char each : arr1) {
            resultArr[j++] = each;
        }
        for (char each : arr2) {
            resultArr[j++] = each;
        }

        return resultArr;

    }




    //adds integer to an int arr
    public static int[] addElement (int[] arr, int num){
        int [] result = new int [arr.length+1];
        int i=0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }

    //adds double to a double arr
    public static double[] addElement (double[] arr, double num){
        double [] result = new double [arr.length+1];
        int i=0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }

    //adds String to a string arr
    public static String[] addElement(String [] arr, String str){
        String [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]=str;
        return result;
    }

    //adds char to a char arr
    public static char[] addElement (char[] arr, char el){
        char [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]= el;
        return result;
    }




    //create a function that returns max number from array int
    public static int max(int[] array){
        int max=array[0];
        for (int each : array) {
            max = Math.max(each, max);
        }
        return max;
    }

    //create a function that returns max number from array double
    public static double max(double[] array){
        double max=array[0];
        for (double each : array) {
            max = Math.max(each, max);
        }
        return max;
    }
    /*SHORTCUT TO REPLACE ALL WORDS AT ONCE:
    copy the method, select the method and press command+r, write int on the first
    line and double on the second line ->Replace All*/


    //create a function that returns min number from array int
    public static int min(int[] array){
        int min=array[0];
        for (int each : array) {
            min = Math.min(each, min);
        }
        return min;
    }

    //create a function that returns min number from array double
    public static double min(double[] array){
        double min=array[0];
        for (double each : array) {
            min = Math.min(each, min);
        }
        return min;
    }




    /*create a method that accepts int array and one int (index)
    array = {10,20,30,40};
    index =2;

    remove(array, index) => {10,20,40};*/

    // remove the element at given index of the array
    public static int[] remove(int[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        int[] result = new int[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // moves all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static double[] remove(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static String[] remove(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }




    //  create a method that can reverse an array int
    public static int[] reverseArray (int array[] ){

        int[] reversed = new int [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    //  create a method that can reverse an array double
    public static double[] reverseArray (double array[] ){

        double[] reversed = new double [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    //  create a method that can reverse an array String
    public static String[] reverseArray (String array[] ){

        String[] reversed = new String [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    //  create a method that can reverse an array char
    public static char[] reverseArray (char array[] ){

        char[] reversed = new char [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }




    /*create a method that accepts two parameters: one integer array and one integer number.
    The method returns true if the number is contained in the integer array, otherwise returns false
     */
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }


    //create method that accepts one double array and one double number and
    // returns the frequency of the number

    public static int frequency(int [] arr, int num){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int frequency (double[] arr, double num){

        int count = 0;

        for (double each : arr) {
            if(each==num){
                count++;
            }
        }
        return count;
    }

    public static int frequency (String[] arr, String str){

        int count = 0;

        for (String each : arr) {
            if(each.equals(str)){
                count++;
            }

        }
        return count;
    }

    public static int frequency(char [] arr, char el){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == el){
                count++;
            }
        }
        return count;
    }


    /*create a method that can return the unique elements from the array of integers
    Ex:
    int[] array = {1,1,2,3,3,4};

    unique(array) ==> {2, 4};
     */
    public static int[] uniqueElementsFromArray (int[] array){

        int[] result = {};

        for (int each : array) {
            if(frequency(array, each) == 1){ //frequency of each el in the arr and if it is one then the el is uniq
                result = ArrayUtility.addElement(result, each);
            }
        }

        return result;
    }

    //create a method that can return the unique elements from the array of double
    public static double[] uniqueElementsFromArray (double[] array){

        double [] resultArr = {};

        for (double each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }

    //create a method that can return the unique elements from the array of String
    public static String[] uniqueElementsFromArray (String[] array){

        String [] resultArr = {};

        for (String each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }

    //create a method that can return the unique elements from the array of char
    public static char[] uniqueElementsFromArray (char[] array){

        char [] resultArr = {};

        for (char each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }



    /*
    1. create a method that can remove the duplicates from an array of integer
            Ex:
              int[] array = {1,1,1,2,2,2,3,4,5,5,5};
              removeDup(array);  ===> {1,2,3,4,5}
     */
    public static int[] removeDuplicates (int [] arr){

        int [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }

    //create a method that can remove the duplicates from an array of double
    public static double[] removeDuplicates (double [] arr){

        double [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }

    //create a method that can remove the duplicates from an array of String
    public static String[] removeDuplicates (String [] arr){

        String [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }

    //create a method that can remove the duplicates from an array of char
    public static char[] removeDuplicates (char [] arr){

        char [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }












}
