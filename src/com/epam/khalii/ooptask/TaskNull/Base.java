package com.epam.khalii.ooptask.TaskNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Anhelina_Khalii on 22.04.2015.
 */
public class Base {
    private Customer[] customers;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
        this.length = customers.length;
    }

    public Base(Customer[] customers) {
        this.customers = customers;
        this.length=customers.length;
    }

    public Base() {
        this.customers = new Customer[0];
        this.length=0;
    }

    public Customer[] byAlpha(){
        Customer[] result = new Customer[length];
        for(int i=0; i<length;i++){
            result[i]=customers[i];
        }

        for(int i=length-1; i>0 ;i--){
            for (int j=0; j<i; j++){
                if(result[j].compareToByLastName(result[j + 1])>0) {
                    Customer temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }

        return result;
    }

    public Customer[] byCreditCard(long begin, long end){
        ArrayList<Customer> temp = new ArrayList<Customer>();
        for(int i=0; i<length;i++){
            if(customers[i].getCreditCard()<end&&customers[i].getCreditCard()>begin)
                temp.add(customers[i]);
        }
        Customer[] result = temp.toArray(new Customer[temp.size()]);
        return result;
    }

    @Override
    public String toString() {
        return "Base{"+Arrays.toString(customers)+'}';
    }
}
