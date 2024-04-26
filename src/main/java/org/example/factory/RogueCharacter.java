package org.example.factory;

public class RogueCharacter extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Rogue();
    }
}
