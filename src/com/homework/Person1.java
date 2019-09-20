package com.homework;

public class Person1 extends Household{

    public Person1 (Pets pet, double taxRate, int income){
        super(pet, taxRate, income);
    }
    @Override
     public double payTax(int income, double n2) {
        return income * n2;
    }

}
