package se.nackademin.animals;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-13
 * Time: 09:34
 * Project: KVALIT20-OOP-Lektion22
 * Copyright: MIT
 *
 * Animal är en superklass
 */
public class Animal {

  public void eat(){
    System.out.println("I can eat!");
  }

  public void sleep(){
    System.out.println("I can sleep!");
  }

  @Override
  public String toString() {
    return "Jag är ett djur";
  }
}
