package com.epam.khalii.ooptask.TaskVector;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Plate extends Item {
    protected String material;
    protected int diameter;
    static int count=0;
    static double sum=0;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Plate(){
        this.material = "glass";
        this.diameter = 15;
        this.name="Plate";
        count++;
        sum+=this.price;
    }

    public Plate(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
        this.name="Plate";
        count++;
        sum+=this.price;
    }

    public Plate(double price, String name, String material, int diameter) {
        super(price, name);
        this.material = material;
        this.diameter = diameter;
        count++;
        sum+=this.price;
    }

    static double getAverage(){
        return sum/count;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                " sm}";
    }
}
