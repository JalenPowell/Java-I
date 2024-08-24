import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**
*@throws FileNotFoundException is being used 
*/


public class WirelessNetworksPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   *@throws FileNotFoundException is being used here
   
   **/
   @Test public void defaultTest() throws FileNotFoundException
   {
      WirelessNetworksPart2 a = new WirelessNetworksPart2();
      WirelessNetworkList fv = new WirelessNetworkList();
      String[] args = new String[1];
      args[0] = "wireless_network_data1.csv";
       
      
   
     
     
      WirelessNetworksPart2.main(args);
      String[] args2 = new String[0];
      WirelessNetworksPart2.main(args2);
      
   
      WirelessNetworkList w = new WirelessNetworkList();
      w.readFile("wireless_network_data1.csv");
      Assert.assertEquals("mainTest",  w.generateReport(),
         w.generateReport()); 
   
   
   
   
   }
}
