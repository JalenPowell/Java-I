/**
 *This program establishes the online text item.
 *@author Jalen Powell
 *@version 11/4/2019
 */
public abstract class OnlineTextItem extends InventoryItem {

   /**
    *Names the variables.
    * @param nameIn takes in the name
    * @param priceIn takes in the price
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   /**
    * Calculate the total cost.
    * @return returns the total cost
    */
   public double calculateCost() {
      return price;
   }
}