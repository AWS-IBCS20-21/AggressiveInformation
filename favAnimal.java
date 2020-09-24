import java.util.*;

public class FavAnimal {

  String Habitat;
  String ScientificName;
  String Size;
  String SimilarAnimals;
  String WhatMakesThemSpecial;

  public FavAnimal() {
    Habitat= "Whale sharks live in warmer waters.";
    ScientificName = "Rhincodon typus";
    Size = "The are 18-33 ft long and can weigh upto 41,000 pounds." ;
    SimilarAnimals = "Most other kinds of sharks are similar";
    WhatMakesThemSpecial = "They are the biggest species of shark";
  }

  public String returnHabitat() {
      return Habitat;
  }

  public String returnScientificName() {
      return ScientificName;
  }

  public String returnSize() {
      return Size;
  }

  public String returnSimilarAnimals() {
    return SimilarAnimals;
  }

  public String returnWhatMakesThemSpecial() {
    return WhatMakesThemSpecial;
  }

  public static void main(String[] args) {
    FavAnimal shark = new FavAnimal();

    System.out.println("Whale Sharks");

    System.out.println("Pick one of the following number to learn about it.");
    System.out.println("1. Habitat");
    System.out.println("2. Scientific Name");
    System.out.println("3. Size");
    System.out.println("4. Similar Animals");
    System.out.println("5. What makes them special");

    Scanner choice = new Scanner(System.in);
    String ch = choice.next();

    if (ch.equals("1"))  {
      System.out.println(shark.returnHabitat());
    }
    if (ch.equals("2"))  {
      System.out.println(shark.returnScientificName());
    }
    if (ch.equals("3")) {
      System.out.println(shark.returnSize());
    }
    if (ch.equals("4")) {
      System.out.println(shark.returnSimilarAnimals());
    }
    if (ch.equals("5")) {
      System.out.println(shark.returnWhatMakesThemSpecial());
    }
  }

}
