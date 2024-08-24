import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** A test that always fails. **/
   @Test public void modemCostTestandWireLessNetWorkTests() {
      WiFi g = new WiFi("teresa", 450, 40.00, 5.00);
      g.setModemCost(10.00);
      Assert.assertEquals("get modem cost",  10.00, g.getModemCost(), .000001);
      g.setName("teresa");
      Assert.assertEquals("getName", "teresa", g.getName());
      g.setBandwidth(450);
      Assert.assertEquals("get bandwidth", 450, g.getBandwidth(), .000001);
      g.setMonthlyFixedCost(40);
      Assert.assertEquals("getMonthlyFixedCost", 
         40, g.getMonthlyFixedCost(), .000001);
      g.resetCount();
      Assert.assertEquals("get the Count", 0, g.getCount(), .0000001);
      Assert.assertTrue("teresa", g.toString().contains("teresa"));
      Assert.assertFalse("nope", g.toString().contains("nope"));
   
      
     
   }
   
   
    /**
     Cellular Test Cases.
     */
   @Test public void continuationOftheWIFITest() {
      WiFi f = new WiFi("teresa", 450, 40.00, 5.00);
      Assert.assertEquals("MonthlyCost", 45, f.monthlyCost(), .000001);
   }


}

