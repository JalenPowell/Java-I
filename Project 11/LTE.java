import java.text.DecimalFormat;
/**
  *This program does the thing.
  *@author Jalen Powell
  *@version 11/14/19
  */
public class LTE extends Cellular {


/**
*this is  constant.
*/
   public  static final double  COST_FACTOR = 4.0;     
   
   /**
   *@param nameIn used for input of persons name
   *@param bandwidthIn used for the input
   *@param fixedCostIn used for the cost
   *@param timeIn used for the cost
   *@param datalimitIn used for the input
   */
   public LTE(String  nameIn,   double bandwidthIn, double fixedCostIn,
      double timeIn, double datalimitIn) {
      super(nameIn, bandwidthIn, fixedCostIn, timeIn, datalimitIn);
      
   
   
   }
   
   /**
   *@return double.
   */ 
   public double monthlyCost() {
   /**
      if (dataUsage() <= dataLimit){
      
         return fixedCost;
      }
      else{ 
         return (fixedCost +(dataUsage()-dataLimit)*LTE.COST_FACTOR*2);
      }
      */
      double result = 0;
      if (dataUsage() <= getDataLimit()) {
         result = super.getMonthlyFixedCost();
        
      }
      
      else {
         result = (super.getMonthlyFixedCost() + (dataUsage() 
                    - dataLimit) * COST_FACTOR * 2);   
      }
      
      return result; 
   
   }
   
   
    /**
     *@return String
     */


   public String toString() {
   
      return super.toString();
   
   }






}