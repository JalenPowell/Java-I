import java.util.Comparator;
/**
*@Author: Jalen Powell
*/

public class BandwidthComparator implements Comparator<WirelessNetwork> {


/**
*@param n1 used for this and that
*@param n2 used for this and that 
*@return int for this reason.
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
   
      if (n1.bandwidth < n2.bandwidth) {
         return -1;
      }
      else if (n1.bandwidth > n2.bandwidth) {
         return 1;
      }
      else {
         return 0;
      }
      
   }
    
 
 
 
}
