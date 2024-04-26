package org.example.prototype;

public abstract class Animal {     // null , abstractFactory , Builder , singleton , proxy  important DesignPattern

    public String name;
    public int age;
    public String species;


    public Animal() {
    }

    public Animal(Animal animal) {
        if (animal != null) {
            this.name = animal.name;
            this.age = animal.age;
            this.species = animal.species;
        }
    }

    public abstract Animal clone();


    void makeSound() {
        System.out.println("the animal makes sound");
    }

}
