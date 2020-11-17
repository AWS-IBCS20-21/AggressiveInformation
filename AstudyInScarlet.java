import java.io.*;
import java.util.*;

public class AstudyInScarlet {


  public static void main(String[] args) {

    StringBuilder fullText = new StringBuilder();

    try {
      File f = new File("AStudyInScarlet.txt");
      Scanner fReader = new Scanner(f);

      while (fReader.hasNextLine()) {
        fullText.append(fReader.nextLine());
      }



    } catch (FileNotFoundException e) {

      System.out.println("File not found");
      e.printStackTrace();
    }

      String fullS = fullText.toString();


    String[] words = fullS.split(" ");

    System.out.println("Average word length: " + fullText.length()/words.length + " characters");

    }
  }
