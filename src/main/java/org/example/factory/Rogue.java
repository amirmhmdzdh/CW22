package org.example.factory;

public class Rogue implements Character{
    @Override
    public void attack() {
        System.out.println("rogue attack");


    }

    @Override
    public void defend() {
        System.out.println("rogue defend");

    }

    @Override
    public void move() {
        System.out.println("rogue move");

    }
}
