import java.util.ArrayList;
/**
  *This program does the thing with temp.
  *Jalen Powel
  *10/7/19
  */
public class Temperatures {
   private ArrayList<Integer>temperatures;
 /**
   *This alos does something with temperature.
   *@param temperaturesIn used
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**
     *Get the Low Temperature.
     *@return 0, low used
     */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
     *Gets the high temperature.
     *@return 0, high used
     */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
     *Sets the lower Minimum.
     *@param lowIn used
     *@return lowIn
     */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
     *Sets higer Maximum.
     *@param highIn Used
     *@return highIn
     */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
     *Prints out result.
     *@return String
     */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}