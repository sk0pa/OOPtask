package com.epam.khalii.ooptask.TaskVector;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Cup extends Item {
    protected int volume;
    protected String color;
    static int count=0;
    static double sum=0;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cup(int volume, String color) {
        this.volume = volume;
        this.color = color;
        this.name = "Cup";
        count++;
        sum+=this.price;
    }

    public Cup(double price, String name, int volume, String color) {
        super(price, name);
        this.volume = volume;
        this.color = color;
        count++;
        sum+=this.price;
    }

    public Cup(){
        this.volume = 500;
        this.color = "White";
        this.name = "Cup";
        count++;
        sum+=this.price;
    }

    static double getAverage(){
        return sum/count;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                " mgr, color='" + color + '\'' +
                '}';
    }
}
