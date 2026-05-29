package service;

import model.Animal;

public class ZooKeeper {

    private String keeperName;

    public ZooKeeper(String keeperName) {
        this.keeperName = keeperName;
    }

    // Method overloading
    public void feedAnimal(Animal animal) {

        System.out.println(
                keeperName + " feeds " + animal.getName()
        );
    }

    public void feedAnimal(Animal animal, String food) {

        System.out.println(
                keeperName
                        + " feeds "
                        + animal.getName()
                        + " with "
                        + food
        );
    }

    public void cleanZoo() {
        System.out.println(keeperName + " is cleaning the zoo.");
    }
}