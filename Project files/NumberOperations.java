/**
  *This program will do something with numbers.
  *
  *@author Jalen Powell
  *@version 9/30/19
  */
public class NumberOperations {
   private int number;
   /**
     *Also does something with numbers.
     *@param numberIn used
     */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
     *Getting the value.
     *@return number
     */
   public int getValue() {
      return number;
   }
   /**
     *Convert data into String.
     *@return output
     */
   public String oddsUnder() {
      String output = "";
      int i = 1;
      while (i < number) {
         if (i % 2 == 1) {
            output += i + "\t";
         }
         i++;
      }
     
      return output;
   }
   /**
     *Convert data into String.
     *@return output
     */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   /**
     *Initializing int.
     *@param compareNumber used
     *@return 0
     */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
     *Convert output to String.
     *@return output
     */
   public String toString() {
      String output = "";
      return number + "";
   }
   
   
   
   
}