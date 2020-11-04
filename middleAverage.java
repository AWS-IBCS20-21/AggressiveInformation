import java.util.*;

public class middleAverage{

  public middleAverage(){

  }
  public static void main(String[] args) {
    Scanner choice = new scanner(System.in);
    int ch = choice.nextInt();
    int[] array = new int[ch];

    for (int i = 0; 1 < array.length; i++) {
      int huh = choice.nextInt();
      array[i] = huh;
      System.out.println(array[i]);
    }
  }
}
//public Double middleAverage(int[] a){
//}





// Calculate the average but not include the first 25%
// and not include the last 25%
// Example: input was [1,3,4,6]
// Calculating the average of 3 and 4 avg = 3.5
