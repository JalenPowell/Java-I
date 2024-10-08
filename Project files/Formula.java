import java.util.Scanner;
/**
 * This program takes in an input of
 * numbers to substitute in a formula.
 *
 *@author Jalen Powell
 *@version 9/6/19
 */
public class Formula {
  /**
   *The main method intitializes the x, y, and z
   * then substitues into the formula
   *
   *@param args Command Lines arguments (not used)
   */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);

      double x = 0;
      double y = 0;
      double z = 0;
      double xyz = 0;
      double result = 0;
      
      //Prints out the results from substitution
      System.out.println("result = (3x + 10.5) (2y + 7.5) "
         + "(z + 5.5) / xyz");

      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();

      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();

      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();

      //Calculations
      if (x == 0 || y == 0 || z == 0) {
         System.out.print("result = 0.0");
      }
      else {   
         xyz = x * y * z;
         result = (3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5);
         result = result / xyz;
         System.out.println("result = " + result);
      }
   }
}