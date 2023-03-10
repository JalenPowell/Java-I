/**
 *This program helps with divison.
 * @author Jalen Powell
 * @version 11/18/2019
 */

public class Division {

   /**
    *This program returns the int value and divides it.
    * @param numerator number to be divided
    * @param denominator number to be divided
    * @return returns the int value of the divide numbers
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    *This method preforms floating point divison.
    * @param numerator number to be divided
    * @param denominator number to be divided
    * @return returns teh float value of the divided numbers
    */
   public static float decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The demoninator "
            + "cannot be zero");
      }
      return (float) numerator / denominator;
   }

}