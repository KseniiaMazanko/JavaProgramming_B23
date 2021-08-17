package OfficeHours.wed_August11th_Constructor;

public class Store {

    /*
    ==	Create a class called Store

			- Create Categories ArrayList
			- Create category Objects to add Products/sellProducts
			- Add All category Objects into the categories Arraylist
     */
    public static void main(String[] args) {
        // CHECK REPOSITORY
        System.out.println("===== CHECK REPOSITORY ===");
        System.out.println(StockManagement.electronics);
        System.out.println(StockManagement.kitchen);
        System.out.println(StockManagement.toys);


        // CREATE CATEGORY CLASS WITH PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITH PRODUCTS  ===");
        Category categoryElectronics = new Category("Electronics", StockManagement.electronics);
        System.out.println("categoryElectronics = " + categoryElectronics);

        // CREATE CATEGORY CLASS WITHOUT PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITHOUT PRODUCTS  ===");
        Category categoryToys = new Category("Toys");
        System.out.println("categoryToys = " + categoryToys);

        // ADD FIRST PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD FIRST PRODUCT FOR ELECTRONICS  ===");
        categoryElectronics.addProduct(new Product("TV", 3, 1200));
        System.out.println("categoryElectronics = " + categoryElectronics);










    }





}
