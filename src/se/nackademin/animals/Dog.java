package se.nackademin.animals;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-13
 * Time: 09:35
 * Project: KVALIT20-OOP-Lektion22
 * Copyright: MIT
 *
 * Dog är en subklass som ärver från Animal
 */
public class Dog extends Animal{

  public void bark(){
    System.out.println("I can bark!");
  }

  @Override
  public void eat() {
    System.out.println("I eat dog food!");
  }

  @Override
  public String toString() {
    return "Jag är en " + color + " hund!";
  }
}
