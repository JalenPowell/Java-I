import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
  *This Program makes a list of ice cream cones.
  *Jalen Powell
  *10/15/19
  */
public class IceCreamConeList2 {
   private String listName;
   private IceCreamCone[] coneList;
   private int numberOfCones;
/**
*This also does something.
*@param listNameIn used 
*@param coneListIn used
*@param numberOfConesIn used
*/
   public IceCreamConeList2(String listNameIn, 
               IceCreamCone[] coneListIn, int numberOfConesIn) {
      listName = listNameIn;
      coneList = coneListIn;
      numberOfCones = numberOfConesIn;
   }
   /**
     *Gets the name of file.
     *@return listName
     */
   public String getName() {
      return listName;
   }
   /**
     *Shows number of IceCreamCones.
     *@return coneList.size
     */
   public int numberOfIceCreamCones() {
      return numberOfCones;
   }
   /**
     *Calculates total surface area.
     *@return total
     */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < numberOfCones) {
         total += coneList[index].surfaceArea();
         index++;
      }
      return total;
   }
   /**
     *Calculate total volume.
     *@return volume
     */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < numberOfCones) {
         total += coneList[index].volume();
         index++;
      }
      return total;
   }
   /**
     *Calculate the average surface area.
     *@return total
     */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < numberOfCones) {
         total += coneList[index].surfaceArea() / numberOfCones;
         index++;
      }
      return total;
   }
   /**
     *calculate the average volume.
     *@return total
     */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < numberOfCones) {
         total += coneList[index].volume() / numberOfCones;
         index++;
      }
      return total;
   }
   /**
     *Prints toString.
     *@return result
     */
   public String toString() {
      String result =  getName() + "\n";
      int index = 0;
      while (index < numberOfCones) {
         result += "\n" + coneList[index] + "\n";
         index++;
      }
      return result;
   }
   /**
     *Prints the summary.
     *@return result
     */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of IceCreamCone Objects: " 
               + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
   
      return result;
   }  
   /**
     *This does the thing.
     *@return coneList
     */
   public IceCreamCone[] getList() {
      return coneList;
   }
   /**
     *does a few things.
     *@param fileNameIn used
     *@return new IceCreamConeList used
     *@throws FileNotFoundException used
     */
   public IceCreamConeList2 readFile(String fileNameIn) 
                                             throws FileNotFoundException {
   
      Scanner scanFile = new  Scanner(new File(fileNameIn));
      IceCreamCone[] myConeList = new IceCreamCone[100];
      listName = scanFile.nextLine();
      int numCones = 0;
      
      while (scanFile.hasNext()) {
         String label =  scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         IceCreamCone cone = new IceCreamCone(label, radius, height);
         myConeList[numCones] = cone;
         numCones++;
      }
      //scanFile.close();
      IceCreamConeList2 iccList = new IceCreamConeList2(listName, 
                           myConeList, numCones);
      return iccList;
   }
   /**p/
     *Adds a new IceCreamCone.
     *@param label used
     *@param height used
     *@param radius used
     */
   public void addIceCreamCone(String label, double radius, double height) {
      IceCreamCone cone = new IceCreamCone(label, radius, height);
      coneList[numberOfCones] = cone;
      numberOfCones++;
   }
   /**
     *Finds the IceCreamCone.
     *@param label used
     *@return cone, null used
     */
   public IceCreamCone findIceCreamCone(String label) {
      for (int i = 0; i < numberOfCones; i++) {
         if (coneList[i].getLabel().equalsIgnoreCase(label)) {
            return coneList[i];
         }
      }
   
      return null;
   }
   /**
     *Deletes a IceCreamCone.
     *@return null, deletedCone used
     *@param label used
     */
   public IceCreamCone deleteIceCreamCone(String label) {
      IceCreamCone deletedCone = null;
      
      for (int i = 0; i < numberOfCones; i++) {
         if (coneList[i].getLabel().equalsIgnoreCase(label)) {
            deletedCone = coneList[i];
            for (int j = i; j < numberOfCones; j++) {
               coneList[j] = coneList[j + 1];
            }
            coneList[numberOfCones - 1] = null;
            numberOfCones--;
            break;
         }
      }
      return deletedCone;
   }
   
   
   /**
     *Edits the IceCreamCone.
     *@param label used
     *@param radius used
     *@param height used
     *@return true, false used
     */
   public boolean editIceCreamCone(String label, double radius, double height) {
      IceCreamCone editedCone = findIceCreamCone(label);
   
      if (editedCone != null) {
         editedCone.setRadius(radius);
         editedCone.setHeight(height);
      
         return true;
      }
      else {
         return false;
      }
   }  
}
