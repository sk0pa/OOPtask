package com.epam.khalii.ooptask.TaskNull;

/**
 * Created by Anhelina_Khalii on 21.04.2015.
 */
public class Customer {
    static private int iterator=0;
    private int id;
    private String lastName;
    private String firstName;
    private String fatherName;
    private String address;
    private long creditCard;
    private long bankNumber;

    public Customer(String lastName, String firstName, String fatherName, String address, long creditCard, long bankNumber) {
        this.id=iterator++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankNumber = bankNumber;
    }

    public Customer(String lastName, String firstName, String fatherName, String address) {
        this.id = iterator++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.address = address;
        this.creditCard=0;
        this.bankNumber=0;
    }

    public Customer() {
        this.id=iterator++;
        this.lastName = "Ivanov";
        this.firstName = "Ivan";
        this.fatherName = "Ivanovich";
        this.address = "Lenin st.";
        this.creditCard = 0;
        this.bankNumber = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", bankNumber=" + bankNumber +
                "\n}";
    }

    public int compareToByLastName(Customer anotherCustomer) {
        return this.getLastName().compareTo(anotherCustomer.getLastName());
    }

}
