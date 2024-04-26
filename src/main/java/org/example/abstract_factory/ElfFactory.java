package org.example.abstract_factory;

public class ElfFactory implements ItemFactory{
    @Override
    public Character createCharacter() {
        return new ElfItemFactoryCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new ElfItemFactoryWeapon();
    }

    @Override
    public Armor createArmor() {
        return new ElfItemFactoryArmor();
    }
}
