package com.epam.khalii.ooptask.TaskVector;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
abstract public class Item {
    protected double price;
    protected String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item() {
        this.price = 10.0;
        this.name = "Item";
    }

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
