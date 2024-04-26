package org.example.abstract_factory;

public class ElfItemFactoryWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("Elf Weapon attack");
    }
}
