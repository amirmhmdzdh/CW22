package org.example.abstract_factory;

public class OrcItemFactoryWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("Orc Weapon attack");
    }
}
