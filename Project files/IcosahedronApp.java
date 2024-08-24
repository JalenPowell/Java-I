import java.util.Scanner; //First Line Of Code, Even Before Class
/**
*
*Icosahedron
*assigning the Strings and constuctors to printed statements 
*@author Jalen Powell
*@version 6/6/19
*/
public class IcosahedronApp {
/*
*assigning the Strings and constuctors to printed statements 
*Error messeage for when edge is less than 0
*@param args not used
*/
   public static void main(String args[]) {
      String label ;
      String color;
      double edge;
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter label, color, and edge length for an icosahedron.");
      System.out.print("\tlabel: ");
      label = scan.nextLine(); 
      System.out.print("\tcolor: ") ;
      color = scan.nextLine();
      System.out.print("\tedge: ");
      edge = scan.nextDouble();
      if (edge <= 0) { 
         System.out.print("Error: edge must be greater than 0."); 
      }
      else {
         icosahedron jalen = new icosahedron(label, color, edge);
         System.out.print("\n"+jalen) ;
      }
   }
}