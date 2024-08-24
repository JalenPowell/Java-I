import java.text.DecimalFormat;
/**
  *This program shows inherence of WirelessNetwork.
  *@author Jalen Powell
  *@version 11/6/2019
  */
public abstract class WirelessNetwork {
   protected static int count;
   protected String name = "";
   protected double bandwidth = 0;
   protected double monthlyFixedCost = 0;
/**
  *Calls the variables.
  *@param nameIn, bandwidthIn, monthlyFixedCostIn used
  */
   public WirelessNetwork(String nameIn, double bandwidthIn, 
                                                            double monthlyFixedCostIn) {
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyFixedCost = monthlyFixedCostIn;
      count++;
   }
   /**
     *Gets the name.
     *@return name used
     */
   public String getName() {
      return name;
   }
   /**
     *Sets the name.
     *@param nameIn used
     */
   public void setName(String nameIn) {
      this.name = nameIn;
   }
   /**
     *Gets the bandwidth.
     *@return bandwidth used
     */
   public double getBandwidth(){
      return bandwidth;
   }
    /**
      *Sets the bandwidth.
      *@param bandwidthIn used
      */
   public void setBandwidth(double bandwidthIn) {
      this.bandwidth = bandwidthIn;
   }
    /**
      *Get the monthly fixed cost.
      *@return monthlyFixedCost
      */
   public double getMonthlyFixedCost() {
      return monthlyFixedCost;
   }
   /**
     *Sets the Monthly fixed cost.
     *@param monthlyFixedCostIn used
     */
   public void setMonthlyFixedCost(double monthlyFixedCostIn) {
      this.monthlyFixedCost = monthlyFixedCostIn;
   }
     /**
       *Gets the count.
       *@return count used
       */
   public static int getCount() {
      return count;
   }
   /**
     *Resets the count.
     *
     */
   public void resetCount(){
      count = 0;
   }
   /**
     *Prints the toString
     *@return output
     */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
   
      String output = name + " (" + this.getClass() + ") "
         + "Cost:" + df1.format(monthlyCost()) + "\nBandwidth: "
         + bandwidth + " Mbps";
      return output;
   }
   /**
    *Gets the Monthly Cost.
    *@return monthlyCost used
    */
   public abstract double monthlyCost();
   
   public int compareTo(WirelessNetwork u) {
   return name.toLowerCase().compareTo(u.getName().toLowerCase()); 
   }
   
}