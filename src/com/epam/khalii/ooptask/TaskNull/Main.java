package com.epam.khalii.ooptask.TaskNull;

public class Main {

    public static void main(String[] args) {
        Customer[] arr;

        arr = new Customer[]{
                new Customer("Ivanov", "Vasya", "Mykhailovich", "Sumskaya st.", 828323939, 235883),
                new Customer("Sokol", "Sasha", "Borisovich", "Dacha st.", 437232346, 334654),
                new Customer("Torba", "Valentin", "Leonidovich", "Lenin st.", 81239438, 348321),
                new Customer("Cherepahin", "Viktor", "Ivanovich", "Kotlova st.", 212324332, 154953),
                new Customer("Troshin", "Andrey", "Aleksandrovich", "Krasnaya st.", 672347632, 232454),
                new Customer("Margina", "Anna", "Vladimirovna", "Geltaya st.", 144896554, 254899),
                new Customer("Andreev", "Petya", "Konstantinovich", "Chernaya st.", 548794787, 789875),
                new Customer("Morgov", "Zenya", "Mykhailovich", "Belaya st.", 789766567, 776463),
                new Customer("Soroka", "Kolya", "Mykhailovich", "Minskaya st.", 565625265, 454238)
        };

        Base b = new Base(arr);
        System.out.println(b.toString());
        Base c = new Base(b.byAlpha());
        System.out.println(c.toString());
        Base e = new Base(b.byCreditCard(212324332, 672347633));
        System.out.println(e.toString());
    }
}