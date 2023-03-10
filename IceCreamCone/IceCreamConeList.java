import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
  *This Program makes a list of ice cream cones.
  *Jalen Powell
  *10/15/19
  */
public class IceCreamConeList {
   private String listName;
   private ArrayList<IceCreamCone>coneList;
/**
*This also does something.
*@param listNameIn used 
*@param coneListIn used
*/
   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone>
                                                                   coneListIn) {
      listName = listNameIn;
      coneList = coneListIn;
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
      return coneList.size();
   }
   /**
     *Calculates total surface area.
     *@return total
     */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).surfaceArea();
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
      while (index < coneList.size()) {
         total += coneList.get(index).volume();
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
      while (index < coneList.size()) {
         total += coneList.get(index).surfaceArea() / coneList.size();
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
      while (index < coneList.size()) {
         total += coneList.get(index).volume() / coneList.size();
         index++;
      }
      return total;
   }
   /**
     *Prints toString.
     *@return result
     */
   public String toString() {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < coneList.size()) {
         result += "\n" + coneList.get(index) + "\n";
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
      result += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + totalSurfaceArea();
      result += "\nTotal Volume: " + totalVolume();
      result += "\nAverage Surface Area: " + averageSurfaceArea();
      result += "\nAverage Volume: " + averageVolume();
   
      return result;
   }  
   /**
     *This does the thing.
     *@return coneList
     */
   public ArrayList<IceCreamCone>getList() {
      return coneList;
   }
   /**
     *does a few things.
     *@param fileNameIn used
     *@return new IceCreamConeList used
     *@throws FileNotFoundException used
     */
   public IceCreamConeList readFile(String fileNameIn) 
                                             throws FileNotFoundException {
   
      Scanner scanFile = new  Scanner(new File(fileNameIn));
      ArrayList<IceCreamCone> coneList2 = new ArrayList<IceCreamCone>();
      String nameOfList = scanFile.nextLine();
      int i = 0;
      while (scanFile.hasNext()) {
         String label =  scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         IceCreamCone cone = new IceCreamCone(label, radius, height);
         coneList2.add(cone);
         i++;
      }
      
      return new IceCreamConeList(nameOfList, coneList2);
   }
   /**
     *Adds a new IceCreamCone.
     *@param label used
     *@param height used
     *@param radius used
     */
   public void addIceCreamCone(String label, double radius, double height) {
      IceCreamCone cone = new IceCreamCone(label, radius, height);
      coneList.add(cone);
   }
   /**
     *Finds the IceCreamCone.
     *@param label used
     *@return cone, null used
     */
   public IceCreamCone findIceCreamCone(String label) {
      for (IceCreamCone cone : coneList) {
         if (cone.getLabel().equalsIgnoreCase(label)) {
            return cone;
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
      deletedCone = findIceCreamCone(label);
   
      if (deletedCone != null) {
         int index = 0;
         index = coneList.indexOf(deletedCone);
         coneList.remove(index);
      }
      else {
         return null;
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
