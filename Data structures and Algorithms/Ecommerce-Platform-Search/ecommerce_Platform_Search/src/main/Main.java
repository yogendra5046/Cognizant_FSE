package main;
public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,"Laptop","Electronics"),
                new Product(102,"Mobile","Electronics"),
                new Product(103,"Headphones","Accessories"),
                new Product(104,"Tablet","Electronics"),
                new Product(105,"Camera","Electronics")

        };

        System.out.println("Linear Search");

        Product p1 =
                SearchAlgorithms.linearSearch(products,"Tablet");

        if(p1 != null)
            System.out.println(p1);
        else
            System.out.println("Product Not Found");



        System.out.println("\nBinary Search");

        Product p2 =
                SearchAlgorithms.binarySearch(products,"Tablet");

        if(p2 != null)
            System.out.println(p2);
        else
            System.out.println("Product Not Found");

    }
}