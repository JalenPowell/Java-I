import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
 /**
*@Author: Jalen Powell
*/

public class BandwidthComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void bandwidthTest() {
      Cellular n = new Cellular("hola", 3, 6, 9, 12);
      Cellular na = new Cellular("ha", 4, 8, 12, 15);
      Cellular j = new Cellular("hola", 4, 2, 6, 8);
      BandwidthComparator emP = new BandwidthComparator();
      Assert.assertEquals("Error", -1, emP.compare(n, na));
      Assert.assertEquals("Error", -1, emP.compare(n, j));
      Assert.assertEquals("Error", 0, emP.compare(na, j));
   
   }
   
}
