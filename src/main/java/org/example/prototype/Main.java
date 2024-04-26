package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Animal> animalsCopy = new ArrayList<>();

        Dog dog = new Dog();

        dog.name = "Jack";
        dog.age = 5;
        dog.species = "gorgi";
        dog.breed = "malos";

        animals.add(dog);

        Dog anotherDog = new Dog();






    }

}