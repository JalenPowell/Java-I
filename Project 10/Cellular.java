import java.text.DecimalFormat;
/**
  *
  *
  *
  */
public class Cellular extends WirelessNetwork {

   protected double time;
   protected double dataLimit;
   /**
   *this is a constant.
   */
   public  static final double  COST_FACTOR = 1.0;
   /**
   *@param nameIn used for input of persons name
   *@param bandwidthIn used for the input
   *@param fixedCostIn used for the cost
   *@param timeIn used for the cost
   *@param datalimitIn used for the input
    
   */

   public Cellular(String  nameIn,   double bandwidthIn, double fixedCostIn,
      double timeIn, double datalimitIn) {
      super(nameIn, bandwidthIn, fixedCostIn);
      time = timeIn;
      dataLimit = datalimitIn;
   
   
   
   
   
   }
   
   
   /**
   *@return time
   */
   
   
   
   public double getTime() {
   
      return time;
   
   
   
   
   
   
   }
   
   
   /**
   *@param timeIn used for this
   */
     
   public void setTime(double timeIn) {
   
      time = timeIn;
   
   
   
   
   }
   
   
   
   
   
   /**
   *@return dataLimit
   */
   public double getDataLimit() {
   
   
      return dataLimit;
   
   
   
   }
   
   
   
   
   /**
   *@param  dataLimitInn used for this
   */
   public void setDataLimit(double dataLimitInn) {
      dataLimit = dataLimitInn;
   
   
   
   
   
   
   
   }
   
   
    /**
   *@return double
   */
   
   public double dataUsage() {
   
      return bandwidth / 8000 * time;
   
   
   
   
   
   }
   
    /**
   *@return double
   */
   public double monthlyCost() {
   
      double monthlyCost = 0;
      if (dataUsage() <= getDataLimit()) {
         return super.getMonthlyFixedCost();
      }
      return (super.getMonthlyFixedCost() 
         + (dataUsage() - getDataLimit()) * Cellular.COST_FACTOR);
   
   
   
   }
   
   
   
   /**
   *@return String
   */
   public String toString() {
   
   /**
   String lola;
   lola = "My Note " + "("  
   */
   
      return super.toString() + "\nTime: " + time + " seconds\n" 
                              + "Data Limit: " + dataLimit + " GB\n" 
                              + "Data Used: " + dataUsage() + " GB\n"; 
   
   
   
   
   
   }
}