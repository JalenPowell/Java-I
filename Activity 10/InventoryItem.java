/**
 *This program is for the inventory.
 *@author Jalen Powell
 *@version 11/4/2019
 */
public class InventoryItem {

   protected String name = "";
   protected double price = 0;
   private static double taxRate = 0;

   /**
    *States the variables.
    * @param nameIn takes in the name
    * @param priceIn takes in the price
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

   /**
    *This gets the name.
    * @return returns the name
    */
    
   public String getName() {
      return name;
   }

   /**
    *This calculates the cost.
    * @return returns the total cost
    */
    
   public double calculateCost() {
      return price * (1 + taxRate);
   }

   /**
    *This sets the Tax rates.
    * @param taxRateIn sets the tax rate
    */
    
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

   /**
    *Prints the toString.
    * @return returns the name and the cost
    */

   public String toString() {
      return name + ": $" + calculateCost();
   }
}