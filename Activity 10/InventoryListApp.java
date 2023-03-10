/**
  *This program adds new items to the subclasses.
  *@author Jalen Powell
  *@version 11/11/19
  */
public class InventoryListApp {

/**
  *This sets the new items and Prints output.
  *@param args Command Lines not used
  */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
   }

}
    
    








