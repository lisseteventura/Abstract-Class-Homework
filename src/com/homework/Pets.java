package com.homework;

public class Pets implements Pet {
    public String name;

    Pets (){}
    public Pets(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    @Override
    public void feed() {
        System.out.println("Eat from bowl");
    }

    @Override
    public void groom() {
        System.out.println("Go to Petco for grooming");
    }

    @Override
    public void play() {
        System.out.println("Play with toys");
    }
}