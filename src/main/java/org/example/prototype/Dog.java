package org.example.prototype;

public class Dog extends Animal {

    public String breed;

    public Dog() {
    }

    public Dog(Dog dog) {
        super(dog);
        if (dog != null) {
            this.breed = dog.breed;
        }
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }
}
