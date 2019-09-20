package com.homework;

public class Person2 extends Household {

    public Person2 (Pets pet, double taxRate, int income){
        super(pet, taxRate, income);
    }
    @Override
    public double payTax(int income, double n2) {
        return income * n2;
    }
}
