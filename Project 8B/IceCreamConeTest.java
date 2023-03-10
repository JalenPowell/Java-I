import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /**
* Test.
*
      * Project 08A-B    @author Jalen Powell
* @version 10/24/2019
*/ 
public class IceCreamConeTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
        /** A test of getters. **/
   @Test public void gettersTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      
      Assert.assertEquals("green", i.getLabel());
                           
      Assert.assertEquals(1, i.getRadius(), .000001);
                           
      Assert.assertEquals(2, i.getHeight(), .000001);
   }
   
   /** A test of setLabel. **/
   @Test public void setLabelTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      i.setLabel("green");
      Assert.assertEquals("setLabel test", "green", i.getLabel());
      
      IceCreamCone i2 = new IceCreamCone("green", 1, 2);
      i2.setLabel("poop");
      Assert.assertEquals("setLabel false test", false, i2.setLabel(null));
   
   }
   
   /** A test of setRadius. **/
   @Test public void setRadiusTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertTrue("setRadius test", i.setRadius(3));
      
      IceCreamCone i2 = new IceCreamCone("green", 1, 2);
      Assert.assertFalse("setRadius false test", i2.setRadius(-1));
   }
   
   /** A test of setHeight. **/
   @Test public void setHeightTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertTrue("setHeight test", i.setHeight(4));
      
      IceCreamCone i2 = new IceCreamCone("green", 1, 2);
      Assert.assertFalse("setRadius false test", i2.setHeight(-1));
   }
   
   /** A test of coneSideAreaTest. **/
   @Test public void coneSideAreaTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals(" coneSideArea test", 
         Math.PI * 1 * Math.sqrt(Math.pow(2, 2) 
         + Math.pow(1, 2)), i.coneSideArea(), .000001);
      
   }
   
   /** A test of hemisphereAreaTest. **/
   @Test public void hemisphereAreaTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals("hemisphereArea test",
         2 * Math.PI * Math.pow(1, 2), i.hemisphereArea(), .000001);
      
   }
   /** A test of surfaceAreaTest. **/
   @Test public void surfaceAreaTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals("surfaceArea test",
         i.coneSideArea() + i.hemisphereArea(), i.surfaceArea(), .000001);
      
   }
   /** A test of coneVolumeTest. **/
   @Test public void coneVolumeTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals("coneVolume test",
         2 * Math.PI * Math.pow(1, 2) / 3, i.coneVolume(), .000001);
      
   }
   /** A test of hemisphereVolumeTest. **/
   @Test public void hemisphereVolumeTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals("hemisphereVolume test",
         2 * Math.PI * Math.pow(1, 3) / 3, i.hemisphereVolume(), .000001);
      
   }
   
   /** A test of volumeTest. **/
   @Test public void volumeTest() {
      IceCreamCone i = new IceCreamCone("green", 1, 2);
      Assert.assertEquals("volume test", 
         i.coneVolume() + i.hemisphereVolume(), i.volume(), .000001);
      
   }
   
   /** A test of toStringTest. **/
   @Test public void toStringTest() {
      IceCreamCone i = new IceCreamCone("green", 3, 4);
      Assert.assertEquals("toString test", true, 
                                       i.toString().contains("radius"));
      
   }

  /** A test of getResetCountTest. **/
   @Test public void getresetCountTest() {
      IceCreamCone a = new IceCreamCone("green", 1, 2);
      a.resetCount();
      IceCreamCone i = new IceCreamCone("green", 1, 2);
   
      Assert.assertEquals("getCount test", 1, i.getCount());
      
   }
   /** A test of equalsTest and hashCode. **/
   @Test public void equalsTest() {
   
      IceCreamCone i = new IceCreamCone("green", 10, 7);
      String d = "";
      IceCreamCone a = i;
      
      Assert.assertTrue("equals test", i.equals(a));
      Assert.assertFalse("equals test", i.equals(d));
     
      IceCreamCone b = new IceCreamCone("green", 10, 8);
      Assert.assertFalse(i.equals(b));
      
      IceCreamCone c = new IceCreamCone("green", 5, 8);
      Assert.assertFalse(i.equals(c));
     
      IceCreamCone e = new IceCreamCone("yellow", 5, 8);
      Assert.assertFalse(i.equals(e));
      
      Assert.assertEquals("equals false test",
                        0, i.hashCode());
      
   }

}
