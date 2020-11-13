package se.nackademin.animals;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-13
 * Time: 09:36
 * Project: KVALIT20-OOP-Lektion22
 * Copyright: MIT
 */
public class Main {

  public static void main(String[] args) {

    // Skapa en instans av Animal
    Animal animal = new Animal();
    System.out.println(animal); // toString anropas automatiskt
    System.out.println(animal.toString());

    // Skapa en instans av Dog
    Dog dog = new Dog();
    System.out.println(dog);

    // En hund har tillgång till alla metoder i klassen Animal
    dog.eat();
    dog.sleep();

  }
}
