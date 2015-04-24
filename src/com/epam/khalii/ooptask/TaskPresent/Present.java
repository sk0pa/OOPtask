package com.epam.khalii.ooptask.TaskPresent;

import java.util.Arrays;

/**
 * Created by Anhelina_Khalii on 23.04.2015.
 */
public class Present {
    private Sweet[] sweets;

    public Present(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public double getWeight(){
        double sum=0;
        for(int i = 0; i<sweets.length;i++)
            sum+=sweets[i].getWeight();
        return sum;
    }

    public Sweet getSweet(double begin, double end){
        for(int i = 0; i<sweets.length;i++)
            if(sweets[i].getSugarPart()<end&&sweets[i].getSugarPart()>begin)
                return sweets[i];
        return null;
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + Arrays.toString(sweets) +
                '}';
    }
}
