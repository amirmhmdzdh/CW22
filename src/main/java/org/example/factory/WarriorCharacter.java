package org.example.factory;

public class WarriorCharacter extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
