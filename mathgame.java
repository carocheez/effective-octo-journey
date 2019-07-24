import java.util.*;
import java.util.Random; 


class Main {
  public static int a = 0;
  public static int b = 0;

  public static void main(String[] args) {
  /**
  Scanner object is created to read input
  The Scanner object is called "in"
  **/
    Scanner in = new Scanner(System.in); 
    boolean isRunning = true;
    
    System.out.println("Which math skills would you like to exercise today? Type 0 for addition  Type 1 for subtraction Type 2 for multiplication Type 3 for division");

    int operation = in.nextInt(); 
    while (isRunning) {
      System.out.println(generateProblem(operation));
      int num = in.nextInt();
      int correctAnswer = 0;
      if (operation == 0){
        correctAnswer = a + b;
      }
      if (operation == 1){
        correctAnswer = a - b;
      }
      if (operation == 2){
        correctAnswer = a * b;
      }
      if (operation == 3){
        correctAnswer = a /b;
      }
      if (num == correctAnswer) {
        System.out.println("Correct!");
      }
      else {
        System.out.println("Wrong! Try Again!"); 
      }
      System.out.println("Would you like to continue? Type 1 or 0");
      int replay = in.nextInt();
      if (replay == 0) {
        isRunning = false;
      }
    }
  }

  public static String generateProblem(int x){
    a = (int)(Math.random() * 9) + 1;
    /**
    Math.random() generates number between
    0 (inclusive) and 1 (exclusive)
    **/
    b = (int)(Math.random() * 9) + 1;
    String operator = "";

    String[] operations = {" + ", " - ", " * ", " / "};
    return Integer.toString(a) + operations[x] + Integer.toString(b);
  }
}


