package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Waffle extends Sweet {
    protected String filling;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public Waffle(double sugarPart, double weight, String filling) {
        super(sugarPart, weight);
        this.setFilling(filling);
    }

    public Waffle(double sugarPart, double weight) {
        super(sugarPart, weight);
    }

    public Waffle(double sugarPart) {
        super(sugarPart);
    }

    public Waffle() {
        super();
    }

    @Override
    public String toString() {
        return "Waffle{" +
                "sugarPart=" + sugarPart +
                ", weight=" + weight +
                " gr, filling='" + filling + '\'' +
                '}';
    }
}
