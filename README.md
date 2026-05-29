# Zoo Management System

## Project Description

This project is a simple console-based Zoo Management System developed using Java Object-Oriented Programming (OOP) concepts.

The system allows users to:
- Enter animal information
- Display zoo animals
- Simulate animal sounds
- Simulate feeding animals
- Simulate ticket selling

The project demonstrates important Java OOP concepts such as:
- Classes and Objects
- Encapsulation
- Inheritance
- Abstract Classes
- Polymorphism
- Method Overriding
- Method Overloading
- Packages

---

## Project Structure

```text
src/
│
├── model/
│     ├── Animal.java
│     ├── Lion.java
│     ├── Elephant.java
│     └── Monkey.java
│
├── service/
│     ├── ZooKeeper.java
│     └── TicketCounter.java
│
└── Main.java
```

---

## OOP Concepts Demonstrated

### 1. Classes and Objects

Classes used:
- Animal
- Lion
- Elephant
- Monkey
- ZooKeeper
- TicketCounter

Objects are created inside:
- Main.java

Example:

```java
Animal lion = new Lion("Simba", 5);
```

---

### 2. Encapsulation

Encapsulation is implemented using private variables and getters/setters.

File: Animal.java

```java
private String name;
private int age;
private String species;
```

---

### 3. Access Modifiers

The project uses:
- private
- protected
- public

Example:

```java
private String name;
protected String habitat;
public void displayInfo();
```

---

### 4. Inheritance

Inheritance is demonstrated by child classes extending the Animal superclass.

Files:
- Lion.java
- Elephant.java
- Monkey.java

Example:

```java
public class Lion extends Animal
```

---

### 5. Abstract Class

Animal is an abstract class because generic animals should not be created directly.

File: Animal.java

```java
public abstract class Animal
```

---

### 6. Method Overriding (Runtime Polymorphism)

Each animal overrides the makeSound() method.

Files:
- Lion.java
- Elephant.java
- Monkey.java

Example:

```java
@Override
public void makeSound()
```

---

### 7. Method Overloading (Compile-Time Polymorphism)

Method overloading is demonstrated inside:
- ZooKeeper.java
- TicketCounter.java

Examples:

```java
feedAnimal(Animal animal);
feedAnimal(Animal animal, String food);
```

```java
sellTicket();
sellTicket(int visitors);
```

---

### 8. Runtime Polymorphism

Superclass references are used to store subclass objects.

Example:

```java
Animal lion = new Lion("Simba", 5);
```

---

### 9. Packages

Packages are used to organize the project:
- model
- service

---

## Technologies Used

- Java
- IntelliJ IDEA
- OOP Principles

---

## Features

- User input using Scanner
- Animal management
- Feeding simulation
- Ticket selling simulation
- Runtime polymorphism

---

## How to Compile

```bash
javac model/*.java service/*.java Main.java
```

---

## How to Run

```bash
java Main
```

---

## Example Output

```text
=== ZOO ANIMALS ===

Name: Simba
Age: 5
Species: Lion
Habitat: Grassland
Simba says: Roar!

Name: Dumbo
Age: 10
Species: Elephant
Habitat: Forest
Dumbo says: Trumpet!

=== FEEDING ANIMALS ===

John feeds Simba
John feeds Dumbo with Bananas
John is cleaning the zoo.

=== TICKET SALES ===

1 ticket sold for 100.0 ETB
4 tickets sold. Total = 400.0 ETB
```

---

## Author

Danawit Melkamu  
Course: Object-Oriented Programming in Java
