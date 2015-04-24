package com.epam.khalii.ooptask.TaskVector;

import java.util.Arrays;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Vector {
    private Item[] array;

    private int length;

    private int enumerator;

    public Vector(Item[] array) {
        this.array = array;
        enumerator = array.length;
        length = array.length;
    }

    public Vector() {
        length = 100;
        array = new Item[length];
        enumerator = 0;
    }

    public int getEnum(){
        return this.enumerator;
    }

    public Item search(int pos) {
        if (pos < 0 || pos > enumerator) {
            throw new IndexOutOfBoundsException();
        }
        return array[pos];
    }

    private void increase() {
        length *= 2;
        Item[] Temp = new Item[length];
        for (int i = 0; i < enumerator; i++) {
            Temp[i] = array[i];
        }
        array = Temp;
    }

    public void add(Item el) {
        if (enumerator >= length)
            increase();
        array[enumerator++] = el;
    }

    public void print() {
        for (int i = 0; i < enumerator; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void sort(){
        for(int k = enumerator/2; k>0;k/=2){
            for(int i=k; i<enumerator; i++){
                int j;
                Item temp = array[i];
                for(j=i;j>=k;j-=k){
                    if(temp.getPrice()<array[j-k].getPrice())
                        array[j]=array[j-k];
                    else
                        break;
                }
                array[j]=temp;
            }
        }
    }

    @Override
    public String toString() {
        return "Vector{"+Arrays.toString(array)+'}';
    }
}
