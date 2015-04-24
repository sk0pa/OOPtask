package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 23.04.2015.
 */
public class Candy extends Sweet {
    protected boolean glaze;

    public boolean isGlaze() {
        return glaze;
    }

    public void setGlaze(boolean glaze) {
        this.glaze = glaze;
    }

    public Candy(double sugarPart, double weight, boolean glaze) {
        super(sugarPart, weight);
        this.glaze = glaze;
    }

    public Candy(double sugarPart, boolean glaze) {
        super(sugarPart);
        this.glaze = glaze;
    }

    public Candy(boolean glaze) {
        this.glaze = glaze;
    }

    public Candy() {
        this.glaze=false;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "sugarPart=" + sugarPart +
                ", weight=" + weight +
                " gr, glaze=" + glaze +
                '}';
    }
}
