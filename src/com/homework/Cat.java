package com.homework;

public class Cat extends Pets {
    private boolean eatsMice;

    public Cat(String name, boolean eatsMice) {
        super(name);
        this.eatsMice = eatsMice;
    }
    public boolean getEatsMice () {
        return this.eatsMice;
    }

    @Override
    public void feed() {
        System.out.println("I eat fishy food");
    }

    @Override
    public void groom() {
        System.out.println("Groom myself");
    }

    @Override
    public void play() {
        System.out.println("Play with yarn");
    }
}
