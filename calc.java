import java.util.Scanner;

class calc{
  public static void main(String[] args) {
    System.out.println("Welcome to the Calculator");

    System.out.println("Pick an operation");
    System.out.println("1. Addition");
    System.out.println("2. Multiply");
    System.out.println("3. Exponent");

    Scanner choice = new Scanner(System.in);
    String ch = choice.next();

    if (ch.equals("1"))  {
      Scanner calc = new Scanner(System.in);
      double num1;
      double num2;
      double result;

      System.out.println("Enter first number");
      num1 = calc.nextDouble();
      System.out.println("Enter second number");
      num2 = calc.nextDouble();
      result = num1 + num2;
      System.out.println(num1 + " added to " + num2 + " is " + result);
    }
    if (ch.equals("2"))  {
      Scanner calc = new Scanner(System.in);
      double num1;
      double num2;
      double result;

      System.out.println("Enter first number");
      num1 = calc.nextDouble();
      System.out.println("Enter second number");
      num2 = calc.nextDouble();
      result = num1 * num2;
      System.out.println(num1 + " multipled by " + num2 + " is " + result);
    }
    if (ch.equals("3"))  {
      public double exponent(double base, double toThePowerOf){
        double result = 1;
        for (int i = 0; i < toThePowerOf; i++){
          result = base * result;
        }
        return result;
        System.out.println(result);
      }

    }

}
