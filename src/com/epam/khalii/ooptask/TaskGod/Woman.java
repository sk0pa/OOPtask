package com.epam.khalii.ooptask.TaskGod;

import java.util.Random;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Woman extends Human {
    final protected boolean gender = false;

    public Woman(boolean gender, String lastName, String firstName, float height, float weight) {
        super(lastName, firstName, height, weight);
    }

    public Human giveBirth(Man partner){
        boolean s=false;
        Random r = new Random();
        if(r.nextDouble()<0.5)
            s = true;
        /**
         * ” женщин, как было указано выше, есть дополнительный метод Уродить человекаФ. ќн имеет следующую реализацию:
         —оздать новый экземпл€р женщины или мужчины с веро€тностью 0.5 со следующими свойствами:
         - им€ (String) - ввести с консоли
         - фамили€ (String) - беретс€ у экземпл€ра с мужским полом
         - рост (float) - копируетс€ у соответствующего экземпл€ра с таким же полом + 0.1*(рост экземпл€ра противоположного рода минус рост однородного экземпл€ра)
         - вес (float) - аналогично росту
         ¬ результате работы программы надо выдать на экран все свойства нового экземпл€ра человека или написать Уничего не вышло... разбежалисьФ. ∆елательно вызовы методов экземпл€ров классов женщин и мужчин сопровождать выводом на экран комментариев к процессу.

         *
         *
         * */
    }
}
