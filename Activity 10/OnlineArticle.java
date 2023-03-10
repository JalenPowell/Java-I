/**
 *Thisn program is for the online article.
 *@author Jalen Powell
 *@version 11/4/2019
 */
public class OnlineArticle extends OnlineTextItem {
   
   private int wordCount;

   /**
    *Names the variables.
    * @param nameIn takes in the name
    * @param priceIn takes in the price
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   /**
    *Sets the word count.
    * @param wordsIn sets teh amount of words
    */
   public void setWordCount(int wordsIn) {
      wordCount = wordsIn;
   }
}