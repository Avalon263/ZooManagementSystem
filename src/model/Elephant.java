package model;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age, "Elephant");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Trumpet!");
    }
}