import java.util.*;

public class CoffeeShop {

public static void main(String[] args) {

  System.out.println("");
  System.out.println("Welcome to the Cafe of Coffee. What can I get for you my dude?");
  System.out.println("");

Scanner orderIn = new Scanner(System.in);
  String order = orderIn.nextLine();
    System.out.println("To reiterate you would like " + order);

System.out.println("Can I get a name for that order?");

Scanner userIn = new Scanner(System.in);
String name = userIn.next();

System.out.println("For " + name + "?");
System.out.println("Just a moment please");
System.out.println("...one moment later...");

System.out.println("I have a " + order + " for " + name);
System.out.println("Thank you for making an apperence at the Cafe of Coffee. Come again soon my dude!");
}

}
