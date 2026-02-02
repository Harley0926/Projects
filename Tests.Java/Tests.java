import java.util.Scanner; 

public class Tests {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double score1;
      System.out.println("Test Score 1:");
      score1 = scnr.nextDouble();
      
      double score2;
      System.out.println("Test Score 2:");
      score2 = scnr.nextDouble();
      
      double score3;
      System.out.println("Test Score 3:");
      score3 = scnr.nextDouble();
      
      double average;
      average = (score1 + score2 + score3)/3;
      
      double rounded;
      rounded = Math.round(average * 100.00) / 100.00;
      System.out.print("The average of all three test scores is: " + rounded);
      
      
    }
}