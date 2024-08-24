import java.io.FileNotFoundException;

 /**
*@Author: Jalen Powell
*@version: 11/21/2019
*/

public class WirelessNetworksPart2 {
/**
*@throws FileNotFoundException used fo this 
*@param args used because i had to 
*/
   public static void main(String[] args) 
                     throws FileNotFoundException {
                     
      WirelessNetworkList a = new WirelessNetworkList();
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         a.readFile(args[0]);
         System.out.print(a.generateReport());
         System.out.print(a.generateReportByName());
         System.out.print(a.generateReportByBandwidth());
         System.out.print(a.generateReportByMonthlyCost());
      
      
      
      
      
      
      }
   
   
   }
}