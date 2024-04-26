package org.example.abstract_factory;

public class OrcItemFactoryArmor implements Armor{

    @Override
    public void attack() {
        System.out.println("Orc armor attack");
    }
}
