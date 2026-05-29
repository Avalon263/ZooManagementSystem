import java.util.ArrayList;
import java.util.Scanner;

import model.*;
import service.TicketCounter;
import service.ZooKeeper;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("=== ZOO MANAGEMENT SYSTEM ===");

        // Lion input
        System.out.println("\nEnter Lion Name:");
        String lionName = input.nextLine();

        System.out.println("Enter Lion Age:");
        int lionAge = input.nextInt();
        input.nextLine();

        Animal lion = new Lion(lionName, lionAge);

        // Elephant input
        System.out.println("\nEnter Elephant Name:");
        String elephantName = input.nextLine();

        System.out.println("Enter Elephant Age:");
        int elephantAge = input.nextInt();
        input.nextLine();

        Animal elephant = new Elephant(elephantName, elephantAge);

        // Monkey input
        System.out.println("\nEnter Monkey Name:");
        String monkeyName = input.nextLine();

        System.out.println("Enter Monkey Age:");
        int monkeyAge = input.nextInt();
        input.nextLine();

        Animal monkey = new Monkey(monkeyName, monkeyAge);

        // Add animals to ArrayList
        animals.add(lion);
        animals.add(elephant);
        animals.add(monkey);

        // Display animal
        System.out.println("\n=== ZOO ANIMALS ===\n");

        for (Animal animal : animals) {

            animal.displayInfo();
            animal.makeSound();

            System.out.println();
        }

        // Zookeeper input
        System.out.println("Enter Zookeeper Name:");
        String keeperName = input.nextLine();

        ZooKeeper keeper = new ZooKeeper(keeperName);

        System.out.println("\n=== FEEDING ANIMALS ===");

        keeper.feedAnimal(lion);
        keeper.feedAnimal(elephant, "Bananas");

        keeper.cleanZoo();

        // Ticket Counter
        TicketCounter counter = new TicketCounter();

        System.out.println("\n=== TICKET SALES ===");

        counter.sellTicket();

        System.out.println("How many visitors?");
        int visitors = input.nextInt();

        counter.sellTicket(visitors);

        input.close();
    }
}