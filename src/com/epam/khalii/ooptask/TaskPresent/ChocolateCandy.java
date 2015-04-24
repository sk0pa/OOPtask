package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class ChocolateCandy extends Candy {
    protected String chocolateColor="Black";

    public String getChocolateColor() {
        return chocolateColor;
    }

    public void setChocolateColor(String chocolateColor) {
        if(chocolateColor.equals("Black")||chocolateColor.equals("White")||chocolateColor.equals("Milk"))
            this.chocolateColor = chocolateColor;
    }

    public ChocolateCandy(double sugarPart, double weight, boolean glaze, String chocolateColor) {
        super(sugarPart, weight, glaze);
        this.setChocolateColor(chocolateColor);
    }

    public ChocolateCandy(double sugarPart, boolean glaze, String chocolateColor) {
        super(sugarPart, glaze);
        this.setChocolateColor(chocolateColor);
    }

    public ChocolateCandy(boolean glaze, String chocolateColor) {
        super(glaze);
        this.setChocolateColor(chocolateColor);
    }

    public ChocolateCandy(String chocolateColor) {
        super();
        this.setChocolateColor(chocolateColor);
    }

    public ChocolateCandy(){
        super();
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "sugarPart=" + sugarPart +
                ", weight=" + weight +
                "glaze=" + glaze +
                "chocolateColor='" + chocolateColor + '\'' +
                '}';
    }
}
