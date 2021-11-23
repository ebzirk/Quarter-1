package edu.neumont;

public class Product {
    //Final Variables Declared
    private final static double TAX = 0.085;
    private final static double MIN_PRICE = 0;
    private final static double MAX_PRICE = 10000;
    private String name;
    private double price;


    public Product() {}

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    //7-3 Method Overloading
    public void setPrice(double price) {
        //8-3 Throw Exception
        try {
            if (price < MIN_PRICE || price > MAX_PRICE) {
                throw new IllegalArgumentException("Price is out of range " + price);
            }
            this.price = price;
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setPrice(int price) {
        setPrice((double)price);
        this.price = price;
    }

    public void setPrice(String price) {
        //Exception Catching Code
        try {
            setPrice(Double.parseDouble(price));
        } catch (NumberFormatException ex) {
            System.out.println("Number format " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception " + ex.getMessage());
        }
    }


    double getTax() {
        return TAX;
    }

    public double getTotal() {
        return price + getTax();
    }


    public void display() {
        System.out.println("name: " + name + "\n price " + price);
    }

}