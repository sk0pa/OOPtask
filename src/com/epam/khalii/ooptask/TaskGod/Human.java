package com.epam.khalii.ooptask.TaskGod;

import java.util.Random;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
abstract public class Human {
    protected boolean gender;
    protected String lastName;
    protected String firstName;
    protected float height;
    protected float weight;

    public Human(String lastName, String firstName, float height, float weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean speak(Human partner){
        if(!this.gender||!partner.gender)
            return true;
        else {
            Random r = new Random();
            if(r.nextDouble()<0.5)
                return true;
        }
        return false;
    }

    public boolean bear(Human partner){
        if(this.gender!=partner.gender) {
            Random r = new Random();
            if(r.nextDouble()<0.7)
                return true;
        } else {
            if(this.gender){
                Random r = new Random();
                if(r.nextDouble()<0.056)
                    return true;
            } else {
                Random r = new Random();
                if(r.nextDouble()<0.05)
                    return true;
            }
        }
        return false;
    }

    public boolean spendTime(Human partner){
        if((Math.abs(100 - this.getHeight()*100)/partner.getHeight())<10){
            Random r = new Random();
            if(r.nextDouble()<0.95)
                return true;
        } else {
            Random r = new Random();
            if(r.nextDouble()<0.85)
                return true;
        }
        return false;
    }

    static Human matchmaker(Human partner1, Human partner2){
        return partner1.relate(partner2);
    }

    public Human relate(Human partner){
        if(this.gender!=partner.gender){
            if(this.speak(partner)&&this.bear(partner)&&this.spendTime(partner)){
                if (this.gender)
                    return  ((Woman)partner).giveBirth((Man)this);
                return ((Woman)this).giveBirth((Man)partner);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
