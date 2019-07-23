//hello im not sure what im doing...
/* 
ideas: 
- uno
*/
import java.util.*;
import java.util.Random; 


class Main {

  public static int a = 0;
  public static int b = 0;

  public static void main(String[] args) {
    System.out.println(generateProblem());
  }

  public static String generateProblem(){
    a = (int)(Math.random() * 9) + 1;
    b = (int)(Math.random() * 9) + 1;
    return Integer.toString(a) + " + " + Integer.toString(b);
  }
}

