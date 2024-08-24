import java.util.Comparator;

/**
*@author: Jalen Powell
*@version: 11/21/2019
*/
public class MonthlyCostComparator implements Comparator<WirelessNetwork> {

  /**
*@param n1 used for this
*@param n2 used for this 
*@return int.
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
   
      if (n1.monthlyFixedCost > n2.monthlyFixedCost) {
         return -1;
      }
      else if (n1.monthlyFixedCost < n2.monthlyFixedCost) {
         return 1;
      }
      else {
         return 0;
      }
      
   }
    
 
 
 
}