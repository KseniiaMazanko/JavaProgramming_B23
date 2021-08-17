package OfficeHours.wed_August11th_Constructor;

import java.util.ArrayList;

public class Category {

    /*
    ==	Create a class called Category

		Instance Variables :
			- name(String) , ArrayList<Product> products

		Constructor  	   :
			- One Parameter (String name) -> Use this() to call All Arg Constr
			- Two parameter (String name,ArrayList<Product> products)

		Static Variables   :
			- companyName
			- totalEarnings


     */

    public String name;
    public ArrayList<Product> products;
    public static String companyName;
    public static double totalEarnings;

    public Category(String name) {
        this(name, new ArrayList<>());
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    /*
    Instance Methods   :
			- toString - > returns information about Category
			*/



    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    /*
    - addProduct(Product product)->Adds given product quantity to the arrayList products
			- addProduct(ArrayList<Product> product)->Adds given products quantity to the arrayList products

				NOTE: Before adding check this product exist or not

					  if it is exist ;
					  	- if prices are same, increase quantity otherwise give an error message
					  	  	ERROR :Check $product price

					  if it is not exist ;
					  	- Add product/products in arrayList(products)
     */
    public void addProduct(Product product){
        for (Product eachProduct : products) {
            if(eachProduct.equals(product)){
                if(eachProduct.price==product.price){
                    eachProduct.quantity+=product.quantity;
                    System.out.println("Product already exists!");
                    System.out.println("Quantity is increased by " + product.quantity);
                }
                else{
                    System.out.println(product.name +" already exists");
                    System.out.println("Check " + product.name + " price");
                }
                return;
            }

        }

        products.add(product);
        System.out.println(product.name + " is added");
    }

    public void addProduct(ArrayList<Product> product){
        for (Product eachProduct : product) {
                    addProduct(eachProduct);
        }
    }

    /*
			- sellProduct(Product product) ->Removes given product quantity from the arrayList products

			- sellProduct(ArrayList<Product> product)->Removes given product quantity from the arrayList products

				NOTE: Before sell product check productList

					  if it is exist ;
						  	- if quantity is enough to sell, sell it
						  		Update quantity,
						  		increase totalEarnings   ( totalEarnings = quantity*price)

						  	- if quantity is not enough to sell
						  		ERROR : Quantity is not enough to sell

					  if it is not exist ;
					  	- ERROR : There is no product to sell
     */

    public void sellProduct (Product product){
        for (Product eachProduct : products) {
            if(eachProduct.name.equals(product.name)){
                if(eachProduct.quantity<= product.quantity){
                    eachProduct.quantity-=product.quantity;
                    System.out.println(product.name + " is decreased by " + product.quantity);
                    totalEarnings+=product.quantity*product.price;
                }
                else{
                    System.out.println(product.name + " quantity is not enough to sell");
                }
                return;
            }
        }
        System.out.println(product.name + " does not exist");
    }


    public void sellProduct (ArrayList<Product> product){
        for (Product eachProduct : products) {
            sellProduct(eachProduct);
        }
    }


}
