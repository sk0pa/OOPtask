package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Sweet[] sw;
        sw = new Sweet[]{new Waffle(0.4, 10, "cherry"),
                new CaramelCandy(0.9, 30, false, "red", "cherry"),
                new ChocolateCandy(0.99, 40, false, "White"),
                new Candy(0.7, 25, true),
                new Waffle(0.2, 50, "strawberry")};
        Present pr = new Present(sw);
        System.out.println(pr.toString());
        System.out.println("Weight of present = "+pr.getWeight()+" gramm");
        System.out.println("Sweet = "+pr.getSweet(0.39,0.5));
    }
}
