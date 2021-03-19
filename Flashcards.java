import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


//System.out.println(r.nextInt(10));
// Button and random function to make questions go differently
//next q = r.nextInt(10)
//JLabelsetText(questions.get(next(q)))
//JButton next = new JButton
//action ActionListener
//action preformed
public class Flashcards{

  JFrame flashWin;
    // Text area for responses
    // Button to flip through cards
    // Label for the questions
    // Label for whether or not the answer is correct

    JTextArea response;
    JButton next;
    JLabel question;
    JLabel correct;

  ArrayList<String> questions;

  public Flashcards(){

    flashWin = new JFrame("The most random questions with kinda wrong answers flashcards");
    flashWin.setSize(600,500);
    flashWin.setVisible(true);

    response = new JTextArea("you should type words here", 10, 20);
    flashWin.add(response);
    response.setBounds(200, 250, 200, 50);

    question = new JLabel("Question");
    flashWin.add(question);
    question.setBounds(250, 150, 200, 50);
    //response.setVisible(true);

questions = new ArrayList<String>();

    next = new JButton("next yay");
    flashWin.add(next);
    next.setBounds(150, 100, 100, 30);
      next.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
          Random r = new Random();
        int sizeA = questions.size();
        if (sizeA > 0) {
          int choice = r.nextInt(questions.size());
          String qu = questions.get(choice);
            questions.setText(qu);

          questions.remove(choice);
        }
        else {
          questions.setText("no more questions :(");
        }
      }
    });

}
public void updateQuestion(String q) {
  question.setText(q);
}

  public static void main(String[] args) {
  //  f.updateQuestion("What is up people?");

HashMap<String, String> cards = new HashMap<String, String>();
      cards.put("What is the capital of Washington?", "Olympia");
      cards.put("Who is the president of the U.S.?","Joe Biden");
      cards.put("What's 1 + 1?","The answer would be 2");
      cards.put("How do you say tree in french?","Arbre");
      cards.put("What is the meaning of life?","an empty pit of nothingness");
      cards.put("What is 23 + 17?","30 numbers");
      cards.put("What do plants use the sun for?","Photosynthesis");
      cards.put("How is the world spinning?","In a circle");
      cards.put("Why are plants blue?","They are not");
      cards.put("When is the 4th of July?","May 22nd");
      cards.put("Who is the leader of the swag club?","Gwynnie");
      cards.put("What is the worst number?","four");
      cards.put("Where is the sun?","On mars");

    Flashcards f = new Flashcards();
      f.questions.add("What is the capital of Washington?");
      f.questions.add("Who is the president of the U.S.?");
      f.questions.add("What's 1 + 1?");
      f.questions.add("How do you say tree in french?");
      f.questions.add("What is the meaning of life?");
      f.questions.add("What is 23 + 17");
      f.questions.add("What do plants use the sun for?");
      f.questions.add("How is the world spinning?");
      f.questions.add("Why are plants blue?");
      f.questions.add("When is the 4th of July?");
      f.questions.add("Who is the leader of the swag club?");
      f.questions.add("What is the worst number?");
      f.questions.add("Where is the sun?");


      System.out.println(questions.size());

      Random r = new Random();
      int sizeA = questions.size();
      for (int i=0; i<sizeA; i++){
        int choice = r.nextInt(questions.size());
        String qu = questions.get(choice);
        System.out.println(questions.get(choice));
        System.out.println(cards.get(qu));
        questions.remove(choice);

    }
  }
}
