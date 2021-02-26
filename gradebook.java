import java.util.*;
import java.io.*;

class Grades {

  public static void main(String[] args) {
    ArrayList<String> ClassN = new ArrayList<String>();
    ArrayList<String> ClassNU = new ArrayList<String>();
    ArrayList<String> ClassSE = new ArrayList<String>();
    ArrayList<String> TA = new ArrayList<String>();
    ArrayList<String> TN = new ArrayList<String>();
    ArrayList<String> LastName = new ArrayList<String>();
    ArrayList<String> FirstName = new ArrayList<String>();
    ArrayList<String> TheThing = new ArrayList<String>();
    ArrayList<String> Grade = new ArrayList<String>();
    int Coot = 0;

    try {
      File data = new File("grades.txt");
      Scanner list = new Scanner(data);

      while (list.hasNext()) {
        if (Coot < 5){
        ClassN.add(list.next());
        Coot = Coot + 1;
        ClassNU.add(list.next());
        Coot = Coot + 1;
        ClassSE.add(list.next());
        Coot = Coot + 1;
        TA.add(list.next());
        Coot = Coot + 1;
        TN.add(list.next());
        Coot = Coot + 1;
      }
        LastName.add(list.next());
        FirstName.add(list.next());
        TheThing.add(list.next());
        Grade.add(list.next());
}
}
catch (FileNotFoundException e) {
e.printStackTrace();
}
int SI = LastName.size();
for (int i = 0; i<SI; i ++){
  String str = LastName.get(i);
  String strNew = str.substring(0, str.length()-1);
  LastName.set(i, strNew);
}
//Testing-System.out.println(LastName.get(0));-works
int SI2 = Grade.size();
for (int i = 0; i<SI2; i++){
  String str = Grade.get(i);
  String strNew = str.substring(0, str.length()-1);
  Grade.set(i, strNew);
}
//Testing-System.out.println(Grade.get(0));-works
Double [] Gr = new Double [SI2];
      for(int i=0; i<Gr.length; i++) {
         Gr[i] = Double.parseDouble(Grade.get(i));
      }
//Testing-System.out.println(Gr[0]);-works
Double mean = 0.0;
ArrayList<Double> A = new ArrayList<>();
ArrayList<Double> B = new ArrayList<>();
ArrayList<Double> C = new ArrayList<>();
ArrayList<Double> D = new ArrayList<>();
ArrayList<Double> F = new ArrayList<>();
Double best = 0.0;
Double worst = 10000.0;
int b = 0;
int w = 0;
for (int i = 0; i<Gr.length; i ++){
  mean = mean + Gr[i];
  if (Gr[i] >= 90){
    A.add(Gr[i]);
  }
  if (Gr[i] >= 80 && Gr[i] < 90){
    B.add(Gr[i]);
  }
  if (Gr[i] >= 70 && Gr[i] < 80){
    C.add(Gr[i]);
  }
  if (Gr[i] >= 60 && Gr[i] < 70){
    D.add(Gr[i]);
  }
  if (Gr[i] < 60){
    F.add(Gr[i]);
  }
  if (Gr[i] > best) {
        best = Gr[i];
        b = i;
      }
  if (Gr[i] < worst) {
        worst = Gr[i];
        w = i;
      }
}
mean = mean/Gr.length;
//Test-System.out.println(mean);-works
//Test-System.out.println(A.get(1));-works
System.out.println("\n====== GRADES!!! ======\n\n");
System.out.println("Welcome to the Student Gradebook, what would you like to see?");
System.out.println("1. Mean Grade");
System.out.println("2. Grade Spread (Number of A’s, B’s, C’s, D’s and F’s)");
System.out.println("3. Top Grade");
System.out.println("4. Lowest Grade");
System.out.println("5. Class Subject and Teacher");
System.out.println("6. Student Roster");
Scanner choice = new Scanner(System.in);
    String ch = choice.next();
if (ch.equals("1")) {
    System.out.println("The mean grade is " + mean + "%");
    }
if (ch.equals("2")) {
    System.out.println("The number of A's is: " + A.size());
    System.out.println("The number of B's is: " + B.size());
    System.out.println("The number of C's is: " + C.size());
    System.out.println("The number of D's is: " + D.size());
    System.out.println("The number of F's is: " + F.size());
    }
if (ch.equals("3")) {
    System.out.println("The highest grade is " + Gr[b] + "%");
    }
if (ch.equals("4")) {
    System.out.println("The lowest grade is " + Gr[w] + "%");
    }
if (ch.equals("5")) {
    System.out.println("The class subject is " + ClassN.get(0) + " " + ClassNU.get(0) + " and the teacher is " + TA.get(0) + " " + TN.get(0));
    }
if (ch.equals("6")) {
    System.out.println("The student roster is:");
    for (int i = 0; i<FirstName.size(); i ++){
      System.out.println(FirstName.get(i) + " " + LastName.get(i));
    }
    }
}
}
