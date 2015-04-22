package com.epam.khalii.ooptask.TaskNull;

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

        for(int i=0; i<length;i++){
            for(int j=i+1; j<length;j++){

            }
        }

        return result;
    }

}
