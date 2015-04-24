package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class CaramelCandy extends Candy {
    protected String color;
    protected String filling;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public CaramelCandy(double sugarPart, double weight, boolean glaze, String color, String filling) {
        super(sugarPart, weight, glaze);
        this.color = color;
        this.filling = filling;
    }

    public CaramelCandy(double sugarPart, boolean glaze, String color, String filling) {
        super(sugarPart, glaze);
        this.color = color;
        this.filling = filling;
    }

    public CaramelCandy(boolean glaze, String color, String filling) {
        super(glaze);
        this.color = color;
        this.filling = filling;
    }

    public CaramelCandy(String color, String filling) {
        super();
        this.color = color;
        this.filling = filling;
    }

    public CaramelCandy(){
        super();
        this.color = "white";
        this.filling = "fruits";
    }

    @Override
    public String toString() {
        return "CaramelCandy{" +
                "sugarPart=" + sugarPart +
                ", weight=" + weight +
                "glaze=" + glaze +
                "color='" + color + '\'' +
                ", filling='" + filling + '\'' +
                '}';
    }
}
