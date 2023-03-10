import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
  *This program poops.
  *Jalen Powell
  *10/4/19
  */
public class IceCreamConeListApp {
 /**
   *This methods also poops.
   *@param args Command Lines not used
   *@throws FileNotFoundException used
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<IceCreamCone> myList = new ArrayList<IceCreamCone>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String iceCreamConeListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String labelIn = scanFile.nextLine();
         double radiusIn = Double.parseDouble(scanFile.nextLine());
         double heightIn = Double.parseDouble(scanFile.nextLine());
      
         IceCreamCone iCC = new IceCreamCone(labelIn, radiusIn, heightIn);
         myList.add(iCC);
      }
      scanFile.close();
      
      IceCreamConeList myIccList =
          new IceCreamConeList(iceCreamConeListName, myList);
      
      System.out.println("\n" + myIccList);
      
      System.out.println("\n" + myIccList.summaryInfo());
   } 
}