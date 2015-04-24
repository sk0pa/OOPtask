package com.epam.khalii.ooptask.TaskVector;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Main {
    //Заполнить контейнер, распечатать, отсортировать, распечатать.
    public static void main(String[] args) {
        Item[] it = new Item[]{new Cup(50.23, "Ruby", 600, "red"),
                new Cup(20.0, "Night", 250, "black"),
                new Cup(25.76, "Sea", 400, "blue"),
                new Cup(30.42, "Sun", 340, "yellow"),
                new Plate(67.85, "Britain", "glass", 20),
                new Plate(32.12, "Russia", "wood", 15),
                new Plate(87.46, "Greece", "ceramics", 25),
                new Plate(35.25, "China", "plastic", 20)};
        Vector vector = new Vector(it);
        vector.print();
        vector.sort();
        vector.print();
    }
}