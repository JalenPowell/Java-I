/**
 *This program is for the Electronic items.
 *@author Jalen Powell
 *@version 11/4/2019
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight = 0;
   
   /**
    *Sets the final shipping cost.
    */ 
   public static final double SHIPPING_COST = 1.5;
   
   /**
    *Names the variables.
    * @param nameIn takes in the name
    * @param priceIn takes in the price
    * @param weightIn takes in the weight
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   /**
    *This calculates the total cost.
    * @return returns the total cost
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}