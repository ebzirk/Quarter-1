package edu.neumont;

public class Product {
    // 8-2 Enum
    enum eType{
        Undefined,
        Electronic,
        Cosmetics,
        Entertainment,
        Food
    }

    private String name;
    private double price;
    private eType type = eType.Undefined;

    //Final Variables Declared
    private final static double TAX = 0.085;
    private final static double MIN_PRICE = 0;
    private final static double MAX_PRICE = 10000;



    public Product() {}

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, eType type) {
        this.name = name;
        this.price = price;
        this.type = type;
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


    public eType getType() {
        return type;
    }

    public void setType(eType type) {
        this.type = type;
    }

    public void display() {
        System.out.println("name: " + name + "\n price " + price);
    }

}