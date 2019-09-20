package com.homework;

public class Dog extends Pets {
        boolean likesPeanutButter;

        public Dog(String name, boolean likesPeanutButter){
            super(name);
            this.likesPeanutButter = likesPeanutButter;
        }
    public boolean getLikesPeanutButter (){
            return this.likesPeanutButter;
    }


    @Override
    public void feed() {
        System.out.println("Eat from special bowl");
    }

    @Override
    public void groom() {
        System.out.println("Go to Petco for grooming");
    }

    @Override
    public void play() {
        System.out.println("Play with a stick");
    }
}
