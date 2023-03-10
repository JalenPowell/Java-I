import java.text.DecimalFormat;
/**
 *This program will find the surface area and volume of a ice cream cone.
 *
 *@author Jalen Powell
 *@version 9/18/19
 */
public class IceCreamCone {
   private String label = "";
   private double radius = 0;
   private double height = 0;
   /**
     *Configuring the constructors, methods, and fields to describe the cone. 
     *@param labelIn = used
     *@param radiusIn = used
     *@param heightIn = used
     */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn) {
      if (labelIn == null) {
         labelIn = label;
      }
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
          /**
         *getting label and returning label.
         *@return label
         *
         */   
   public String getLabel() {
      return label;
   }
    /**
      *getting and returning the double radius.
      *@return radius
      */
   public double getRadius() {
      return radius;
   }
    /**
   *
   *Getting and returning the double height.
   *@return edge
   */
   public double getHeight() {
      return height;    
   }
   /**
    *
    *Utilizing a boolean statement to set and define label.
    *Trimming the extra spaces in the resulting statement
    *@param labelIn - Used
    *@return true, false
    */    
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      label = labelIn.trim();
      return true;
   }
    /**
      *Utilizing a boolean statement to set and define radius.
      *@param radiusIn -used
      *@return true, false
      */
   
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      return false;
   }
   /**
   *Utilizing a boolena statement to set and efine height.
   *@param heightIn - used
   *@return true, false
   */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      return false;
   }
    /**
      *assigning and setting the formula for surface area to its variable.
      *@return cA 
      */    
   public double coneSideArea() {
      double cA = 0;
      cA = Math.PI * radius * Math.sqrt(Math.pow(height, 2) 
               + Math.pow(radius, 2));
      return cA;
   } 
   /**
    *assigning and setting the formula for the hemisphere area to a variable.
    *@return hA
    */
   public double hemisphereArea() {
      double hA = 0;
      hA = 2 * Math.PI * Math.pow(radius, 2);
      return hA;
   }
   /**
   *assigning and setting the formula for the surface area to its variable.
   *@return sA
   */
   public double surfaceArea() {
      double sA = 0;
      sA = coneSideArea() + hemisphereArea();
      return sA;
   }
   /**
    *assigning the cone volume to its variable.
    *@return cV
    */
   public double coneVolume() {
      double cV = 0;
      cV = height * Math.PI * Math.pow(radius, 2) / 3;
      return cV;
   }
   /**
    *assigning the hemisphere volume to its variable.
    *@return hV
    */
   public double hemisphereVolume() {
      double hV = 0;
      hV = 2 * Math.PI * Math.pow(radius, 3) / 3;
      return hV;
   }
   /**
    *assigning the volume to its variable.
    *@return V
    */
   public double volume() {
      double v = 0;
      v = coneVolume() + hemisphereVolume();
      return v;
   }
   /**
     *Declares the equals.
     *@param obj used
     *@return used
     */
   public boolean equals(Object obj) {          
      if (!(obj instanceof IceCreamCone)) {          
         return false;       }      
      else {         
         IceCreamCone icc = (IceCreamCone) obj;                
         return (label.equalsIgnoreCase(icc.getLabel())                       
            && Math.abs(radius - icc.getRadius()) < .000001                      
            && Math.abs(height - icc.getHeight()) < .000001);      
      }    
   } 
   /**
    *setting and writing out the equations as strings.
    *@return output
    */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0######");
      String output = "IceCreamCone \"" + label + "\" with radius = "
         + radius + " and height = " + height + " units has: ";
      output += "\n\tsurface area = " + df1.format(surfaceArea()) 
         + " square units.";
      output += "\n\tvolume = " + df1.format(volume()) + " cubic units.";
      return output;
   }

}