/**
  *This list all the items from InventoryItems.
  *@author Jalen Powell
  *@version 11/11/19
  */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;

/**
  *This establishes the new array item and count.
  *
  */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
  /**
    *This adds object to array and increments count.
    *@param itemIn used
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
     *This calculates the total.
     *@param electronicsSurcharge used
     *@return total used
     */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
  
  /**
    *This creates the output.
    *@return output used
    */
   public String toString() {
      String output = "All inventory:\n\n";
    
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }  
  
}