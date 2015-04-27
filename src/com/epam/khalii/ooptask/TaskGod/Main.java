package com.epam.khalii.ooptask.TaskGod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */

public class Main {

    public static void createInstance(Boolean g1, Boolean g2,
                               String fn1, String fn2, String ln1,
                               String ln2, Float h1, Float h2,
                               Float w1, Float w2){
        Human partner1, partner2;
        if (g1){
            partner1 = new Man(ln1, fn1, h1, w1);
        } else {
            partner1 = new Woman(ln1, fn1, h1, w1);
        }
        if (g2){
            partner2 = new Man(ln2, fn2, h2, w2);
        } else {
            partner2 = new Woman(ln2, fn2, h2, w2);
        }
        Human ch = Human.matchmaker(partner1, partner2);
        if(ch==null) {
            System.out.println("Sorry... They don't like each other.");
        } else System.out.println(ch.toString());
    }

    public static void main(String[] args) {
        String fn1 = "", fn2= "", ln1="", ln2="";
        Float h1=0f, h2=0f, w1=0f, w2=0f;
        Boolean g2=false, g1=false;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please, type gender for first partner (false for woman, true for man)");
            String gender1 = in.readLine();
            g1 = Boolean.parseBoolean(gender1);
            System.out.println("Please, type first name for first partner");
            fn1 = in.readLine();
            System.out.println("Please, type last name for first partner");
            ln1 = in.readLine();
            System.out.println("Please, type weight for first partner");
            String weight1 = in.readLine();
            w1 = Float.parseFloat(weight1);
            System.out.println("Please, type height for first partner");
            String height1 = in.readLine();
            h1 = Float.parseFloat(height1);System.out.println("Please, type gender for second partner (false for woman, true for man)");
            String gender2 = in.readLine();
            g2 = Boolean.parseBoolean(gender2);
            System.out.println("Please, type first name for second partner");
            fn2 = in.readLine();
            System.out.println("Please, type last name for second partner");
            ln2 = in.readLine();
            System.out.println("Please, type weight for second partner");
            String weight2 = in.readLine();
            w2 = Float.parseFloat(weight2);
            System.out.println("Please, type height for second partner");
            String height2 = in.readLine();
            h2 = Float.parseFloat(height2);
            createInstance(g1, g2, fn1, fn2, ln1, ln2, h1, h2, w1, w2);
        }catch (NumberFormatException e){
            System.out.println("Please, input numbers!");
        }
        catch (IOException e) {
            System.out.println("Problem with input data");
        }
    }
}
