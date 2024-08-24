import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
*@Author: Jalen Powell
*/
public class MonthlyCostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      Cellular nh = new Cellular("na", 3, 6, 9, 12);
      Cellular bb = new Cellular("hola", 4, 8, 12, 16);
      Cellular kk = new Cellular("ha", 5, 10, 15, 20);
      Cellular zz = new Cellular("hola", 4, 8, 12, 16);
      MonthlyCostComparator fmp = new MonthlyCostComparator();
         
      Assert.assertEquals("Error", -1, fmp.compare(bb, nh));
      Assert.assertEquals("Error", 1, fmp.compare(bb, kk));
      Assert.assertEquals("Error", 0, fmp.compare(bb, zz));
   }
}
