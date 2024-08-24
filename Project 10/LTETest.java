import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** A test that always fails. **/
   @Test public void wireLessNetworkTest() {
      LTE g = new LTE("teresa", 450, 40.00, 1200, 1);
   
   
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
      
      
      
     /**
     Cellular Test Cases
     */
      LTE f = new LTE("teresa", 450, 40.00, 1200, 1);
      f.setTime(1200);
      Assert.assertEquals("get time", 1200, f.getTime(), .000001);
      f.setDataLimit(1);
      Assert.assertEquals("get DataLimit", 1, f.getDataLimit(), .00000001);
      Assert.assertEquals("dataUsage", 67.5, f.dataUsage(), .000001);
      LTE b = new LTE("teresa", .00001, 40.00, 1200, 67.5);
   
      /**
      Assert.assertEquals("monthlyCost", 40, b.monthlyCost(), .0000001);
      LTE as = new LTE("teresa", .00001, 40.00, 1200, 67.5);
      Assert.assertEquals("monthly Cost equals", 40, b.monthlyCost(),
         .0000001);
      LTE c = new LTE("teresa", 450, 40.00, 1200, 200);
   
      Assert.assertEquals("monthly Cost doest satisfy", 67.5,
         c.dataUsage(), .0000001);
         */
         
         
         
           
      Assert.assertEquals("monthlyCost", 40, b.monthlyCost(), .0000001);
      LTE as = new LTE("teresa", 700, 40.00, 1200, 10.0); //g
      LTE  d = new LTE("teresa", 8000, 60.00, 1.0, 1.0); //e
   
      Assert.assertEquals("monthly Cost equals", 60, d.monthlyCost(),
         .0000001);
      LTE  c = new LTE("teresa", 450, 40.00, 1200, 200); //l
   
      Assert.assertEquals("monthly Cost doest satisfy", 40,
         c.monthlyCost(), .0000001);
        
   
      Assert.assertEquals("monthly Cost doest satisfy", 800.0,
         as.monthlyCost(), .0000001);
   
      
      Assert.assertFalse(c.toString().contains("mbps"));
      Assert.assertTrue(c.toString().contains("Mbps")); 
     
   }
   
   /**
   *Test LTe.
   */
   
   @Test public void testLte() {
   
      LTE c = new LTE("teresa", 450, 40.00, 1200, 1);
      Assert.assertFalse(c.toString().contains("mbps"));
      Assert.assertTrue(c.toString().contains("Mbps")); 
   
   
   
   }
}
