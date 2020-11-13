package se.nackademin.animals;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-13
 * Time: 10:43
 * Project: KVALIT20-OOP-Lektion22
 * Copyright: MIT
 */
public class Cat extends Animal{

  public Cat(String color) {
    this.color = color;
  }

  public void meow(){
    System.out.println("I can meow!");
  }

  @Override
  public void eat() {
    System.out.println("I eat cat food!");;
  }

  @Override
  public String toString() {
    return "I am a " + color + " cat!";
  }
}
