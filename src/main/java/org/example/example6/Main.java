package org.example.example6;

public class Main {

    public static void main(String[] args) {
        BagOptimization bagOptimization= new BagOptimization(15);

        Product product= new Product("a",3,15);
        Product product2= new Product("b",7,30);
        Product product3= new Product("c",5,20);
        Product product4= new Product("d",2,25);
        Product product5= new Product("e",3,26);
        Product product6= new Product("f",6,35);

        bagOptimization.addProduct(product);
        bagOptimization.addProduct(product2);
        bagOptimization.addProduct(product3);
        bagOptimization.addProduct(product4);
        bagOptimization.addProduct(product5);
        bagOptimization.addProduct(product6);
    }
}
