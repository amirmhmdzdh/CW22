package org.example.abstract_factory;

public class Main {
    public static void main(String[] args) {
        ItemFactory elfFactory = new ElfFactory();
        ItemFactory orcFactory = new OrcFactory();

        elfFactory.createArmor().attack();
        elfFactory.createCharacter().attack();
        elfFactory.createWeapon().attack();

        System.out.println();

        orcFactory.createArmor().attack();
        orcFactory.createCharacter().attack();
        orcFactory.createWeapon().attack();
    }
}
