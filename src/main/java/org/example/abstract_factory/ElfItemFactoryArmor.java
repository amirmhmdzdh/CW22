package org.example.abstract_factory;

public class ElfItemFactoryArmor implements Armor{

    @Override
    public void attack() {
        System.out.println("Elf armor attack");
    }
}
