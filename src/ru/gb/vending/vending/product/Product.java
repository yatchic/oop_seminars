package ru.gb.vending.vending.product;

public class Product {
      private String name;
      private double price;

    public Product(java.lang.String name, double price) {
        this.name = name;
        this.price = price;
    }

    public java.lang.String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name"+name+", price: "+price+"р.";
    }
}
