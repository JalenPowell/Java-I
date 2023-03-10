/**
 *This program is for the online book.
 *@author Jalen Powell
 *@version 11/4/2019
 */
public class OnlineBook extends OnlineTextItem {

   protected String author;

   /**
    *Names the variables.
    * @param nameIn takes in the name
    * @param priceIn takes in the price
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

   /**
    *Prints the toString.
    * @return returns the name author and price
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }

   /**
    *Sets the author.
    * @param nameIn sets the authors name
    */
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
}