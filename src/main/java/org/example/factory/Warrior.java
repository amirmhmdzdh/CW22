package org.example.factory;

public class Warrior implements Character {
    @Override
    public void attack() {

        System.out.println("warrior attack");

    }

    @Override
    public void defend() {
        System.out.println("warrior defend");


    }

    @Override
    public void move() {
        System.out.println("warrior move");

    }
}
