
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
  *This program does the thing.
  *Jalen Powell
  *10/14/2019
  */
public class IceCreamConeList2MenuApp {
   /**
     *This program does the thing.
     *@param args Command Lines not used
     *@throws FileNotFoundException used
     */
   public static void main(String[] args) throws FileNotFoundException {
      
      String listName = "";
      IceCreamCone[] myConeList = new IceCreamCone[100];
      String fileName = "";
      String input = "";
      String label = "";
      double radius, height = 0;
      Scanner userInput = new Scanner(System.in);
      char choice = 'Q';
      
      IceCreamConeList2 myConeList2 = new IceCreamConeList2(listName, 
         myConeList, 0);
      
      System.out.println("IceCreamCone List System Menu"
                                             + "\nR - Read File and Create "
                                                   + "IceCreamCone List"
                                             + "\nP - Print IceCreamCone List"
                                             + "\nS - Print Summary" + "\nA - "
                                                   + "Add IceCreamCone"
                                             + "\nD - Delete IceCreamCone"
                                             + "\nF - Find IceCreamCone"
                                             + "\nE - Edit IceCreamCone"
                                             + "\nQ - Quit");
   
      do {
         System.out.print("Enter Code "
                                       + "[R, P, S, A, D, F, E, or Q]: ");
         input = userInput.nextLine().toUpperCase();
      
         if (input.length() == 0) {
            continue;
         }
      
         choice = input.charAt(0);
         switch (choice) {
         
            case 'R' :
               System.out.print("\tFile Name: ");
               fileName = userInput.nextLine();
               
               myConeList2 = myConeList2.readFile(fileName);
               
               System.out.println("\tFile read in and "
                              + "IceCreamCone List created\n");
               break;
         
            case 'P' :
               System.out.print(myConeList2 + "\n");
               break;
         
            case 'S' :
               
               System.out.println();
               System.out.println(myConeList2.summaryInfo());
               System.out.println();
               break;
         
            case 'A' :
               System.out.print("\tLabel: ");  
               label = userInput.nextLine();
            
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
            
               myConeList2.addIceCreamCone(label, radius, height);
               System.out.print("\t*** IceCreamCone added ***\n");
               break;
         
            case 'D' :
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
            
               if (myConeList2.findIceCreamCone(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
               else {
                  IceCreamCone cone = myConeList2.deleteIceCreamCone(label);
                  System.out.println("\t\"" + cone.getLabel() + "\" deleted\n");
                  break;
               }
               
            case 'F' :
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
            
               if (myConeList2.findIceCreamCone(label) != null) {
                  System.out.println(myConeList2
                                     .findIceCreamCone(label) + "\n");
                  break;
               }
               else {
                  System.out.println("\t\"" + label
                                                     + "\" not found\n");
                  break;
               }
            case 'E' :
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               if (myConeList2.findIceCreamCone(label) != null) {
                  myConeList2.editIceCreamCone(label, radius, height);
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label
                                                     + "\" not found\n");
               }
               break;
               
            case 'Q' :
               break; 
            default :
               System.out.print("\t*** invalid code ***\n\n");
               break;
         }
      } while (choice != 'Q');
   }
}
