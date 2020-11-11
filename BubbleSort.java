import java.util.*;
import java.util.Random;

class BubbleSort {
  public static void main(String[] args) {
    System.out.println("Unsorted List");
          Random rd = new Random();
          int[] arr = new int[2000];
          for (int i = 0; i < arr.length; i++) {
             arr[i] = rd.nextInt();
             System.out.println(arr[i]);
           }

          
               double finish = System.nanoTime();
               double t = (finish - start) / 100000000;
               System.out.print(t);
               System.out.println(" seconds");
       }
  }
