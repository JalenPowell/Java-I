import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
  *
  *
  *
  */
public class IceCreamConeListApp {
 /**
   *
   *
   *
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<IceCreamCone> myList = new ArrayList<IceCreamCone>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String IceCreamConeListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String labelIn = scanFile.nextLine();
         double radiusIn = scanFile.nextDouble();
         double heightIn = scanFile.nextDouble();
      
         IceCreamCone ICC = new IceCreamCone(labelIn, radiusIn, heightIn);
         myList.add(ICC);
      }
      scanFile.close();
      
      IceCreamConeList myIccList = new IceCreamConeList(IceCreamConeListName, myList);
      
      System.out.println(myIccList);
      
      System.out.println(myIccList.summaryInfo());
   } 
}