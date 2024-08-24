import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/**
  *
  *@author Jalen Powell
  *@version 11/20/19
  */
public class WirelessNetworkList {
   private WirelessNetwork[] network;
   private String element[];
   
 /**
   *
   *
   *
   */
   public WirelessNetworkList() {
      WirelessNetwork[] network = new WirelessNetwork[0];                   
      String[] element = new String[0];
   
   }
   /**
     *
     *
     *
     */
   public WirelessNetwork[] getWirelessNetworksArray() {
      return network;
   }
   /**
     *
     *
     *
     */
   public String[] getInvalidRecordsArray() {
      return element;
   }
   /**
     *
     *
     *
     */
   public void addWirelessNetwork(WirelessNetwork networkIn) {
      network = Arrays.copyOf(network, network.length + 1);
      network[network.length - 1] = networkIn;
   }
   /**
     *
     *
     *
     */
   public void addInvalidRecord(String elementIn) {
      element = Arrays.copyOf(element, element.length + 1);
      element[element.length - 1] = elementIn;
   }
   /**
     *
     *
     *
     */
   public void readFile(String fileNameIn) 
                                             throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      char input;
      String nameOfList;
   
      while(scanFile.hasNext()) {
      
         nameOfList = scanFile.nextLine();
      
         Scanner secondScan = new Scanner(nameOfList);
         secondScan.useDelimiter(",");
         char category = secondScan.next().charAt(0);
         String name;
         double bandwidth;
         double monthlyFixedCost;
         double time;
         double dataLimit;
         double modemCost;
      
         switch(category) {
         
            case 'W':
               name =  secondScan.next();
               bandwidth = Double.parseDouble(secondScan.next());
               monthlyFixedCost = Double.parseDouble(secondScan.next());
               modemCost = Double.parseDouble(secondScan.next());
               WiFi wObj = new WiFi(name, bandwidth, monthlyFixedCost, 
                                          modemCost);
               addWirelessNetwork(wObj);
               break;
         
            case 'C':
               name =  secondScan.next();
               bandwidth = Double.parseDouble(secondScan.next());
               monthlyFixedCost = Double.parseDouble(secondScan.next());
               time = Double.parseDouble(secondScan.next());
               dataLimit = Double.parseDouble(secondScan.next());
               Cellular cObj = new Cellular(name, bandwidth, monthlyFixedCost,
                                                      time, dataLimit);
               addWirelessNetwork(cObj);
               break;
         
            case 'L':
               name =  secondScan.next();
               bandwidth = Double.parseDouble(secondScan.next());
               monthlyFixedCost = Double.parseDouble(secondScan.next());
               time = Double.parseDouble(secondScan.next());
               dataLimit = Double.parseDouble(secondScan.next());
               LTE lObj = new LTE(name, bandwidth, monthlyFixedCost,
                                                      time, dataLimit);
               addWirelessNetwork(lObj);
               break;
         
         
            case 'F':
               name =  secondScan.next();
               bandwidth = Double.parseDouble(secondScan.next());
               monthlyFixedCost = Double.parseDouble(secondScan.next());
               time = Double.parseDouble(secondScan.next());
               dataLimit = Double.parseDouble(secondScan.next());
               FiveG fObj = new FiveG(name, bandwidth, monthlyFixedCost,
                                                      time, dataLimit);
               addWirelessNetwork(fObj);
               break;
         
         
            default:
               name = secondScan.next();
               addInvalidRecord(name);
            
               continue;
         }
      }
     
   }
   /**
     *
     *
     *
     */
   public String generateReport(){
   
   
      String re = "-------------------------------\n"
                   + "Monthly Wireless Network Report\n"
                   + "-------------------------------\n";
      
      for (int i = 0; i < network.length; i++) {
         re += network[i].toString() + "\n\n";
      
      
      
      } 
      
      return re;
   }
    /**
   *@return re
   */
   public String generateReportByName() {
   
   
   
      Arrays.sort(network);
      String re = "-----------------------------------------\n"
                   + "Monthly Wireless Network Report (by Name)\n"
                   + "-----------------------------------------\n";
      for (int i = 0; i < network.length; i++) {
         re += network[i].toString() + "\n\n";
      
      }
      return re;
   
   
   }
    /**
   *@return re
   */
   
   public String generateReportByBandwidth() {
      String re = "----------------------------------------------\n"
                   + "Monthly Wireless Network Report (by Bandwidth)\n"
                   + "----------------------------------------------\n";
      Arrays.sort(network, new BandwidthComparator());             
      for (int i = 0; i < network.length; i++) {
         re += network[i].toString() + "\n\n";
      
      }
      return re;
   
   }
   /**
   *@return re
   */
   
  
   public String generateReportByMonthlyCost() {
   
      String re = "-------------------------------------------------\n"
                   + "Monthly Wireless Network Report (by Monthly Cost)\n"
                   + "-------------------------------------------------\n";
   
      Arrays.sort(network, new MonthlyCostComparator()); 
      for (int i = 0; i < network.length; i++) {
         re += network[i].toString() + "\n\n";
      
      }
      return re;
   
   }



   


}