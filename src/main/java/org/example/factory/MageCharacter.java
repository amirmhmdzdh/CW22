package org.example.factory;

public class MageCharacter extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}
