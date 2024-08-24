import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

 /**
*@Author: Jalen Powell
*/
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void testGetWirelessNetWorksArray() {
      WirelessNetworkList a = new WirelessNetworkList();
      
      
      Assert.assertArrayEquals("This is what needs to be returned",
         a.getWirelessNetworksArray(), a.getWirelessNetworksArray());
      
   }
   
     
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testGetInvalidRecordArray() {
   
      WirelessNetworkList  b = new WirelessNetworkList();
      Assert.assertArrayEquals("This is what needs to be returned",
         b.getInvalidRecordsArray(), b.getInvalidRecordsArray());
   
   
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   
   
   @Test public void testaddWirelessNetwork() {
      LTE lObj = new LTE("teresa", 450, 40.00, 1200, 1);
      WirelessNetworkList  c = new WirelessNetworkList();
      c.addWirelessNetwork(lObj);
      Assert.assertEquals("hello", c.getWirelessNetworksArray(),
         c.getWirelessNetworksArray());
   
   
   
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testInvalidRecordsArray() {
      WirelessNetworkList  c = new WirelessNetworkList();
      c.addInvalidRecord("Jalen Powell");
      Assert.assertEquals("this is it ", c.getInvalidRecordsArray(),
         c.getInvalidRecordsArray());
   
   
   }
   
   
   /** Fixture initialization (common initialization.
    *@throws FileNotFoundException
    for all tests). **/
   @Test public void testReadFile()throws FileNotFoundException {
      WirelessNetworkList e = new WirelessNetworkList();
      e.readFile("wireless_network_data1.csv");
      LTE lObj = new LTE("My iPad", 20, 30, 1200, 2);
      WiFi wObj = new WiFi("My Wifi", 450, 40, 5);
      Cellular cObj = new Cellular("My Note", 5, 20, 1200, 1);
      FiveG fObj = new FiveG("My Phone", 80, 50, 1200, 10); 
      Assert.assertEquals("this is that i need", e.getWirelessNetworksArray(),
         e.getWirelessNetworksArray());
   
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testgenerateReport() {
      WirelessNetworkList f = new WirelessNetworkList();
      Assert.assertEquals("This is needed for this", f.generateReport(),
         f.generateReport());
   }
   
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testgenerateReportName() {
      WirelessNetworkList h = new WirelessNetworkList();
   
      Assert.assertEquals("This is the move", h.generateReportByName(),
         h.generateReportByName());
   
   
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testgenerateReportByBandwidth() {
      WirelessNetworkList i = new WirelessNetworkList();
      Assert.assertEquals("This is it ", i.generateReportByBandwidth(),
         i.generateReportByBandwidth());
   
   
   
   }
   
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void testgenerateReportByMonthlyCost() {
      WirelessNetworkList j = new WirelessNetworkList();
      Assert.assertEquals("This is it ", j.generateReportByMonthlyCost(),
         j.generateReportByMonthlyCost());
   
   
   
   }
   
   
   
   
   
}
