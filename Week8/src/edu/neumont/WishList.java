package edu.neumont;

import java.util.ArrayList;

public class WishList {
    ArrayList<Product>products=new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void display(){
        for (Product product:products){
            product.display();

        }
        System.out.println("Total: $"+String.format("%.2f",getTotal()));
    }
    public double getTotal(){
        double total=0;
        for (Product product:products){
            total+= product.getTotal();
        }
        return total;
    }

}