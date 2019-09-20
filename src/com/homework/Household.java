package com.homework;

abstract class Household {
    private int income;
    private double taxRate;
    private Pets pet;



    public Household(Pets pet, double taxRate, int income){
        this.pet = pet;
        this.taxRate = taxRate;
        this.income = income;
    }

    abstract double payTax(int income, double n2);






}
