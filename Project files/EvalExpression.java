import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *This program will do the thing.
 *
 *@author Jalen Powell
 *@version 9/11/19
 */
public class EvalExpression {
  /**
   *This program will do more things.
   *
   *@param args Command Line arguments (not used)
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x;
      int indexOf;
      double result;
      double firstTerm;
      double secondTerm;
      double finalTerm;
      double denom;
      int left;
      int right;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //The math portion of the crap
      firstTerm = (12.4 * Math.pow(x, 6)) - (1.2 * Math.pow(x, 3));
      secondTerm = 2.6 * Math.pow(x, 5) - 6.8 * x + 7;
      secondTerm = Math.abs(secondTerm); 
      secondTerm = Math.sqrt(secondTerm);
      finalTerm = firstTerm + secondTerm;
      denom = (Math.pow(x, 4) + 9);
      result = (finalTerm / denom);
      
      //Print statements
      System.out.print("Result: " + result);
      String strgResult = Double.toString(result);
      int resultLength = strgResult.length();
      
      indexOf = strgResult.indexOf(".");
      left = indexOf;
      right = resultLength - indexOf  - 1;
      
      System.out.println("\n# of characters to left of decimal point: "
         + left);
      System.out.println("# of characters to right of decimal point: "
         + right);
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      System.out.print("Formatted Result: " + df.format(result)); 
   }
}