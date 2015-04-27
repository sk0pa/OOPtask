package com.epam.khalii.ooptask.TaskGod;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Woman extends Human {

    public Woman(String lastName, String firstName, float height, float weight) {
        super(lastName, firstName, height, weight);
        this.gender = false;
    }

    public Human giveBirth(Man partner){
        boolean s=false;
        Random r = new Random();
        if(r.nextDouble()<0.5)
            s = true;
        float h;
        float w;
        if(s){
            h = (float) (partner.getHeight()+0.1*(this.getHeight()-partner.getHeight()));
            w = (float) (partner.getWeight()+0.1*(this.getWeight()-partner.getWeight()));
        }
        else{
            h = (float) (this.getHeight()+0.1*(partner.getHeight()-this.getHeight()));
            w = (float) (this.getWeight()+0.1*(partner.getWeight()-this.getWeight()));
        }
        String ln = partner.getLastName();
        String gend = "girl";
        if(s) gend = "boy";
        System.out.println("Please, type child name. It's a "+gend+"!");
        String fn = "Vasya";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            fn = sc.next();
        }
        if(s)
            return new Man(ln, fn, h, w);
        return new Woman(ln, fn, h, w);
    }
}
