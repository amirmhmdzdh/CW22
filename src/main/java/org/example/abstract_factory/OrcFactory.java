package org.example.abstract_factory;

public class OrcFactory implements ItemFactory{

    @Override
    public Character createCharacter() {
        return new OrcItemFactoryCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new OrcItemFactoryWeapon();
    }

    @Override
    public Armor createArmor() {
        return new OrcItemFactoryArmor();
    }
}
