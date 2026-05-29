package model;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age, "Lion");
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Roar!");
    }
}