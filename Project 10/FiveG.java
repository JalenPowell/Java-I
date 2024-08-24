import java.text.DecimalFormat;
/**
  *
  *
  *
  */
public class FiveG extends Cellular {
/**
*this is a constant.
*/
   public  static final double  COST_FACTOR = 5.0;
    /**
   *@param nameIn used for input of persons name
   *@param bandwidthIn used for the input
   *@param fixedCostIn used for the cost
   *@param timeIn used for the cost
   *@param datalimitIn used for the input
   */
   
   public FiveG(String  nameIn,   double bandwidthIn, double fixedCostIn,
      double timeIn, double datalimitIn) {
      super(nameIn, bandwidthIn, fixedCostIn,
         timeIn,  datalimitIn);
   }
 
   
  /**
*@return double
*/
   public double monthlyCost() {
   
      double result = 0;
      if (dataUsage() <= getDataLimit()) {
         result = super.getMonthlyFixedCost();
        
      }
      
      else {
         result = (super.getMonthlyFixedCost() + (dataUsage() 
                    - dataLimit) * COST_FACTOR * 3);   
      }
      
      return result; 
   
   
   
   
   }

}