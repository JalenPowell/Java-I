import java.util.Scanner;
/**
 *This program will app the things.
 *@author Jalen Powell
 *@version 9/18/19
 */
public class IceCreamConeApp {
   /**
    *assigning the Strings and construstors to printed statements
    *Error message if radius or height is less than 0.
    *@param args (not used)
    */
   public static void main(String[] args) {
      String label;
      double radius;
      double height;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter label, radius, and height for " 
         + "an ice cream cone.");
      System.out.print("\tlabel: ");
      label = scan.nextLine();
      System.out.print("\tradius: ");
      radius = scan.nextDouble();
   
      if (radius <=  0) {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      System.out.print("\theight: ");
      height = scan.nextDouble();
   
      if (height <= 0) {
         System.out.print("Error: height must be greater than 0.");
         return;
      }
      else {
         IceCreamCone jalen = new IceCreamCone(label, radius, height);
         System.out.print("\n" + jalen);
      }
      
      
   }
}
