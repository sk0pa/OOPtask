package com.epam.khalii.ooptask.TaskPresent;

/**
 * Created by Anhelina_Khalii on 23.04.2015.
 */
abstract public class Sweet {
    protected double sugarPart=0.7;
    protected double weight=5;

    public double getSugarPart() {
        return sugarPart;
    }

    public void setSugarPart(double sugarPart) {
        if(sugarPart>0&&sugarPart<1)
            this.sugarPart = sugarPart;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Sweet(double sugarPart, double weight) {
        this.setSugarPart(sugarPart);
        this.setWeight(weight);
    }

    public Sweet(double sugarPart) {
        this.setSugarPart(sugarPart);
    }

    public Sweet(){
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "sugarPart=" + sugarPart +
                ", weight=" + weight +
                " gr}";
    }
}
