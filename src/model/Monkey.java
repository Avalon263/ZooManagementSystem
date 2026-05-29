package model;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age, "Monkey");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Ooh Ooh Aah Aah!");
    }
}
