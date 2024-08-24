import java.util.Scanner;
/**
 * The program will read the barrel's
 * oil measurements in ounces and display them
 * in many fluid increments.
 *
 *@author Jalen Powell
 *@version 9/6/19
 */
public class OilUnits
{
  /**
   * The main method will read the input
   * and display the results.
   *
   *@param args Command Lines arguments (not used)
   */
   public static void main(String[] args)
   {

      Scanner userInput = new Scanner(System.in);

      int ounces = 0;
      int quarts = 0;
      int gallons = 0;
      int barrels = 0;
      int oz = 0;
    
    //Prompts the user to enter the amount of oil (cannot exceed 1,000,000,000 oz)
      System.out.print("Enter amount of oil in ounces: ");
      ounces = userInput.nextInt();

      if (ounces > 1000000000)
      {
         System.out.print("Amount must not exceed 1,000,000,000.");
      }
      else 
      {

      //Converts the measures of oil.
         oz = ounces;
         gallons = ounces / 128;
         barrels = gallons / 42;
         quarts = (ounces % 128) / 32;
         gallons = (ounces / 128) % 42;
         ounces = (ounces % 128) % 32;

      //Prints the results.
         System.out.println("Oil amount in units: ");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         
         System.out.print(oz + " oz = ");
         System.out.print("(" + barrels + " bl * 5376 oz)");
         System.out.print(" + (" + gallons + " gal * 128 oz)");
         System.out.print(" + (" + quarts + " qt * 32 oz)");
         System.out.print(" + (" + ounces + " oz)");
         
      }
   }
}