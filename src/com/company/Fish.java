package com.company;

public class Fish extends Animal {

    public void move(int direction) {
        /*Swin in the direction passed as a pharameter*/
        super.move(direction);
        System.out.println("Swimming to the left");
    }
}
