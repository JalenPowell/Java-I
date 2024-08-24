import java.util.Scanner; //First Line Of Code, Even Before Class
import java.text.DecimalFormat ;
/**
*
*Icosahedron
*@author Jalen Powell
*@version 6/6/19
*/

public class icosahedron {

   
   private String label = " ";
   private String color = " ";
   private double edge = 0;
      
 /**
 *
 *Configuring the constructors, methods, and fields to describe Icosahedron 
 *@param labelIn = used
 *@param colorIn = used
 *@param edgeIn = used
 */
       
   public icosahedron(String labelIn, String colorIn, double edgeIn) {
      setlabel(labelIn);
      color = colorIn ;
      edge = edgeIn ;
        
   }
   /**
   *getting label and returning label
   *@return label
   *
   */   
   public String getLabel() {
      return label ;
        
   }
   /*
   *getting and returning color
   *@return color
   */
   public String getColor() {
      return color ;
        
   }
   /*
   *
   *Getting and returning the double edge
   *@return edge
   */
   public double getEdge() {
      return edge ;
        
   }
    /*
    *
    *Utilizing a boolean statement to set and define label
    *Trimming the extra spaces in the resulting statement
    *@param labelIn - Used
    *setlabel
    */    
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      label = labelIn.trim();
      return true;
   }
   /*
   *Utilizing a boolean statement to set and define label
   *Trimming the extra spaces in the resulting statement
   *@param colorIn -used
   *setcolor
   */
   
   public boolean setColor(String colorIn) {
      if (colorIn == null) {
         return false;
      }
      color = colorIn.trim();
      return true;
   }
   /*
   *Utilizing a boolean statement to set and define label
   *Trimming the extra spaces in the resulting statement
   *@param edgeIn - used
   *setedge
   */
        
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   /*
   *assigning and setting the formula for surface area to its variable
   *@return sA 
   *
   */    
   public double surfaceArea() {
      double sA = 0;
      sA = 5 * Math.sqrt(3) * Math.pow(edge,2);
      return sA;
        
   } 
   /*
   *assigning and defining the volume formula to its variable
   *@return v
   */
        
   public double volume() {
      double v = 0;
      v = (5 *(3 + Math.sqrt(5))) / 12 * (Math.pow(edge, 3));
      return v;
   }
   /*
   *assigning and defining the formula for surface area to voulume ratio to its variable 
   *@return sTVR
   */     
   public double surfaceToVolumeRatio() {
      double sTVR = 0;
      sTVR = surfaceArea() / volume();
      return sTVR;
   }
   /*
   *setting and writing out the equations for the constructors and the equation for the values to be substitued into
   *@return output
   */
        
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#, ##0.0#####");
      String output = "Icosahedron \"" + label + "\" is \"" + color + "\" with 30 edges of length " + edge + " units." ;
      output += "\n\tsurface area = " + df1.format(surfaceArea()) + " square units. " ;
      output += "\n\tvolume = " + df1.format(volume()) + " cubic units. " ;
      output += "\n\tsurface/volume ratio = " + df1.format(surfaceToVolumeRatio()) ;
      return output;
      
   
   }

}

