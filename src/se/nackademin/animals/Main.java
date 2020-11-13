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
    animal.color = "red";
    System.out.println(animal); // toString anropas automatiskt
    System.out.println(animal.toString());

    // Skapa en instans av Dog
    Dog dog1 = new Dog();
    System.out.println(dog1);

    // En hund har tillgång till alla metoder i klassen Animal
    dog1.eat();
    dog1.sleep();
    dog1.bark();

    dog1.color = "black";
    System.out.println(dog1);

    Dog dog2 = new Dog();
    System.out.println(dog2);
    dog2.eat();

    Cat cat = new Cat("white");
    System.out.println(cat); // toString anropas automatiskt
    cat.eat();
    cat.meow();
    System.out.println();

    // Objektsamlingar
    System.out.println("Objektsamlingar");
    Animal[] animals = new Animal[2];
    animals[0] = new Dog();
    animals[1] = new Cat("black");
    for (Animal a : animals){
      a.eat();
    }



  }
}
