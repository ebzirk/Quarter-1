package edu.neumont;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("xbox", 499.99, Product.eType.Entertainment);
        p1.setPrice("340");
        p1.display();


        WishList wishlist = new WishList();
        wishlist.add(new Product("Keyboard",100.00, Product.eType.Electronic));
        wishlist.add(new Product("PS5",450.00, Product.eType.Electronic));
        wishlist.add(new Product("Eyeshadow",50.00, Product.eType.Cosmetics));
        wishlist.add(new Product("Steak",39.00, Product.eType.Food));

        wishlist.display();
        wishlist.display(Product.eType.Entertainment);

    }
}