import java.text.DecimalFormat;
/**
  *This program on Wifi.
  *@author Jalen Powell
  *@version 11/7/2019
  */
public class WiFi extends WirelessNetwork {
   private double modemCost;
/**
   *
   *
   */
   public WiFi(String nameIn, double bandwidthIn,
                        double monthlyFixedCostIn, double modemCostIn) {                       
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      modemCost = modemCostIn;  
   }
   /**
     *
     *
     */
   public double getModemCost() {
      return modemCost;
   }
   /**
     *
     *
     */
   public void setModemCost(double modemCostIn) {
      modemCost = modemCostIn;
   }
   /**
     *
     *
     */
   public double monthlyCost() {
      return monthlyFixedCost + modemCost;
   }

}