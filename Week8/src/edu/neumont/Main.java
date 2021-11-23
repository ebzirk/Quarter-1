package edu.neumont;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("headphones", 4.99);
        product.display();
        //product.setPrice("399.99aa");
        Product p1 = new Product("xbox", 499.99);
        p1.setPrice("340");
        p1.display();


        WishList wishlist = new WishList();
        wishlist.add(new Product("Headphones",  100.00));
        wishlist.add(new Product("PS5",450.00));
        wishlist.add(new Product("aaaa's bars",50.00));

        wishlist.display();

    }
}