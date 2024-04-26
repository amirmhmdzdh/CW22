package org.example.abstract_factory;

public interface ItemFactory {
    Character createCharacter();
    Weapon createWeapon();
    Armor createArmor();
}
