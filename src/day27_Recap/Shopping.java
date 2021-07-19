package day27_Recap;

public class Shopping {

    public static void main(String[] args) {

        /*
        Given:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print a report of each shopping item
            name - price -#ID
         */

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        //1.find out the first index of "Gloves"
        for(int i=0; i<items.length; i++){
            if(items[i].equals("Gloves")){
                System.out.println(i);
                break;
            }
        }
        //2.find out if "iPad" is contained in the item list
        boolean hasIpad = false;
        for (String eachItem : items) {
            if(eachItem.equals("iPad")){
                hasIpad=true;
            }
        }

        System.out.println("hasIpad = " + hasIpad);

        System.out.println("______________________");

        //3. Print a report of each shopping item
        //            name - price -#ID

        for(int i = 0; i<itemIDs.length; i++){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }



    }

}
