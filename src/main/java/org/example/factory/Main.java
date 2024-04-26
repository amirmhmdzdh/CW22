package org.example.factory;

public class Main {
    public static void main(String[] args) {

//        CharacterFactory characterFactory = new CharacterFactory();
//        Character character = characterFactory.createCharacter(CharacterType.WARRIOR);
//        character.attack();

        CharacterFactory characterFactory=new MageCharacter();
        Character character = characterFactory.createCharacter();
        character.attack();
    }
}
